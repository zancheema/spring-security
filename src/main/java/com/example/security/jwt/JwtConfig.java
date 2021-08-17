package com.example.security.jwt;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "application.jwt")
public class JwtConfig {
    private String prefix;
    private String secret;
    private Integer expirationAfterDays;

    public JwtConfig() {
        System.out.println("\nJwtConfig called\n");
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Integer getExpirationAfterDays() {
        return expirationAfterDays;
    }

    public void setExpirationAfterDays(Integer expirationAfterDays) {
        this.expirationAfterDays = expirationAfterDays;
    }

    public String getAuthorizationHeader() {
        return HttpHeaders.AUTHORIZATION;
    }
}
