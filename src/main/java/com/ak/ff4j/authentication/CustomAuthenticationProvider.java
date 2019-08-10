package com.ak.ff4j.authentication;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Dummy AuthenticationProvider which supports two users "admin" and "user"
 */
public class CustomAuthenticationProvider implements AuthenticationProvider {

    private static List<User> users = new ArrayList();

    public CustomAuthenticationProvider() {
        users.add(new User("admin", "admin", "ROLE_USER"));
        users.add(new User("user", "user", "ROLE_USER"));
    }

    @Override
    public Authentication authenticate(Authentication authentication)
            throws AuthenticationException {
        final String name = authentication.getName();
        final Object credentials = authentication.getCredentials();
        if (!(credentials instanceof String)) {
            return null;
        }

        //Very insecure but used only for POC
        final String password = credentials.toString();

        final Optional<User> userOptional = users.stream()
                .filter(u -> u.match(name, password))
                .findFirst();

        if (!userOptional.isPresent()) {
            throw new BadCredentialsException("Authentication failed for " + name);
        }

        final List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        grantedAuthorities.add(new SimpleGrantedAuthority(userOptional.get().role));
        return new UsernamePasswordAuthenticationToken(name, password, grantedAuthorities);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

    private static class User {
        private String name;
        private String password;
        private String role;

        public User(String name, String password, String role) {
            this.name = name;
            this.password = password;
            this.role = role;
        }

        public boolean match(String name, String password) {
            return this.name.equals(name) && this.password.equals(password);
        }
    }
}