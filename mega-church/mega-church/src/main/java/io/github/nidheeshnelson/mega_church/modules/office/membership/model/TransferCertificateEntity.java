package io.github.nidheeshnelson.mega_church.modules.office.membership.model;

import java.time.LocalDate;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Schema(name = "TransferCertificateEntity")
public class TransferCertificateEntity {

    @Schema(name = "transferCertificateId")
    @Column(name = "transfer_certificate_id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transferCertificateId;
    
    @Schema(name = "fromChurch", description = "The church from which the member is coming")
    private String fromChurch;

    @Schema(name = "toChurch", description = "The church to which the member is going")
    private String toChurch;

    @Schema(name = "transferDate", description = "Date of transfer certificate issue")
    private LocalDate transferDate;

    @Schema(name = "transferReason", description = "Reason for transfer")
    private String transferReason;

    @Schema(name = "transferStatus", description = "Status of transfer (e.g., pending, approved, rejected)")
    private String transferStatus;

}
