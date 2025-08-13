package io.github.nidheeshnelson.mega_church.common.dto.person;

import java.io.Serial;
import java.time.LocalDate;
import java.util.List;

import io.github.nidheeshnelson.mega_church.common.dto.HouseholdDTO;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "PastorDTO",description = "Represents a Pastor in the church")
public class PastorDTO extends PersonDTO {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "Role or title of the pastor within the church", example = "Lead Pastor")
    private String title;

    @Schema(description = "Date the pastor joined the church", example = "2010-05-01")
    private LocalDate joinedDate;

    @Schema(description = "The department or ministry the pastor oversees", example = "Youth Ministry")
    private String ministry;

    @Schema(description = "List of houses or groups the pastor oversees", example = "[\"Alpha Group\", \"Beta Group\"]")
    private List<HouseholdDTO> houseNames;

    @Schema(description = "Date when the pastor's details were last updated")
    private LocalDate lastModifiedDate;

}
