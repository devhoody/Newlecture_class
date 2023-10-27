package kr.co.rland.web.repository;

import kr.co.rland.web.entity.MemberRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberRoleRepository {

    void save(MemberRole memberRole);
}
