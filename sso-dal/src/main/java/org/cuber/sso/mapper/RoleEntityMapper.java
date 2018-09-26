package org.cuber.sso.mapper;

import org.apache.ibatis.annotations.Param;
import org.cuber.sso.dto.RoleEntity;
import org.cuber.stub.repo.Mapper;

import java.util.List;

public interface RoleEntityMapper extends Mapper<RoleEntity, String> {
    /**
     * 根据用户ID， 查找该用户及该用户集合的权限
     *
     * @param userId
     * @return 权限集合
     */
    List<RoleEntity> retrieveByUserId(@Param("userId") String userId);

}