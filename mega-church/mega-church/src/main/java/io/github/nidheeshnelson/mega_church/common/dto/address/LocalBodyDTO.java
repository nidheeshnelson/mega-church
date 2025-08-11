package io.github.nidheeshnelson.mega_church.common.dto.address;

import java.io.Serial;
import java.io.Serializable;

import io.github.nidheeshnelson.mega_church.common.enumeration.LocalBodyType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Local self-government body (LSG) details")
public class LocalBodyDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "Name of the local body", example = "Thrikkakara Municipality")
    private String name;
    
    @Schema(description = "Type of the local body (Panchayat, Municipality, Corporation, etc.)")
    private LocalBodyType type;

    @Schema(description = "Address of the local body")
    private AddressDTO OfficeAddress;
}
