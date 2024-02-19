package com.ttt.hotelbooking.service;

import com.ttt.hotelbooking.entity.Role;
import com.ttt.hotelbooking.entity.User;

import java.util.List;


public interface RoleService {
    List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long id);
    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);
}
