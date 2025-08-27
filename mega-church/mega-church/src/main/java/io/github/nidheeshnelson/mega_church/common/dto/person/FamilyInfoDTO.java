package io.github.nidheeshnelson.mega_church.common.dto.person;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "FamilyInfoDTO", description = "Family relationships of the individual")
public class FamilyInfoDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(name = "father", description = "Father (if known)")
    private PersonRefDTO father;

    @Schema(name = "mother", description = "Mother (if known)")
    private PersonRefDTO mother;

    @Schema(name = "guardian", description = "Guardian (if applicable)")
    private PersonRefDTO guardian;

    @Schema(name = "spouse", description = "Spouse (if applicable)")
    private PersonRefDTO spouse;

    @Schema(name = "children", description = "Children (if any)")
    private List<PersonRefDTO> children; // note: lower camelCase

    @Schema(name = "siblings", description = "Siblings (if any)")
    private List<PersonRefDTO> siblings; // Added siblings
}