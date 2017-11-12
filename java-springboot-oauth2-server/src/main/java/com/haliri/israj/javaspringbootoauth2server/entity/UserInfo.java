package com.haliri.israj.javaspringbootoauth2server.entity;

import java.util.Set;

/**
 * Created by israjhaliri on 11/10/17.
 */
public class UserInfo {
    String username;
    String password;
    boolean enable;
    private Set<RoleUser> roleUsers;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public Set<RoleUser> getRoleUsers() {
        return roleUsers;
    }

    public void setRoleUsers(Set<RoleUser> roleUsers) {
        this.roleUsers = roleUsers;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", enable=" + enable +
                ", roleUsers=" + roleUsers +
                '}';
    }
}
