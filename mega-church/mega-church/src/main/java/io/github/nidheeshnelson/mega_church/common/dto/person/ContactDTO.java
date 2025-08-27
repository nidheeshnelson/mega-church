package io.github.nidheeshnelson.mega_church.common.dto.person;

import java.io.Serial;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "ContactDTO", description = "Represents the contact details of an individual")
public class ContactDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(name = "email")
    private String email;

    @Schema(name = "phoneNumber")
    private String phoneNumber;

}
