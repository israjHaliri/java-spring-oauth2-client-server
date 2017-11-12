package com.haliri.israj.javaspringbootoauth2server.custom;

import com.haliri.israj.javaspringbootoauth2server.entity.RoleUser;
import com.haliri.israj.javaspringbootoauth2server.entity.UserInfo;
import com.haliri.israj.javaspringbootoauth2server.service.UserInfoService;
import com.haliri.israj.javaspringbootoauth2server.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by israjhaliri on 11/10/17.
 */


@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserInfoService userInfoService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserInfo userInfo =  userInfoService.loadByUsername(username);
        AppUtils.getLogger(this).info("USERNAME PARAMETER : "+username+", DETAIL : "+userInfo.toString()+"");
        if (userInfo.getUsername() == null) {
            throw new UsernameNotFoundException(username);
        } else {

            Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
            for (RoleUser roles : userInfo.getRoleUsers()) {
                grantedAuthorities.add(new SimpleGrantedAuthority(roles.getRole()));
            }

            return new org.springframework.security.core.userdetails.User(userInfo.getUsername(), userInfo.getPassword(), grantedAuthorities);
        }
    }
}
