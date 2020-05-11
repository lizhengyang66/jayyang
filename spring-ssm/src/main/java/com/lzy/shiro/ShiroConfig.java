package com.lzy.shiro;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Shiro的配置类
 * @author Administrator
 *
 */
@Configuration
public class ShiroConfig {
	/**
	 * ShiroFilterFactoryBean
	 */
	@Bean
	public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager")DefaultWebSecurityManager securityManager) {
		ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
		
		//设置安全管理器
		shiroFilterFactoryBean.setSecurityManager(securityManager);
		
		//添加Shiro内置过滤器
		/*
		 * Shiro内置过滤器，可以实现权限相关的拦截器
		 * 常用的过滤器
		 * anon:无序认证（登录）可以访问
		 * auth：必须认证才可以访问
		 * perms:该资源必须得到资源权限才可以访问
		 * role：该资源必须得到角色权限才可以访问
		 */
		//shiro过滤器
		Map<String, String> filterMap=new LinkedHashMap<String, String>();
		//filterMap.put("/add", "authc");
		//放行
		filterMap.put("/gologin", "anon");
		//放行login.html页面
		filterMap.put("/login2", "anon");
		//filterMap.put("/hell", "anon");
		//授权过滤器
		//filterMap.put("/add", "perms[user:add]");
		//拦截
		filterMap.put("/*", "authc");
		//修改跳转的页面
		shiroFilterFactoryBean.setLoginUrl("/gologin");
		//设置未授权提示页面
		//shiroFilterFactoryBean.setUnauthorizedUrl("/noAuth");
		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
		return shiroFilterFactoryBean;
		
	}
	
	
	/**
	 * 创建DefaultWebSecurityManager
	 */
	@Bean(name="securityManager")
	public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm")UserRealm userRealm) {
		DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();
		//关联realm
		securityManager.setRealm(userRealm);
		return securityManager;
		
	}
	
	/**
	 * 创建Realm
	 */
	@Bean(name="userRealm")
	public UserRealm getRealm() {
		return new UserRealm();
		
	}

}
