package io.github.nidheeshnelson.mega_church.common.model.person.embeddable;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Schema(name = "Name")
@Embeddable
public class IdentityInfo {
    
    @Schema(name = "idType", description = "Type of identification document (e.g., Passport, National ID, Driver's License, Church ID)", 
            example = "Passport")
    @Column(name = "id_type")
    private String idType;

    @Schema(name = "idNumber", description = "Unique number/identifier on the document", example = "A1234567")
    @Column(name = "id_number")
    private String idNumber;

    @Schema(name = "issuingAuthority", description = "Authority or institution that issued the document", example = "Government of India")
    @Column(name = "issuing_authority")
    private String issuingAuthority;

    @Schema(name = "issuingCountry", description = "Country code or name where the ID was issued", example = "IN")
    @Column(name = "issuing_country")
    private String issuingCountry;
}
