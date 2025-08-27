package io.github.nidheeshnelson.mega_church.common.model.person.embeddable;

import java.time.LocalDate;

import io.github.nidheeshnelson.mega_church.common.enumeration.Gender;
import io.github.nidheeshnelson.mega_church.common.enumeration.MaritalStatus;
import io.github.nidheeshnelson.mega_church.common.enumeration.Nationality;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Schema(name = "PersonalInfo", description = "personel information of a person")
@Embeddable
public class PersonalInfo {
    
    @Column(name = "date_of_birth", nullable = true)
    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)  // Store enum as text (not ordinal numbers)
    @Column(name = "gender")
    private Gender gender;

    @Enumerated(EnumType.STRING)
    @Column(name = "nationality")
    private Nationality nationality;

    @Enumerated(EnumType.STRING)
    @Column(name = "marital_status")
    private MaritalStatus maritalStatus;
}
