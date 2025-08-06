package io.github.nidheeshnelson.mega_church.common.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "District details")
public class DistrictDTO {

    @Schema(description = "District name", example = "Ernakulam")
    private String name;

    @Schema(description = "State this district belongs to")
    private StateDTO state;
}