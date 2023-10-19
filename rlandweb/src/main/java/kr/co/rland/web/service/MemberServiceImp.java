package kr.co.rland.web.service;

import org.springframework.stereotype.Service;

@Service
public class MemberServiceImp implements MemberService{
    @Override
    public boolean isValid(String username, String password) {
        return false;
    }
}
