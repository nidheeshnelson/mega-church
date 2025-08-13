package io.github.nidheeshnelson.mega_church.common.dto.info;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "IdentityInfoDTO", description = "Represents official identification details of a person")
public class IdentityInfoDTO {

    @Schema(description = "Type of identification document (e.g., Passport, National ID, Driver's License, Church ID)", 
            example = "Passport")
    private String idType;

    @Schema(description = "Unique number/identifier on the document", example = "A1234567")
    private String idNumber;

    @Schema(description = "Authority or institution that issued the document", example = "Government of India")
    private String issuingAuthority;

    @Schema(description = "Country code or name where the ID was issued", example = "IN")
    private String issuingCountry;
}
