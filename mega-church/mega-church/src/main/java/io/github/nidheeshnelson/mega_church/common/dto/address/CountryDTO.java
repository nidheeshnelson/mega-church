package io.github.nidheeshnelson.mega_church.common.dto.address;

import java.io.Serial;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Country details")
public class CountryDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "Country code", example = "IN")
    private String code;

    @Schema(description = "Country name", example = "India")
    private String name;
}
