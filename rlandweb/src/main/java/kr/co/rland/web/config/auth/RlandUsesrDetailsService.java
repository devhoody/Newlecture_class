package kr.co.rland.web.config.auth;

import kr.co.rland.web.entity.Member;
import kr.co.rland.web.entity.MemberRoleView;
import kr.co.rland.web.repository.MemberRepository;
import kr.co.rland.web.repository.MemberRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private MemberRoleRepository memberRoleRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        RlandUserDetails userDetails = new RlandUserDetails();
        Member member = memberRepository.findByUserName(username);

        userDetails.setUsername(username); // 입력한 값 그대로 대입
        System.out.println("이것이 userDetails username: " + username);
        userDetails.setPassword(member.getPassword());
        userDetails.setEmail(member.getEmail());
        userDetails.setId(member.getId());

        //권한 부여
        List<MemberRoleView> memberRoleViewList = memberRoleRepository.findViewAllByMemberId(member.getId());

        List<GrantedAuthority> authorities = new ArrayList<>();
        for(MemberRoleView mr : memberRoleViewList)
            authorities.add(new SimpleGrantedAuthority(mr.getRoleName()));
        userDetails.setAuthorities(authorities);

        return userDetails;
    }
}
