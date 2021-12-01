package com.CMS.CentralParam.KKBSK.config;

import com.CMS.CentralParam.security.services.AuthenticationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebSecurity
public class SecurityConfig implements WebMvcConfigurer {

// 	@Override
// 	protected void configure(HttpSecurity http) throws Exception {
// 		http.exceptionHandling().accessDeniedPage("/403");
// 		http
// 				.authorizeRequests()
// 					.antMatchers("/css/**", "/").permitAll()
// 					.antMatchers("/user/**").hasRole("USER")
// 					.and()
// 				.formLogin().loginPage("/login").failureUrl("/login-error").defaultSuccessUrl("/index").permitAll().and().logout().invalidateHttpSession(true)
// 				.clearAuthentication(true).logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
// 				.logoutSuccessUrl("/login?logout").permitAll();
// 	}
	
	
// 	@SuppressWarnings("deprecation")
// 	@Autowired
// 	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
// 		auth
// 			.inMemoryAuthentication()
// 				.withUser(User.withDefaultPasswordEncoder().username("20190325").password("gans").roles("USER"));
// 		auth
// 			.inMemoryAuthentication()
// 				.withUser(User.withDefaultPasswordEncoder().username("20190325").password("admin").roles("ADMIN"));
// 	}
// }



@Autowired
private CustomAuthenticationSuccessHandler successHandler;
private AuthenticationService authenticationService;

@Autowired
public void setAuthenticationService(AuthenticationService authenticationService){
	this.authenticationService = authenticationService;
}



@Bean
public WebSecurityConfigurerAdapter webSecurityConfig(){
	return new WebSecurityConfigurerAdapter() {
		@Override
		protected void configure(HttpSecurity http) throws Exception {
		
				http.sessionManagement().maximumSessions(1);
			
			// http
			//         .csrf()
			//         .disable()
			//         .authorizeRequests()
//                        .antMatchers("/resources/**").permitAll()
//                        .antMatchers("/webjars/**").permitAll()
//                        .anyRequest().authenticated()
// .antMatchers(HttpMethod.POST, "192.168.29.71:12103/**").permitAll()
// .antMatchers(HttpMethod.POST, "192.168.29.71:10299/**").permitAll()
http.exceptionHandling().accessDeniedPage("/403");

http.antMatcher("/**").csrf().and().authorizeRequests()
//.antMatchers("/RateAsuransi/Data").access("hasRole('ROLE_KOMITE')")
.antMatchers("/css/**", "/node_modules/**", "/js/**","images/**")
.permitAll().antMatchers("/login").permitAll().anyRequest().authenticated().and()
.formLogin().loginPage("/login").defaultSuccessUrl("/index/", true).permitAll().and().logout().invalidateHttpSession(true)
.clearAuthentication(true).logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
.logoutSuccessUrl("/login?logout").permitAll();
		}
		@Override
		protected void configure(AuthenticationManagerBuilder builder) throws Exception{
			builder.authenticationProvider(authenticationService);
		}
	};
	
}


//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//
//        //add our users for in memory authentication
//        User.UserBuilder users = User.withDefaultPasswordEncoder();
//        auth.inMemoryAuthentication()
//                .withUser(users.username("adam").password("test").roles("ADMIN"));
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception{
//
//        http.authorizeRequests()
//
//                .antMatchers("/resources/**").permitAll()
//                .antMatchers("/").authenticated()
//
//                .and()
//                .formLogin().loginPage("/user/login")
//                .loginProcessingUrl("/authenticateTheUser")
//                .successHandler(successHandler)
//                .permitAll()
//
//                .and()
//                .logout().permitAll()
//
//                .and()
//                .exceptionHandling().accessDeniedPage("/user/accessDenied");
//    }


}
