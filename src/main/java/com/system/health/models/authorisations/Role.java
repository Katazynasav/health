package com.system.health.models.authorisations;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static java.util.EnumSet.of;


public enum Role {
    EMPLOYEE(of(Permission.DEVELOPERS_READ)),
    DEVELOPER(of(Permission.DEVELOPERS_READ, Permission.DEVELOPERS_WRITE));


    private final Set<Permission> permissions;

    Role(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getAuthorities(){
        return getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermisssion()))
                .collect(Collectors.toSet());
    }
}
