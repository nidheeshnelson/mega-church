package io.github.nidheeshnelson.mega_church.common.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Marital status of a person")
public enum MaritalStatus {
    @Schema(name = "MARRIED",description = "Marital status of a person")
    MARRIED,
    @Schema(name = "SINGLE",description = "Marital status of a person")
    SINGLE,
    @Schema(name = "WIDOWED",description = "Marital status of a person")
    WIDOWED
}
