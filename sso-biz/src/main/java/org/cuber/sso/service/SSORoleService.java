package org.cuber.sso.service;

import org.cuber.stub.sso.SSORole;

import java.util.List;

public interface SSORoleService {

    List<SSORole> retrieveByUserId(String userId);
}
