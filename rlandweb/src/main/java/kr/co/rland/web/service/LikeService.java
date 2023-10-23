package kr.co.rland.web.service;

import kr.co.rland.web.entity.Like;

public interface LikeService {

    boolean delete(Long menuId, Long memberId);

    Like add(Like like);
}
