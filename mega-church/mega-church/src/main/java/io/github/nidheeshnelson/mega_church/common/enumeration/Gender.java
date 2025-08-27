package io.github.nidheeshnelson.mega_church.common.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Biological sex or self-identified gender")
public enum Gender {
    @Schema(name = "MALE",description = "Gender of a person")
    MALE,
    @Schema(name = "FEMALE",description = "Gender of a person")
    FEMALE,
    @Schema(name = "OTHER",description = "Gender of a person")
    OTHER,
    @Schema(name = "UNSPECIFIED",description = "Gender of a person")
    UNSPECIFIED
}