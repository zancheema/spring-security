package com.example.security.auth;

import java.util.Optional;

public interface ApplicationUserDao {
    Optional<ApplicationUser> getApplicationUserByUsername(String username);
}
