package io.github.nidheeshnelson.mega_church.modules.authentication_and_access_control.model;

import java.util.HashSet;
import java.util.Set;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Schema(name = "UserEntity", description = "user data to login")
@Entity
@Table(name = "users")
public class UserEntity {

    @Schema(name = "userId")
    @Column(name = "user_id")
    @Id @GeneratedValue
    private Long userId;

    @Schema(name = "username")
    @Column(name = "user_name")
    private String username;

    @Schema(name = "email")
    @Column(name = "email")
    private String email;

    @Schema(name = "password")
    @Column(name = "password")
    private String password;

    @Schema(name = "active")
    @Column(name = "active")
    private boolean active;

    @Schema(name = "roles")
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<RoleEntity> roles = new HashSet<>();
}
