package com.brunopbrito31.apiprodutos.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

    
    protected void configure(HttpSecurity http) throws Exception{
        http.
            authorizeRequests()
                .antMatchers("/contacts/**").permitAll() // Permite que todos os endpoints de contatos sejam liberados sem autenticação
                .antMatchers("/users/**").permitAll() // Permite que todos os endpoints de users sejam liberados sem autenticação
                .antMatchers("/api/usuario/**").permitAll()
                .antMatchers("/api/usuario/salvar/**").permitAll()
                .anyRequest() 
                .authenticated() // Todas as outras, somente com autenticação
                .and() // Permite adicionar uma regra 
            .formLogin()
                .loginPage("/login")
                .permitAll();
    }
    
}
