package com.secExe.secu.SecRole;

public enum SecRole {
    USER("User"),
    ADMIN("Admin");

    private String role;

    SecRole(String role) {
        this.role = role;
    }
}
