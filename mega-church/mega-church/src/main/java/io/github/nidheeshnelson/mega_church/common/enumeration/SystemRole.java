package io.github.nidheeshnelson.mega_church.common.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Platform/system-level access roles")
public enum SystemRole {

    @Schema(description = "Super administrator with global access")
    SUPER_ADMIN,

    @Schema(description = "Administrator with permissions to manage church setup")
    ADMIN,

    @Schema(description = "Regular authenticated user")
    USER
}
