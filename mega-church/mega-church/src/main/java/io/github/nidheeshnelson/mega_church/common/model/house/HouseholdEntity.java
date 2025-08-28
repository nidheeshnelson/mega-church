package io.github.nidheeshnelson.mega_church.common.model.house;

import java.util.List;

import io.github.nidheeshnelson.mega_church.common.dto.address.QuickAddressDTO;
import io.github.nidheeshnelson.mega_church.common.dto.person.PersonRefDTO;
import io.github.nidheeshnelson.mega_church.common.model.person.embeddable.PersonRef;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Schema(name = "houseEntity")
@Entity
@Table(name = "household")
public class HouseholdEntity {
    
    @Schema(name = "houseId", description = "Unique identifier for the house", example = "1")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "house_id")
    private Long houseId;

    @Schema(name = "houseName", description = "Name of the house or group", example = "Alpha Group")
    @Column(name = "house_name")
    private String houseName;

    @Schema(name = "address", description = "Address of the house or group")
    @Column(name = "house_address")
    private QuickAddressDTO houseAddress;

    @Schema(name = "houseMembers", description = "List of members in the house")
    @ElementCollection
    @CollectionTable(
        name = "house_members",
        joinColumns = @JoinColumn(name = "house_id")
    )
    private List<PersonRef> houseMembers;

}
