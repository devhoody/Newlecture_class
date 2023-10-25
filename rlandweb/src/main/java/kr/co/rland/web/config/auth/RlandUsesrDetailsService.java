package kr.co.rland.web.config.auth;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RlandUsesrDetailsService implements UserDetailsService{
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        RlandUserDetails userDetails = new RlandUserDetails();

        userDetails.setUsername(username); // 입력한 값 그대로 대입
        System.out.println("이것이 userDetails username: " + username);
        userDetails.setPassword("$2a$10$wWWqhcw1u3q7mq3bB4C37.OTI6mzWzOI/yKhjNo70cd6.p/SOPjCi");
        userDetails.setEmail("new@newlec.com");
        userDetails.setId(1L);

        //권한 부여
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_MEMBER"));
        authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        userDetails.setAuthorities(authorities);

        return userDetails;
    }
}
