package io.github.nidheeshnelson.mega_church.modules.office.certificate.dto;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "TransferCertificateDTO")
public class TransferCertificateDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

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
