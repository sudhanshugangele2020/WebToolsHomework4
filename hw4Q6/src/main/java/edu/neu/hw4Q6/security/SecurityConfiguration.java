package edu.neu.hw4Q6.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

@Configuration
@EnableWebSecurity
@ComponentScan
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	
	@Bean
	public PasswordEncoder passwordEncoder() { 
	    return new StandardPasswordEncoder(); 
	}

	//Create our users Sudhanshu and password Dummy
	
	@Autowired
	public void configure(AuthenticationManagerBuilder auth)
	 throws Exception{
		auth.inMemoryAuthentication()
		.withUser("sudhanshu").password(passwordEncoder().encode("password"))
		.roles("USER");
	}
	
	//Unauthorized inauthenticated person to get login form  
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/login").permitAll()
		.antMatchers("/").access("hasRole('USER')")
		.antMatchers("/books.htm").access("hasRole('USER')")
		.antMatchers("/addselection.htm").access("hasRole('USER')")
		.antMatchers("/viewcart.htm").access("hasRole('USER')")
		.antMatchers("/music.htm").access("hasRole('USER')")
		.antMatchers("/computers.htm").access("hasRole('USER')")
		.and().formLogin()
		.and().csrf().disable();
	}
}
