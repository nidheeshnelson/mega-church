package io.github.nidheeshnelson.mega_church.common.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Nationality of a person")
public enum Nationality {
    @Schema(name = "INDIAN",description = "Nationality of a person")
    INDIAN,
    @Schema(name = "OTHER",description = "Nationality of a person")
    OTHER
}
