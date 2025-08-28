package io.github.nidheeshnelson.mega_church.modules.office.membership.dto;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

import io.github.nidheeshnelson.mega_church.common.dto.person.PersonDTO;
import io.github.nidheeshnelson.mega_church.modules.office.certificate.dto.TransferCertificateDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name="MemberDTO", description = "Member of any entity")
public class MemberDTO implements Serializable{
    
    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(name = "person", description = "details about a person")
    private PersonDTO person;

    @Schema(name = "memberId", description = "Unique ID of the member", example = "101")
    private Long memberId;

    @Schema(name = "baptized", description = "To know the person is baptized")
    private boolean baptized;

    @Schema(name = "spiritFilled", description = "To know the person is spiritFilled")
    private boolean spiritFilled;

    @Schema(name = "regular", description = "To know the person is regular in church")
    private boolean regular;

    @Schema(name = "active", description = "To know the person is active in church")
    private boolean active;

    @Schema(name = "willingToDoServices", description = "To know the person is willing to do services in church")
    private boolean willingToDoServices;

    @Schema(name = "membershipStartDate", description = "The Starting date of a membership in the church")
    private LocalDate membershipStartDate;

    @Schema(name = "membershipEndDate", description = "The ending date of membership in the church")
    private LocalDate membershipEndDate;

    @Schema(name = "incomingTC", description = "The TC from another church")
    private TransferCertificateDTO incomingTC;

    @Schema(name = "outgingTC", description = "The TC from this church")
    private TransferCertificateDTO outgingTC;

}
