package io.github.nidheeshnelson.mega_church.common.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Type of Local Self Government body")
public enum LocalBodyType {

    @Schema(description = "Grama Panchayat (Village-level local body)")
    GRAMA_PANCHAYAT,

    @Schema(description = "Municipality (Urban area local body)")
    MUNICIPALITY,

    @Schema(description = "Municipal Corporation (City-level local body)")
    CORPORATION,

    @Schema(description = "Town Panchayat (Transitional local body)")
    TOWN_PANCHAYAT
}
