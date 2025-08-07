package io.github.nidheeshnelson.mega_church.common.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Represents the contact details of an individual")
public class ContactDTO {

    @Schema(description = "Email address of the individual", example = "john.doe@example.com")
    private String email;

    @Schema(description = "Phone number of the individual", example = "+1-555-555-5555")
    private String phoneNumber;

}
