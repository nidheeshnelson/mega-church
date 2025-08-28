package io.github.nidheeshnelson.mega_church.common.model.person.embeddable;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Schema(name = "Contact")
@Embeddable
public class Contact {

    @Schema(name = "email")
    @Column(name = "email")
    private String email;

    @Schema(name = "phoneNumber")
    @Column(name = "phone_number")
    private String phoneNumber;
}
