package org.cuber.sso.mapper;

import org.cuber.sso.dto.UserEntity;
import org.cuber.stub.repo.Mapper;

public interface UserEntityMapper extends Mapper<UserEntity, String> {
    UserEntity retrieveByUnique(UserEntity search);
}