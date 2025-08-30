package io.github.nidheeshnelson.mega_church.common.dto.person;

import java.io.Serial;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "SkillsDTO")
public class SkillsDTO implements Serializable {
    
    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(name = "skillId")
    private Long skillId;

    @Schema(name = "description")
    private String description;

    @Schema(name = "skills")
    private String skills;

}
