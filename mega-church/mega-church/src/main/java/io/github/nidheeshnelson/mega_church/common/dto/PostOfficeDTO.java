package io.github.nidheeshnelson.mega_church.common.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Post office details")
public class PostOfficeDTO {

    @Schema(description = "Post office name", example = "Thrikkakara North PO")
    private String name;

    @Schema(description = "Associated PIN code")
    private PinCodeDTO pinCode;
}
