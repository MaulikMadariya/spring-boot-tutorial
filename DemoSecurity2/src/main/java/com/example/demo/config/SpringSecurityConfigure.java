package com.example.demo.config;

import java.beans.Customizer;

import org.springframework.beans.factory.annotation.Value;
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

@EnableWebSecurity
@Configuration
public class SpringSecurityConfigure {

	@Value("${name}")
	private String[] name;

	@Value("${pass}")
	private String[] pass;

	@Value("${role}")
	private String[] role;

	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {

		UserDetails admin = null;
		for (int i = 0; i < name.length; i++) {
			admin = User.withUsername(name[i]).password(passwordEncoder.encode(pass[i])).roles(role[i]).build();
		}

//		UserDetails admin = User.withUsername("mb").password(passwordEncoder.encode("mb")).roles("admin").build();
//		UserDetails user = User.withUsername("user").password(passwordEncoder.encode("user")).roles("user").build();

		return new InMemoryUserDetailsManager(admin);
	}

	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain security(HttpSecurity httpSecurity) throws Exception {
		return httpSecurity.authorizeHttpRequests(auth -> auth.antMatchers("/").permitAll().antMatchers("/admin/**")
				.hasRole("admin").antMatchers("/user/**").hasRole("user") 

		).formLogin(formlogin -> formlogin.permitAll()).build();
	}
}
