package com.haliri.israj.javaspringbootoauth2server.entity;

/**
 * Created by israjhaliri on 8/25/17.
 */
public class RoleUser {

    public RoleUser() {
    }

    public RoleUser(Long id, String role) {
        this.id = id;
        this.role = role;
    }

    private Long id;
    private String role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role='" + role + '\'' +
                '}';
    }
}
