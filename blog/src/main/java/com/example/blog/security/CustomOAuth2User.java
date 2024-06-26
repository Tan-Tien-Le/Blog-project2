package com.example.blog.security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.Collection;
import java.util.Map;
@Getter
@Setter
@AllArgsConstructor
public class CustomOAuth2User implements OAuth2User {
    private OAuth2User oauth2User;
    @Override
    public Map<String, Object> getAttributes() {
        return oauth2User.getAttributes();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return oauth2User.getAuthorities();
    }

    public String getEmail() {
        return oauth2User.getAttribute("email");
    }
    @Override
    public String getName() {
        return oauth2User.getName();
    }
}
