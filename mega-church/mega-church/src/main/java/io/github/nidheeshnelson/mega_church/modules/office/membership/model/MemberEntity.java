package io.github.nidheeshnelson.mega_church.modules.office.membership.model;

import java.time.LocalDate;

import io.github.nidheeshnelson.mega_church.common.model.person.PersonEntity;
import io.github.nidheeshnelson.mega_church.modules.office.certificate.dto.TransferCertificateDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
@Schema(name = "MemberEntity")
public class MemberEntity {

    @Schema(name = "memberId")
    @Column(name = "member_id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Schema(name = "person", description = "details about a person")
    @OneToOne
    @JoinColumn(name = "person_id")
    private PersonEntity person;

    @Schema(name = "baptized", description = "To know the person is baptized")
    private boolean baptized;

    @Schema(name = "baptizedDate", description = "The baptizedDate date of a person")
    private LocalDate baptizedDate;

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
