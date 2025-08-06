package io.github.nidheeshnelson.mega_church.common.dto;

import java.io.Serial;
import java.io.Serializable;

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
public class MemberDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "Unique ID of the member", example = "101")
    private Long id;

    @Schema(description = "Full name of the member", example = "John Doe")
    private String name;

    @Schema(description = "Email address of the member", example = "john.doe@example.com")
    private String email;

    @Schema(description = "Mobile number", example = "+919999999999")
    private String phone;
    
    @Schema(description = "The family this member belongs to")
    private FamilyDTO family;

    @Schema(description = "The address this member belongs to")
    private AddressDTO address;
}