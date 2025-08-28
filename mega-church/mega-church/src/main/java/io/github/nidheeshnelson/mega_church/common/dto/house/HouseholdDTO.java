package io.github.nidheeshnelson.mega_church.common.dto.house;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import io.github.nidheeshnelson.mega_church.common.dto.address.QuickAddressDTO;
import io.github.nidheeshnelson.mega_church.common.dto.person.PersonRefDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "HouseholdDTO", description = "Represents a House or Group within the church")
public class HouseholdDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(name = "houseId", description = "Unique identifier for the house", example = "1")
    private Long houseId;

    @Schema(name = "houseName", description = "Name of the house or group", example = "Alpha Group")
    private String houseName;

    @Schema(name = "address", description = "Address of the house or group")
    private QuickAddressDTO houseAddress;

    @Schema(name = "houseMembers", description = "List of members in the house")
    private List<PersonRefDTO> houseMembers;

}
