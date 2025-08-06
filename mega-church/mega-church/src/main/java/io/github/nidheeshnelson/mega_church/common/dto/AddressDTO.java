package io.github.nidheeshnelson.mega_church.common.dto;

import java.io.Serial;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * Data Transfer Object representing a full address structure,
 * including hierarchical administrative location references for Kerala, India.
 * Ideal for use with church members, events, or ministry locations.
 * Modular and reusable for filtering, sorting, and cascading selections.
 * 
 * @author Nidheesh_Nelson
 */
@Data
@Schema(name = "AddressDTO", description = "Complete hierarchical address details")
public class AddressDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "House or building name", example = "Thanal House")
    private String houseName;

    @Schema(description = "Street or road name", example = "Kuravankonam Road")
    private String street;

    @Schema(description = "Local area or neighborhood", example = "Pattom")
    private String locality;

    @Schema(description = "Country information")
    private CountryDTO country;

    @Schema(description = "State details")
    private StateDTO state;

    @Schema(description = "District information")
    private DistrictDTO district;

    @Schema(description = "Taluk or sub-district")
    private TalukDTO taluk;

    @Schema(description = "PIN code details")
    private PinCodeDTO pinCode;

    @Schema(description = "Post office details")
    private PostOfficeDTO postOffice;

    @Schema(description = "Local government body like Panchayat or Municipality")
    private LocalBodyDTO localBody;
}