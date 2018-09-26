package org.cuber.sso.service;

import org.cuber.stub.sso.SSOUserGroup;

import java.util.List;

public interface SSOUserGroupService {

    List<SSOUserGroup> retrieveByUserId(String userId);
}
