package io.github.nidheeshnelson.mega_church.common.dto.person;

import java.io.Serial;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
@Schema(name="MemberDTO", description = "Member of any entity")
public class MemberDTO extends PersonDTO {
    
    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(name = "memberId", description = "Unique ID of the member", example = "101")
    private Long memberId;

    @Schema(name = "role", description = "Unique ID of the member", example = "101")
    private String role;

}
