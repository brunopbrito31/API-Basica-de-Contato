// package com.brunopbrito31.apiprodutos;

// import java.io.IOException;

// import javax.servlet.Filter;
// import javax.servlet.FilterChain;
// import javax.servlet.FilterConfig;
// import javax.servlet.ServletException;
// import javax.servlet.ServletRequest;
// import javax.servlet.ServletResponse;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// import org.apache.catalina.filters.CorsFilter;
// import org.springframework.boot.web.servlet.FilterRegistrationBean;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.core.PriorityOrdered;
// import org.springframework.core.annotation.Order;
// import org.springframework.http.HttpMethod;
// import org.springframework.stereotype.Component;
// import org.springframework.web.cors.CorsConfiguration;
// import org.springframework.web.cors.UrlBasedCorsConfigurationSource;



// @Configuration
// public class ConfigurationCors {

//     @Bean
//     public FilterRegistrationBean corsFilter() {
//         System.out.println("entrou no filtro do cors");
//         UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//         CorsConfiguration config = new CorsConfiguration().applyPermitDefaultValues();
//         config.addAllowedMethod(HttpMethod.PUT);
//         config.addAllowedMethod(HttpMethod.DELETE);
//         config.addAllowedMethod(HttpMethod.POST);
//         config.addAllowedMethod(HttpMethod.GET);
//         source.registerCorsConfiguration("/**", config);
//         FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter());
//         bean.setOrder(0);
//         return bean;
//     }
// }

// @Component
// @Order( PriorityOrdered.HIGHEST_PRECEDENCE)
// public class CorsFilter implements Filter {

//     @Override
//     public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
//         final HttpServletResponse response = (HttpServletResponse) res;
//         response.setHeader("Access-Control-Allow-Origin", "*"); 
//         response.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
//         response.setHeader("Access-Control-Allow-Headers", "Authorization, Cache-Control, Content-Type");
//         response.setHeader("Access-Control-Max-Age", "3600");
        
//         //SEND OK or validate
//         if ("OPTIONS".equalsIgnoreCase(((HttpServletRequest) req).getMethod())) {
//             response.setStatus(HttpServletResponse.SC_OK);
//         } else {
//             chain.doFilter(req, res);
//         }
//     }

//     @Override
//     public void destroy() {
//         //
//     }

//     @Override
//     public void init(FilterConfig config) throws ServletException {
//         //
//     }

// }