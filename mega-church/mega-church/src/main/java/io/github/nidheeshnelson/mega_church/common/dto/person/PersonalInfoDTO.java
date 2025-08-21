package io.github.nidheeshnelson.mega_church.common.dto.person;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import io.github.nidheeshnelson.mega_church.common.enumeration.Gender;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Represents the personal information of an individual")
public class PersonalInfoDTO implements Serializable {
    
    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "Date of birth of the individual", example = "1985-05-15")
    private LocalDate dateOfBirth;

    @Schema(description = "Gender of the individual", example = "Male")
    private Gender gender;

    @Schema(description = "Nationality of the individual", example = "American")
    private String nationality;

}
