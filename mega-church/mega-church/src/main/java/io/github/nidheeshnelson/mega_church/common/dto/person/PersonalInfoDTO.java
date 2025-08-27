package io.github.nidheeshnelson.mega_church.common.dto.person;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

import io.github.nidheeshnelson.mega_church.common.enumeration.Gender;
import io.github.nidheeshnelson.mega_church.common.enumeration.MaritalStatus;
import io.github.nidheeshnelson.mega_church.common.enumeration.Nationality;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "PersonalInfoDTO", description = "Represents the personal information of an individual")
public class PersonalInfoDTO implements Serializable {
    
    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(name = "dateOfBirth", description = "Date of birth of the individual", example = "1985-05-15")
    private LocalDate dateOfBirth;

    @Schema(name = "gender", description = "Gender of the individual", example = "Male")
    private Gender gender;

    @Schema(name = "nationality", description = "Nationality of the individual", example = "American")
    private Nationality nationality;

    @Schema(name = "maritalStatus", description = "Marital Status of a Person", example = "Married")
    private MaritalStatus maritalStatus;

}
