package edu.unimagdalena.booking.configs;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KeycloakRoleConverter implements Converter<Jwt, Collection<GrantedAuthority>> {

    public static final String REALM_ACCESS = "realm_access";
    public static final String ROLES = "roles";

    @Override
    public Collection<GrantedAuthority> convert(Jwt jwt) {
        // Extract roles from the 'realm_access' claim
        Map<String, Object> realmAccess = (Map<String, Object>) jwt.getClaims().get(REALM_ACCESS);
        List<String> roles = (List<String>) realmAccess.get(ROLES);

        // Map roles to Spring Security authorities
        return roles != null ?
                roles.stream()
                        .map(role -> new SimpleGrantedAuthority("ROLE_" + role))
                        .collect(Collectors.toList())
                :
                new ArrayList<>();
    }
}