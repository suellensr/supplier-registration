package edu.challengethree.supplier_registration.security;

import edu.challengethree.supplier_registration.models.entities.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class CustomUserDetails implements UserDetails {

    private User user;

    public CustomUserDetails(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList(); // Adicionar roles/authorities conforme necessário
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Mudar a lógica se necessário
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Mudar a lógica se necessário
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Mudar a lógica se necessário
    }

    @Override
    public boolean isEnabled() {
        return true; // Mudar a lógica se necessário
    }
}
