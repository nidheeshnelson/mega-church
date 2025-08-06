package io.github.nidheeshnelson.mega_church.common.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "PIN code details")
public class PinCodeDTO {

    @Schema(description = "Postal code", example = "682030")
    private String code;

    @Schema(description = "Taluk this pincode belongs to")
    private TalukDTO taluk;
}
