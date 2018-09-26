package org.cuber.sso.mapper;

import org.apache.ibatis.annotations.Param;
import org.cuber.sso.dto.UserGroupEntity;
import org.cuber.stub.repo.Mapper;

import java.util.List;

public interface UserGroupEntityMapper extends Mapper<UserGroupEntity, String> {

    List<UserGroupEntity> retrieveByUserId(@Param("userId") String userId);
}