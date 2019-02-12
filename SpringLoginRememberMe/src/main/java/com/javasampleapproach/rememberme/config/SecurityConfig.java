package com.javasampleapproach.rememberme.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated()
						.and()
							.formLogin()
								.loginPage("/login")
								.permitAll()
						.and()
							.rememberMe()
								.rememberMeCookieName("rememberme-cookie")
								.tokenValiditySeconds(24 * 60 * 60)
								.key("uniqueAndSecret")
						.and()
							.logout()
							.deleteCookies("JSESSIONID")
							.permitAll();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("admin").roles("USER");
	}
}