package io.github.nidheeshnelson.mega_church.common.model.person.embeddable;

import java.util.List;

import io.github.nidheeshnelson.mega_church.common.dto.person.PersonRefDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.JoinColumn;

@Schema(name = "FamilyInfo")
@Embeddable
public class FamilyInfo {

    @Schema(name = "father", description = "Father (if known)")
    @Embedded
    private PersonRefDTO father;

    @Schema(name = "mother", description = "Mother (if known)")
    @Embedded
    private PersonRefDTO mother;

    @Schema(name = "guardian", description = "Guardian (if applicable)")
    @Embedded
    private PersonRefDTO guardian;

    @Schema(name = "spouse", description = "Spouse (if applicable)")
    @Embedded
    private PersonRefDTO spouse;

    @Schema(name = "children", description = "Children (if any)")
    @ElementCollection
    @CollectionTable(
        name = "person_children",
        joinColumns = @JoinColumn(name = "person_id")
    )
    private List<PersonRefDTO> children; // note: lower camelCase

    @Schema(name = "siblings", description = "Siblings (if any)")
    @ElementCollection
    @CollectionTable(
        name = "person_siblings",
        joinColumns = @JoinColumn(name = "person_id")
    )
    private List<PersonRefDTO> siblings; // Added siblings
}
