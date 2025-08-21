package io.github.nidheeshnelson.mega_church.common.dto.person;

import java.io.Serial;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Lightweight reference to a person to avoid deep object graphs")
public class PersonRefDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "Unique ID of the referenced person", example = "PER-000123")
    private String RefId;

    @Schema(description = "Display name", example = "Jane Doe")
    private String name;
}