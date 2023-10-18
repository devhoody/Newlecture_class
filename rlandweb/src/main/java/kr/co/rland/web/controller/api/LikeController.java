package kr.co.rland.web.controller.api;

import kr.co.rland.web.entity.Like;
import kr.co.rland.web.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("apiLikeController")
@RequestMapping("/api/likes")
public class LikeController {

    // menuservice? likeservice?
    @Autowired
    private LikeService service;

    @PostMapping
    public Like add(
            @RequestBody Like like
    ){
        like.setMemberId(1L);
        Like newOne = service.add(like);
        return newOne;
    }

//    @DeleteMapping("{menu-id}/members/{member-id}") // 로그인정보 사용 xx
    @DeleteMapping("{menu-id}") // 로그인정보 사용 o
    public Boolean delete(
        @PathVariable("menu-id") Long menuId
    ){
        Long memberId = 1L;
        boolean result = service.delete(menuId, memberId);

        return result;
    }
}
