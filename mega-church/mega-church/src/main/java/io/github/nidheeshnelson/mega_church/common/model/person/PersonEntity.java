package io.github.nidheeshnelson.mega_church.common.model.person;

import java.util.List;

import io.github.nidheeshnelson.mega_church.common.dto.HouseholdDTO;
import io.github.nidheeshnelson.mega_church.common.dto.person.ContactDTO;
import io.github.nidheeshnelson.mega_church.common.dto.person.FamilyInfoDTO;
import io.github.nidheeshnelson.mega_church.common.dto.person.IdentityInfoDTO;
import io.github.nidheeshnelson.mega_church.common.dto.person.PersonalAddress;
import io.github.nidheeshnelson.mega_church.common.dto.person.PersonalInfoDTO;
import io.github.nidheeshnelson.mega_church.common.model.person.embeddable.Name;
import io.github.nidheeshnelson.mega_church.common.model.person.embeddable.PersonalInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Schema(name = "PersonEntity", description = "complete details of a person")
@Entity
@Table(name = "persons")
public class PersonEntity {
    
    @Schema(name = "personId")
    @Column(name = "person_id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personId;

    @Schema(name = "name")
    @Embedded
    private Name name;

    @Schema(name = "personal")
    @Embedded
    private PersonalInfo personalInfo;

    @Schema(name = "identities")
    private List<IdentityInfoDTO> identities;

    @Schema(name = "family")
    private FamilyInfoDTO family;
    
    @Schema(name = "contactDetails")
    private ContactDTO contactDetails;
    
    @Schema(name = "house")
    private HouseholdDTO house;

    @Schema(name = "address")
    private PersonalAddress address;
   
}
