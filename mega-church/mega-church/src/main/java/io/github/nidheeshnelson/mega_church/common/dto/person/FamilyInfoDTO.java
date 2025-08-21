package io.github.nidheeshnelson.mega_church.common.dto.person;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Family relationships of the individual")
public class FamilyInfoDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "Father (if known)")
    private PersonRefDTO father;

    @Schema(description = "Mother (if known)")
    private PersonRefDTO mother;

    @Schema(description = "Guardian (if applicable)")
    private PersonRefDTO guardian;

    @Schema(description = "Spouse (if applicable)")
    private PersonRefDTO spouse;

    @Schema(description = "Children (if any)")
    private List<PersonRefDTO> children; // note: lower camelCase

    @Schema(description = "Siblings (if any)")
    private List<PersonRefDTO> siblings; // Added siblings
}