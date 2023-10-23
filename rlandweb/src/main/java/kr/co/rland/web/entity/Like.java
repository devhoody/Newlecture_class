package kr.co.rland.web.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@Builder
public class Like {

    private Long memberId;
    private Long menuId;
    private Date regDate;
}
