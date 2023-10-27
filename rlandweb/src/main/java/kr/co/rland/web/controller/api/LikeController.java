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

    @DeleteMapping("{ids}")
    public boolean delete(
            @PathVariable Long[] ids // /api/likes/2-menuid, 3-memberid
    ){
        Long menuId = ids[0];
        Long memberId = ids[1];

        boolean result = service.delete(menuId,memberId);

        return result;
    }

    @PostMapping
    public Like add(
            @RequestBody Like like
    ){
        like.setMemberId(1L);
        Like newOne = service.add(like);
        return newOne;
    }

}
