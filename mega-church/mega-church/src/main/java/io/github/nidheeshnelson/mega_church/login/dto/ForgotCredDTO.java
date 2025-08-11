package io.github.nidheeshnelson.mega_church.login.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

@Schema(description = "DTO for sending username and password to the user's email or phone number")
public class ForgotCredDTO {

    @Schema(description = "Email address for sending username and password (optional)", example = "user@example.com")
    @Email(message = "Invalid email address")
    private String email;

    @Schema(description = "Phone number for sending username and password (optional)", example = "+1234567890")
    @Pattern(regexp = "^[+]?[0-9]{10,15}$", message = "Invalid phone number")
    private String phone;   
}
