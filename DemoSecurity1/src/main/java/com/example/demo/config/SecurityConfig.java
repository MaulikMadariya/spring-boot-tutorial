package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
		
		UserDetails user = User.withUsername("Maulik").password(passwordEncoder.encode("Maulik")).roles("user").build();
		UserDetails admin = User.withUsername("MB").password(passwordEncoder.encode("MB")).roles("admin").build();
		
		return new InMemoryUserDetailsManager(user , admin);
	}
	
	@Bean
	public PasswordEncoder encoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception 
	{
		return http.authorizeHttpRequests(
				auth -> auth
				.antMatchers("/")
				.permitAll()
				.antMatchers("/user/**")
				.hasRole("user")
				.antMatchers("/admin/**")
				.hasRole("admin")
		).formLogin(
				formLogin -> formLogin.permitAll()
				).build();
				
	}
}
