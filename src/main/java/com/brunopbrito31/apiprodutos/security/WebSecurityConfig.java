// package com.brunopbrito31.apiprodutos.security;

// import org.apache.catalina.filters.CorsFilter;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.core.PriorityOrdered;
// import org.springframework.core.annotation.Order;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// import org.springframework.security.config.annotation.web.configurers.CorsConfigurer;
// import org.springframework.web.cors.CorsConfiguration;
// import org.springframework.web.servlet.config.annotation.CorsRegistry;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


// @Configuration
// @EnableWebSecurity
// public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

    
//     protected void configure(HttpSecurity http) throws Exception{
//         System.out.println("entrou na configuração geral de segurança");
//         http.
//             authorizeRequests()
//                 .antMatchers("/contacts").permitAll() // Permite que todos os endpoints de contatos sejam liberados sem autenticação
//                 .antMatchers("/users").permitAll() // Permite que todos os endpoints de users sejam liberados sem autenticação
//                 .antMatchers("/api/usuario").permitAll()
//                 .antMatchers("/api/usuario/salvar").permitAll()
//                 .anyRequest() 
//                 .authenticated() // Todas as outras, somente com autenticação
//                 .and() // Permite adicionar uma regra 
//             .formLogin()
//                 .loginPage("/login")
//                 .permitAll();
                
//     }

//     @Order( PriorityOrdered.HIGHEST_PRECEDENCE)
//     public WebMvcConfigurer corsConfigurer() {
//         System.out.println("entrou na configuração do cors");
//         return new WebMvcConfigurer() {
//             @Override
//             public void addCorsMappings(CorsRegistry registry) {
//                 registry.addMapping("/**")
//                 .allowedOrigins("http://localhost:3000")
//                 .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");
//             }
//         };
//     }
    
// }
