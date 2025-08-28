package io.github.nidheeshnelson.mega_church.common.model.address.embeddable;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class QuickAddress {

    @Schema(name = "buildingName", description = "House or building name", example = "Thanal House")
    @Column(name = "building_name")
    private String buildingName;

    @Schema(name = "street", description = "Street or road name", example = "Kuravankonam Road")
    @Column(name = "street")
    private String street;

    @Schema(name = "place", description = "Specific place name or village", example = "Pattom")
    @Column(name = "place")
    private String place;

    @Schema(name = "addressLine1", description = "Street address of the individual", example = "123 Church St.")
    @Column(name = "address_line_1")
    private String addressLine1;

    @Schema(name = "addressLine2", description = "Apartment or suite number", example = "Apt 101")
    @Column(name = "address_line_2")
    private String addressLine2;

    @Schema(name = "pin", description = "pin code", example = "695524")
    @Column(name = "pin_code")
    private long pinCode;

}
