package io.github.nidheeshnelson.mega_church.common.model.person.embeddable;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Schema(name = "Name")
@Embeddable
public class Name {

    @Schema(name = "firstName")
    @Column(name = "first_name")
    private String firstName;

    @Schema(name = "middleName")
    @Column(name = "middle_name")
    private String middleName;

    @Schema(name = "lastName")
    @Column(name = "last_name")
    private String lastName;
}
