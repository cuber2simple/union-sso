package org.cuber.sso.helper;

import org.apache.commons.collections4.CollectionUtils;
import org.cuber.sso.dto.Resource;
import org.cuber.sso.dto.RoleEntity;
import org.cuber.sso.dto.UserEntity;
import org.cuber.sso.dto.UserGroupEntity;
import org.cuber.stub.StubConstant;
import org.cuber.stub.sso.*;
import org.cuber.stub.util.TransformUtils;

import java.util.*;

public class SSOHelper {

    public static final String SUPER = "-1";

    public static SSOUser dto2Vo(UserEntity userEntity) {
        SSOUser ssoUser = TransformUtils.copyF(userEntity, SSOUser.class);
        if (Objects.nonNull(ssoUser) && Objects.nonNull(userEntity)) {
            ssoUser.setUserId(userEntity.getId());
        }
        return ssoUser;
    }

    public static UserEntity vo2Dto(SSOUser ssoUser) {
        UserEntity userEntity = TransformUtils.copyF(ssoUser, UserEntity.class);
        if (Objects.nonNull(ssoUser) && Objects.nonNull(userEntity)) {
            userEntity.setId(ssoUser.getUserId());
        }
        return userEntity;
    }

    public static SSOUserGroup dto2Vo(UserGroupEntity userGroupEntity) {
        SSOUserGroup ssoUserGroup = TransformUtils.copyF(userGroupEntity, SSOUserGroup.class);
        if (Objects.nonNull(ssoUserGroup) && Objects.nonNull(userGroupEntity)) {
            ssoUserGroup.setUserGroupId(userGroupEntity.getId());
        }
        return ssoUserGroup;
    }

    public static UserGroupEntity vo2Dto(SSOUserGroup ssoUserGroup) {
        UserGroupEntity userGroupEntity = TransformUtils.copyF(ssoUserGroup, UserGroupEntity.class);
        if (Objects.nonNull(ssoUserGroup) && Objects.nonNull(userGroupEntity)) {
            userGroupEntity.setId(ssoUserGroup.getUserGroupId());
        }
        return userGroupEntity;
    }

    public static SSOResource dto2Vo(Resource resource) {
        SSOResource result = null;
        if (Objects.nonNull(resource)) {
            SSOResource.Type type = SSOResource.Type.valueOf(resource.getResourceType());
            switch (type) {
                case menu:
                    result = TransformUtils.copyP(resource, SSOMenu.class, "treeLeaf");
                    SSOMenu ssoMenu = (SSOMenu) result;
                    ssoMenu.setTreeLeaf(StubConstant.Y_IS_TRUE.equals(resource.getTreeLeaf()));
                    ssoMenu.setSys(StubConstant.Y_IS_TRUE.equals(resource.getIsSys()));
                    break;
                case element:
                    result = TransformUtils.copyF(resource, SSOResource.class);
                    break;
            }
            result.setResourceId(resource.getId());
        }
        return result;
    }


    public static Resource vo2Dto(SSOResource ssoResource) {
        Resource result = null;
        if (Objects.nonNull(ssoResource)) {

            if (ssoResource instanceof SSOMenu) {
                SSOMenu ssoMenu = (SSOMenu) ssoResource;
                result = TransformUtils.copyP(ssoMenu, Resource.class, "treeLeaf");
                result.setTreeLeaf(ssoMenu.isTreeLeaf() ? StubConstant.Y_IS_TRUE : StubConstant.N_IS_FALSE);
                result.setIsSys(ssoMenu.isSys() ? StubConstant.Y_IS_TRUE : StubConstant.N_IS_FALSE);
            } else {
                result = TransformUtils.copyF(ssoResource, Resource.class);
            }
            result.setId(ssoResource.getResourceId());
        }
        return result;
    }

    public static SSORole dto2Vo(RoleEntity roleEntity) {
        SSORole ssoRole = TransformUtils.copyF(roleEntity, SSORole.class);
        if (Objects.nonNull(ssoRole) && Objects.nonNull(roleEntity)) {
            ssoRole.setRoleId(roleEntity.getId());
        }
        return ssoRole;
    }

    public static RoleEntity vo2Dto(SSORole ssoRole) {
        RoleEntity roleEntity = TransformUtils.copyF(ssoRole, RoleEntity.class);
        if (Objects.nonNull(roleEntity) && Objects.nonNull(ssoRole)) {
            roleEntity.setId(ssoRole.getRoleId());
        }
        return roleEntity;
    }

    public static SSOMenu all2One(HashSet<SSOMenu> menus) {
        SSOMenu result = null;
        if (CollectionUtils.isNotEmpty(menus)) {
            Map<String, SSOMenu> map = new HashMap<>();
            for (SSOMenu ssoMenu : menus
                    ) {
                if (SUPER.equals(ssoMenu.getParentId())) {
                    result = ssoMenu;
                }
                map.put(ssoMenu.getResourceId(), ssoMenu);
            }
            menus.forEach(ssoMenu -> {
                if(map.containsKey(ssoMenu.getParentId())){
                    SSOMenu father = map.get(ssoMenu.getParentId());
                    List<SSOMenu> subMenus = father.getSubMenus();
                    if(CollectionUtils.isEmpty(subMenus)){
                        subMenus = new ArrayList<>();
                        father.setSubMenus(subMenus);
                    }
                    subMenus.add(ssoMenu);
                    subMenus.sort(SSOMenu::compareTo);
                }
            });
        }
        return result;
    }

}
