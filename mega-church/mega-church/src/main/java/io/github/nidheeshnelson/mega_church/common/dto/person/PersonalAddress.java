package io.github.nidheeshnelson.mega_church.common.dto.person;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Personal address details")
public class PersonalAddress {

    @Schema(description = "House or building name", example = "Thanal House")
    private String buildingName;

    @Schema(description = "Street or road name", example = "Kuravankonam Road")
    private String street;

    @Schema(description = "Specific place name or village", example = "Pattom")
    private String place;

    @Schema(description = "Street address of the individual", example = "123 Church St.")
    private String addressLine1;

    @Schema(description = "Apartment or suite number", example = "Apt 101")
    private String addressLine2;

    @Schema(description = "pin code", example = "695524")
    private long pin;
}
