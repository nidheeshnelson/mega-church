package io.github.nidheeshnelson.mega_church.common.dto.person;

import java.io.Serial;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "NameDTO", description = "Represents a Name object with first, middle, and last names")
public class NameDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(name = "firstName", description = "First name of the person", example = "John")
    private String firstName;

    @Schema(name = "middleName", description = "Middle name of the person", example = "William")
    private String middleName;

    @Schema(name = "lastName", description = "Last name of the person", example = "Doe")
    private String lastName;

}
