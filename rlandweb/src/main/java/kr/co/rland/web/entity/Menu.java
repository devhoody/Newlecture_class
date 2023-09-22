package kr.co.rland.web.entity;

import java.util.Date;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Menu {
		private long id;
	   private String korName;
	   private String engName;
	   private int price;
	   private String img;
	   private Date regDate;
	   private int hit;
	   private long memberId;
	   
	   
}
