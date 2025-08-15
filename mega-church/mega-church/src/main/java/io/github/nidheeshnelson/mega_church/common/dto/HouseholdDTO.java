package io.github.nidheeshnelson.mega_church.common.dto;

import java.time.LocalDate;
import java.util.List;

import io.github.nidheeshnelson.mega_church.church.dto.MemberDTO;
import io.github.nidheeshnelson.mega_church.common.dto.address.AddressDTO;
import io.github.nidheeshnelson.mega_church.common.dto.person.PersonDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Represents a House or Group within the church")
public class HouseholdDTO {

    @Schema(description = "Unique identifier for the house", example = "1")
    private Long houseId;

    @Schema(description = "Name of the house or group", example = "Alpha Group")
    private String houseName;

    @Schema(description = "Address of the house or group")
    private AddressDTO address;

    @Schema(description = "List of members in the house")
    private List<PersonDTO> houseMembers;

}
