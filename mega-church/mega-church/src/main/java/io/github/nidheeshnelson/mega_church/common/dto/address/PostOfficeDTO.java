package io.github.nidheeshnelson.mega_church.common.dto.address;

import java.io.Serial;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Post office details")
public class PostOfficeDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "Post office name", example = "Thrikkakara North PO")
    private String name;

    @Schema(description = "Associated PIN code")
    private String pinCode;
}
