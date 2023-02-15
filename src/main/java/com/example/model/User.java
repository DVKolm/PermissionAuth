package com.example.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "usr")
public class User extends UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String password;
    private String email;
    @OneToOne
    private Role role;

    @Enumerated(value = EnumType.STRING)
    private Status status;

    public User(String username, String password, String email, Role role, Status status) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.status = status;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public String getPassword() {
        return password;
    }


    public Status getStatus() {
        return status;
    }

    public Role getRole() {
        return role;
    }

}
