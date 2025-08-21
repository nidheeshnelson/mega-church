package io.github.nidheeshnelson.mega_church.common.model.person.embeddable;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Embeddable;

@Embeddable
public class Name {
    @Schema(description = "First name of the person", example = "John")
    private String firstName;

    @Schema(description = "Middle name of the person", example = "William")
    private String middleName;

    @Schema(description = "Last name of the person", example = "Doe")
    private String lastName;
}
