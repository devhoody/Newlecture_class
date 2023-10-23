package kr.co.rland.web.repository;

import kr.co.rland.web.entity.Like;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LikeRepository {
    int delete(Long menuId, Long memberId);

    Like last();

    void save(Like like);
}
