package io.github.nidheeshnelson.mega_church.common.dto.address;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Taluk (sub-district) details")
public class TalukDTO {

    @Schema(description = "Taluk name", example = "Kunnathunad")
    private String name;

    @Schema(description = "District this taluk belongs to")
    private DistrictDTO district;
}