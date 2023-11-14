package kr.co.rland.web.repository;

import kr.co.rland.web.entity.MemberRole;
import kr.co.rland.web.entity.MemberRoleView;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberRoleRepository {

    void save(MemberRole memberRole);

    List<MemberRoleView> findViewAllByMemberId(Long id);
}
