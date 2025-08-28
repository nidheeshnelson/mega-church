package io.github.nidheeshnelson.mega_church.common.model.person.embeddable;

import io.github.nidheeshnelson.mega_church.common.model.person.PersonEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Schema(name = "PersonRef")
@Embeddable
public class PersonRef {

    @Schema(name = "personRegistered", description = "check for the person is registored")
    @Column(name = "person_registered")
    private boolean personRegistered;

    @Schema(name = "personRef", description = "consider it if the person is registered")
    @ManyToOne
    @JoinColumn(name = "person_id")
    private PersonEntity person;

    @Schema(name = "name", description = "Display name", example = "Jane Doe")
    @Column(name = "person_name")
    private String personName;
}
