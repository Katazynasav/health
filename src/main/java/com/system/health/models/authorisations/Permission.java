package com.system.health.models.authorisations;

public enum Permission {
    DEVELOPERS_READ("developers:read"),
    DEVELOPERS_WRITE("developers:write");


    private final String permission;

    Permission(String permisssion) {
        this.permission = permisssion;
    }

    public String getPermisssion() {
        return permission;
    }
}
