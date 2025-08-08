package io.github.nidheeshnelson.mega_church.common.dto.address;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Country details")
public class CountryDTO {

    @Schema(description = "Country code", example = "IN")
    private String code;

    @Schema(description = "Country name", example = "India")
    private String name;
}
