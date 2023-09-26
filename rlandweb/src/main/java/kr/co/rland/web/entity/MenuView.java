package kr.co.rland.web.entity;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@Builder
public class MenuView {
    private long id;
    private String korName;
    private String engName;
    private int price;
    private String img;
    private Date regDate;
    private int hit;
    private long memberId;
    private int likeCount;
}
