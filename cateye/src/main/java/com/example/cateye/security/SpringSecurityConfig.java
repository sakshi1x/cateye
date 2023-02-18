package com.example.cateye.security;


import com.example.cateye.config.PasswordEncoderUtil;
import com.example.cateye.services.user_management.impl.CustomUserDetailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {

    private final CustomUserDetailService customUserDetailService;

    public SpringSecurityConfig(CustomUserDetailService customUserDetailService) {
        this.customUserDetailService = customUserDetailService;
    }


    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(customUserDetailService);
        authenticationProvider.setPasswordEncoder(PasswordEncoderUtil.getInstance());
        return authenticationProvider;
    }


    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/login","/user/**")
                .permitAll()
                .requestMatchers("/user/**")
                .hasAuthority("ADMIN")
               .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/dashboard",true)
                .usernameParameter("email")
                .permitAll()
                .and()
                .httpBasic();

        return httpSecurity.build();
    }

}
