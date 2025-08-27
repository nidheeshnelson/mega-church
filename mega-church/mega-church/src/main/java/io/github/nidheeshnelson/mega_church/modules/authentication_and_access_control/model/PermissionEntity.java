package io.github.nidheeshnelson.mega_church.modules.authentication_and_access_control.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Schema(name = "PermissionEntity", description = "Types of permissions that have stored")
@Entity
@Table(name = "permissions")
public class PermissionEntity {
    @Schema(name = "permissionId")
    @Column(name = "permission_id")
    @Id @GeneratedValue
    private Long permissionId;

    @Schema(name = "PermissionName")
    @Column(name = "permission_name")
    private String permissionName; // e.g., MEMBER_CREATE, DONATION_VIEW, EVENT_MANAGE
}
