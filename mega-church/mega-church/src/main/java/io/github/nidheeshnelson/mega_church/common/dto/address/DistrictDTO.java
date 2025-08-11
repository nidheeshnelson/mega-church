package io.github.nidheeshnelson.mega_church.common.dto.address;

import java.io.Serial;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "District details")
public class DistrictDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "District name", example = "Ernakulam")
    private String name;

    @Schema(description = "State this district belongs to")
    private StateDTO state;
}