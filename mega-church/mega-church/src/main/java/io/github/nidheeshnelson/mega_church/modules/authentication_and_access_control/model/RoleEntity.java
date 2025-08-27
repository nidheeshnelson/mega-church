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

@Schema(name = "RoleEntity", description = "Role of the member")
@Entity
@Table(name = "roles")
public class RoleEntity {
    @Schema(name = "Role id")
    @Column(name = "role_id")
    @Id @GeneratedValue
    private Long roleId;

    @Schema(name = "roleName")
    @Column(name = "role_name")
    private String roleName; // ADMIN, PASTOR, COMMITTEE, MEMBER, GUEST

    @Schema(name = "permissions")
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<PermissionEntity> permissions = new HashSet<>();
}
