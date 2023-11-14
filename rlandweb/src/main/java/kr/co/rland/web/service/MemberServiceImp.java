package kr.co.rland.web.service;

import kr.co.rland.web.entity.Member;
import kr.co.rland.web.entity.MemberRole;
import kr.co.rland.web.repository.MemberRepository;
import kr.co.rland.web.repository.MemberRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberServiceImp implements MemberService{

    @Autowired
    private MemberRepository repository;

    @Autowired
    private MemberRoleRepository memberRoleRepository;

    @Autowired
    private PasswordEncoder encoder;

    @Override
    public boolean isValid(String username, String password) {

        Member member = repository.findByUserName(username);

        if(member == null){
            return false;
        } else if (!member.getPassword().equals(password)){
            return false;
        }
        return true;
    }

    @Override
    @Transactional
    public Member signUp(Member member) {
        String plainPwd = member.getPassword();
        String hashedPwd = encoder.encode(plainPwd);
        System.out.println(hashedPwd);

        // 회원정보 설정
        member.setPassword(hashedPwd);
        repository.save(member);

        Member newOne = repository.last();

        System.out.println(newOne);
        // 권한 설정
        MemberRole mr =MemberRole.builder()
                .memberId(1555L)
                .build();

        memberRoleRepository.save(mr);

        return newOne;
    }
}
