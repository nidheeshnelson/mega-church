package io.github.nidheeshnelson.mega_church.common.dto.address;

import java.io.Serial;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "State or province details")
public class StateDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "State code", example = "KL")
    private String code;

    @Schema(description = "State name", example = "Kerala")
    private String name;

    @Schema(description = "Country this state belongs to")
    private CountryDTO country;
}
