package io.github.nidheeshnelson.mega_church.common.dto.person;

import java.io.Serial;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "PersonRefDTO", description = "Lightweight reference to a person to avoid deep object graphs")
public class PersonRefDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(name = "personRegistered", description = "check for the person is registored")
    private boolean personRegistered;

    @Schema(name = "personRef", description = "consider it if the person is registered")
    private PersonDTO person;

    @Schema(name = "name", description = "Display name", example = "Jane Doe")
    private String personName;
}