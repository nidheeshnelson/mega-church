package io.github.nidheeshnelson.mega_church.common.dto.person;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import io.github.nidheeshnelson.mega_church.common.dto.address.QuickAddressDTO;
import io.github.nidheeshnelson.mega_church.common.dto.house.HouseholdDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name="PersonDTO", description = "Personal details about a member")
public class PersonDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(name = "personId")
    private Long personId;

    @Schema(name = "name")
    private NameDTO name;

    @Schema(name = "personal")
    private PersonalInfoDTO personalInfo;

    @Schema(name = "identities")
    private List<IdentityInfoDTO> identities;

    @Schema(name = "family")
    private FamilyInfoDTO familyInfo;
    
    @Schema(name = "contactDetails")
    private ContactDTO contactDetails;
    
    @Schema(name = "house")
    private HouseholdDTO household;

    @Schema(name = "address")
    private QuickAddressDTO personalAddress;

}
