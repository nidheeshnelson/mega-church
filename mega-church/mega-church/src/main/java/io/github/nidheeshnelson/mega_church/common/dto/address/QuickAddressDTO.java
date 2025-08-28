package io.github.nidheeshnelson.mega_church.common.dto.address;

import java.io.Serial;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "PersonalAddress", description = "Personal address details")
public class QuickAddressDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(name = "buildingName", description = "House or building name", example = "Thanal House")
    private String buildingName;

    @Schema(name = "street", description = "Street or road name", example = "Kuravankonam Road")
    private String street;

    @Schema(name = "place", description = "Specific place name or village", example = "Pattom")
    private String place;

    @Schema(name = "addressLine1", description = "Street address of the individual", example = "123 Church St.")
    private String addressLine1;

    @Schema(name = "addressLine2", description = "Apartment or suite number", example = "Apt 101")
    private String addressLine2;

    @Schema(name = "pinCode", description = "pin code", example = "695524")
    private long pinCode;
}
