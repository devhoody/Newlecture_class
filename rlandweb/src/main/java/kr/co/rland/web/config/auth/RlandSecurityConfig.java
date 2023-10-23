package kr.co.rland.web.config.auth;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class RlandSecurityConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(
                        authorize -> authorize
                                .requestMatchers("/member/**")
                                .hasAnyRole("ADMIN", "MEMBER")
                                .anyRequest().permitAll())
                .formLogin(
                        form -> form.loginPage("/user/login")
                )
                .logout(
                        logout -> logout
                                .logoutUrl("/user/logout") // 로그아웃 페이지
                                .logoutSuccessUrl("/index")); // 로그아웃 성공시 이동페이지

        return http.build();
    }

    @Bean
    public UserDetailsService jdbcUserDetailsService() {
        JdbcUserDetailsManager manager = new JdbcUserDetailsManager(dataSource);

        manager.setUsersByUsernameQuery("select user_name username, password, 1 enabled from member where user_name = ?");

        manager.setAuthoritiesByUsernameQuery("select user_name username, 'ROLE_MEMBER' authority from member where user_name = ?");

        return manager;
    }

    //    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user1 = User.builder()
                .username("newlec")
                .password("{noop}111")
                .roles("ADMIN", "MEMBER")
                .build();

        UserDetails user2 = User.builder()
                .username("new")
                .password("{noop}111")
                .roles("MEMBER")
                .build();

        return new InMemoryUserDetailsManager(user1, user2);
    }


}
