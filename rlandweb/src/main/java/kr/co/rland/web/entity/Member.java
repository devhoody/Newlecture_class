package kr.co.rland.web.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Member {

    private Long id;
    private String username;
    private String email;
    private String password;
    private String name;
    private String phone;

}
