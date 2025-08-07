package io.github.nidheeshnelson.mega_church.common.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Represents a Name object with first, middle, and last names")
public class NameDTO {

    @Schema(description = "First name of the person", example = "John")
    private String firstName;

    @Schema(description = "Middle name of the person", example = "William")
    private String middleName;

    @Schema(description = "Last name of the person", example = "Doe")
    private String lastName;

}
