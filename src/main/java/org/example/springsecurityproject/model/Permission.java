package org.example.springsecurityproject.model;

public enum Permission {
    DEVELOPERS_READ("developers:read"),
    DEVELOPERS_WRITE("developers:write");

    private final String permisson;

    Permission(String permisson) {
        this.permisson = permisson;
    }

    public String getPermisson() {
        return permisson;
    }
}
