package io.github.nidheeshnelson.mega_church.common.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import java.util.List;

@Data
@Schema(name = "FamilyDTO",description = "Family or household unit of members")
public class FamilyDTO {

    @Schema(description = "Unique ID of the family")
    private Long familyId;

    @Schema(description = "Name of the family or head of household", example = "Doe Family")
    private String familyName;

    @Schema(description = "List of members belonging to this family")
    private List<MemberDTO> members;
}
