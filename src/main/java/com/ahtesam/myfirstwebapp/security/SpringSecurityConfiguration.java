package com.ahtesam.myfirstwebapp.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {

	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		UserDetails userDetail1 = createNewUser("ahtesam", "1234");
		UserDetails userDetail2 = createNewUser("alberto", "1234");
		
		
		return new InMemoryUserDetailsManager(userDetail1,userDetail2);
	}

	private UserDetails createNewUser(String username, String password) {
		Function<String, String> passwordEncoder
		= input -> passwordEncoder().encode(input);
		
		UserDetails userDetails = User.builder()
				.passwordEncoder(passwordEncoder)
				.username(username)
				.password(password )
				.roles("USER","ADMIN")
				.build();
		return userDetails;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
