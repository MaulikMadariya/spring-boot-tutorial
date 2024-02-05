package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
//@EnableMethodSecurity
public class SecurityConfig {

//	@Bean	
//	public UserDetailsService detailsService()
//	{
//		UserDetails user = User.withUsername("user").password(encoder().encode("1234")).roles("USER").build();
//		UserDetails admin = User.withUsername("admin").password(encoder().encode("1234")).roles("ADMIN").build();
//		return new InMemoryUserDetailsManager(user,admin);
//	}
//	
//	@Bean
//	public PasswordEncoder encoder()
//	{
//		return new BCryptPasswordEncoder();
//	}

	@Bean
	public UserDetailsService customStudentService1() {
		return new CustomStudentService();
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(customStudentService1());
		authenticationProvider.setPasswordEncoder(passwordEncoder());
		return authenticationProvider;
	}

	@Bean
	public SecurityFilterChain chain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable().authorizeHttpRequests().requestMatchers("/index").permitAll().anyRequest()
				.authenticated().and().formLogin();
		return httpSecurity.build();
	}
}
