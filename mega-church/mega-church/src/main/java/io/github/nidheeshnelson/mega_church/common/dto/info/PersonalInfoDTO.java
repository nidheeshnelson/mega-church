package io.github.nidheeshnelson.mega_church.common.dto.info;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

import io.github.nidheeshnelson.mega_church.common.dto.NameDTO;
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
    private String gender;

    @Schema(description = "Nationality of the individual", example = "American")
    private String nationality;

    @Schema(description = "Unique identification number for the individual", example = "123456789")
    private String idNumber;

    @Schema(description = "Passport number of the individual", example = "A12345678")
    private String passportNumber;

    @Schema(description = "Marital status of the individual", example = "Single")
    private String maritalStatus;

    @Schema(description = "Name of the spouse, if applicable", example = "Jane Doe")
    private String spouseName;

}
