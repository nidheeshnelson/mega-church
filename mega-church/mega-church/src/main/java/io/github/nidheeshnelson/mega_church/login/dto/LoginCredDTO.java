package io.github.nidheeshnelson.mega_church.login.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "DTO for login with username and password")
public class LoginCredDTO {

    @Schema(description = "Username for login", required = true)
    private String username;

    @Schema(description = "Password for login", required = true)
    private String password;

}
