package org.cuber.sso.service;


import org.cuber.stub.sso.SSOResource;

import java.util.List;

public interface SSOResourceService {

    List<SSOResource> retrieveByRoleId (String roleId);
}
