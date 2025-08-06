package io.github.nidheeshnelson.mega_church.common.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "State or province details")
public class StateDTO {

    @Schema(description = "State code", example = "KL")
    private String code;

    @Schema(description = "State name", example = "Kerala")
    private String name;

    @Schema(description = "Country this state belongs to")
    private CountryDTO country;
}
