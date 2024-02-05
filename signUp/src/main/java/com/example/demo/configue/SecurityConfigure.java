package com.example.demo.configue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.example.demo.service.CustomUserDetailsService;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SecurityConfigure extends WebSecurityConfigurerAdapter {

	@Autowired
	private CustomUserDetailsService customUserDetailsService;

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public DaoAuthenticationProvider provider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(customUserDetailsService);
//		System.out.println(customUserDetailsService);
		provider.setPasswordEncoder(passwordEncoder());
//		System.err.println();
		return provider;
	}

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf(csrf -> csrf.disable());

		httpSecurity.authorizeHttpRequests(
				req -> req
				/*.anyRequest()
				.authenticated());*/
				.antMatchers("/student/user")
				.hasAnyAuthority("user")
				.antMatchers("/student/admin")
				.hasAnyAuthority("admin"));

		httpSecurity.formLogin(
				login -> login
				.loginPage("/student/login")
				.loginProcessingUrl("/login")
				.successHandler(new CustomAuthenticationSuccessHandler())
				.permitAll());

		httpSecurity.logout(
				logout -> logout
				.invalidateHttpSession(true)
				.clearAuthentication(true)
				.logoutRequestMatcher(new AntPathRequestMatcher("/student/logout"))
				.logoutSuccessUrl("/student/login")
				.permitAll());

	}
}
