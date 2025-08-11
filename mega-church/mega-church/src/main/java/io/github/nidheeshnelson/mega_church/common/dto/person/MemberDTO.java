package io.github.nidheeshnelson.mega_church.common.dto.person;

import java.io.Serial;
import java.io.Serializable;

import io.github.nidheeshnelson.mega_church.common.dto.ContactDTO;
import io.github.nidheeshnelson.mega_church.common.dto.HouseDTO;
import io.github.nidheeshnelson.mega_church.common.dto.NameDTO;
import io.github.nidheeshnelson.mega_church.common.dto.address.AddressDTO;
import io.github.nidheeshnelson.mega_church.common.enumeration.Language;
import io.github.nidheeshnelson.mega_church.common.enumeration.MemberStatus;
import io.github.nidheeshnelson.mega_church.common.enumeration.MembershipType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * Data Transfer Object representing personal details of a church member.
 * This class is used for API responses and requests involving member information.
 * Implements Serializable to support object transmission and persistence.
 * 
 * @author Nidheesh_Nelson
 */
@Data
@Schema(name="MemberDTO", description = "Personal details about a member")
public class MemberDTO implements Serializable,PersonDTO {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "Unique ID of the member", example = "101")
    private Long id;

    @Schema(description = "Full name of the pastor")
    private NameDTO name;

    @Schema(description = "Contact details of the individual")
    private ContactDTO contactDetails;
    
    @Schema(description = "The family this member belongs to")
    private HouseDTO house;

    @Schema(description = "The address this member belongs to")
    private AddressDTO address;

    @Schema(
        description = "Status of the member (e.g., ACTIVE, INACTIVE, SUSPENDED, DECEASED, TRANSFERRED, PENDING_APPROVAL)",
        implementation = MemberStatus.class
    )
    private MemberStatus memberStatus;

    @Schema(
        description = "Type of membership (e.g., REGULAR, HONORARY, TEMPORARY, etc.)",
        implementation = MembershipType.class
    )
    private MembershipType membershipType;

    @Schema(description = "Preferred language for communication", example = "ENGLISH")
    private Language preferredLanguage;

}