package io.github.nidheeshnelson.mega_church.common.dto.person;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import io.github.nidheeshnelson.mega_church.common.dto.ContactDTO;
import io.github.nidheeshnelson.mega_church.common.dto.HouseholdDTO;
import io.github.nidheeshnelson.mega_church.common.dto.NameDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name="PersonDTO", description = "Personal details about a member")
public class PersonDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "Unique ID of the member", example = "101")
    private Long id;

    @Schema(description = "Full name of the pastor")
    private NameDTO name;

    @Schema(description = "Personal information")
    private PersonalInfoDTO personal;

    @Schema(description = "Government-issued identity documents")
    private List<IdentityInfoDTO> identities;

    @Schema(description = "Family relationships")
    private FamilyInfoDTO family;
    
    @Schema(description = "Contact details of the individual")
    private ContactDTO contactDetails;
    
    @Schema(description = "The family this member belongs to")
    private HouseholdDTO house;

    @Schema(description = "The address this member belongs to")
    private PersonalAddress address;

}
