package io.github.nidheeshnelson.mega_church.common.dto.person;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import io.github.nidheeshnelson.mega_church.common.dto.ContactDTO;
import io.github.nidheeshnelson.mega_church.common.dto.HouseDTO;
import io.github.nidheeshnelson.mega_church.common.dto.NameDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Represents a Pastor in the church")
public class PastorDTO implements Serializable,PersonDTO {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "Unique identifier for the pastor", example = "1")
    private Long id;

    @Schema(description = "Full name of the pastor")
    private NameDTO name;

    @Schema(description = "Contact details of the individual")
    private ContactDTO contactDetails;

    @Schema(description = "Role or title of the pastor within the church", example = "Lead Pastor")
    private String title;

    @Schema(description = "Date the pastor joined the church", example = "2010-05-01")
    private LocalDate joinedDate;

    @Schema(description = "The department or ministry the pastor oversees", example = "Youth Ministry")
    private String ministry;

    @Schema(description = "List of houses or groups the pastor oversees", example = "[\"Alpha Group\", \"Beta Group\"]")
    private List<HouseDTO> houseNames;

    @Schema(description = "Date when the pastor's details were last updated")
    private LocalDate lastModifiedDate;

}
