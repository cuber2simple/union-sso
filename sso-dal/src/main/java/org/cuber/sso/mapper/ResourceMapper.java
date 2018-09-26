package org.cuber.sso.mapper;

import org.apache.ibatis.annotations.Param;
import org.cuber.sso.dto.Resource;
import org.cuber.stub.repo.Mapper;

import java.util.List;

public interface ResourceMapper extends Mapper<Resource, String> {

    List<Resource> retrieveByRoleId(@Param("roleId") String roleId);

}