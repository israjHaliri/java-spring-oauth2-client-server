package com.haliri.israj.javaspringbootoauth2server.service;

import com.haliri.israj.javaspringbootoauth2server.entity.RoleUser;
import com.haliri.israj.javaspringbootoauth2server.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by israjhaliri on 11/10/17.
 */
@Service
public class UserInfoService {
    public UserInfo loadByUsername(String username){

        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("israjhaliri@gmail.com");
        userInfo.setPassword("12345");
        userInfo.setEnable(Boolean.TRUE);

        Set<RoleUser> roleUsersSet = new HashSet<>();
        roleUsersSet.add(new RoleUser(1L,"ROLE_ADMIN"));
        userInfo.setRoleUsers(roleUsersSet);

        return userInfo;
    }
}
