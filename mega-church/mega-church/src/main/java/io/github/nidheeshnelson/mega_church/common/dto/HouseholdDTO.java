package io.github.nidheeshnelson.mega_church.common.dto;

import java.time.LocalDate;
import java.util.List;

import io.github.nidheeshnelson.mega_church.common.dto.address.AddressDTO;
import io.github.nidheeshnelson.mega_church.common.dto.person.MemberDTO;
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
    private List<MemberDTO> churchMembers;

    @Schema(description = "Name of the leader in charge of the house")
    private String leaderName;

    @Schema(description = "Total number of believers in the house", example = "50")
    private int numberOfBelievers;

    @Schema(description = "Total number of non-believers in the house", example = "20")
    private int numberOfNonBelievers;

    @Schema(description = "Total number of members in the house", example = "70")
    private int totalHouseMembers;

    @Schema(description = "Total number of members in the house", example = "70")
    private int totalChurchMembers;

    @Schema(description = "The date when the house was created")
    private LocalDate createdDate;

    @Schema(description = "The date when the house was last modified")
    private LocalDate lastModifiedDate;    
}
