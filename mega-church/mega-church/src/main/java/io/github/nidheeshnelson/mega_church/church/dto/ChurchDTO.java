package io.github.nidheeshnelson.mega_church.church.dto;

import java.io.Serial;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name="MemberDTO", description = "Personal details about a member")
public class ChurchDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;


}
