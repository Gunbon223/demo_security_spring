package gb.org.demo_security_spring.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        //Path Configuration
        http.authorizeHttpRequests(auth -> {
            auth.requestMatchers("/").permitAll();
            auth.requestMatchers("/admin/user","/api/admin/user/**").hasRole("ADMIN");
            auth.requestMatchers("/admin/dashboard").hasAnyRole("ADMIN","SALE");
            auth.requestMatchers("/admin/product","/admin/product/**","/api/product/**").hasAnyRole("ADMIN","SALE");
            auth.requestMatchers("/admin/brand","/admin/brand/**","/api/brand/**").hasAnyRole("ADMIN","SALE");
            auth.requestMatchers("/admin/order","/admin/order/**","/api/order/**").hasAnyRole("ADMIN","SALE");
            auth.requestMatchers("/admin/blog","/admin/blog/**","/api/blog/**").hasAnyRole("ADMIN","SALE","AUTHOR");
            auth.requestMatchers("/admin/category","/admin/category/**","/api/category/**").hasAnyRole("ADMIN","SALE");
            auth.requestMatchers("/user/**","/api/user/**").hasRole("USER");


            auth.requestMatchers("/css/**","/js/**","/image/**").permitAll();
            auth.anyRequest().authenticated(); // any other request must be authenticated
        });

        //Login Configuration
        http.formLogin(formLogin -> {
            formLogin.defaultSuccessUrl("/",true);
            formLogin.permitAll();
        });

        //Logout Configuration
        http.logout(logout -> {
            logout.logoutSuccessUrl("/"); // redirect to home page after
            logout.deleteCookies("JSESSIONID"); // delete cookies
            logout.invalidateHttpSession(true); // invalidate session
            logout.clearAuthentication(true); // clear authentication
            logout.permitAll();
        });

        return http.build();
    }
}