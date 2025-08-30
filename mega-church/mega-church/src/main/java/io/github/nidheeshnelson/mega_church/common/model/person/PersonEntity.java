package io.github.nidheeshnelson.mega_church.common.model.person;

import java.util.List;

import io.github.nidheeshnelson.mega_church.common.model.address.embeddable.QuickAddress;
import io.github.nidheeshnelson.mega_church.common.model.house.HouseholdEntity;
import io.github.nidheeshnelson.mega_church.common.model.person.embeddable.Contact;
import io.github.nidheeshnelson.mega_church.common.model.person.embeddable.FamilyInfo;
import io.github.nidheeshnelson.mega_church.common.model.person.embeddable.IdentityInfo;
import io.github.nidheeshnelson.mega_church.common.model.person.embeddable.Name;
import io.github.nidheeshnelson.mega_church.common.model.person.embeddable.PersonalInfo;
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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
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
    @ElementCollection
    @CollectionTable(
        name = "identities",               // table to store addresses
        joinColumns = @JoinColumn(name = "person_id")
    )
    private List<IdentityInfo> identities;

    @Schema(name = "family")
    @Embedded
    private FamilyInfo familyInfo;
    
    @Schema(name = "contactDetails")
    @Embedded
    private Contact contactDetails;
    
    @Schema(name = "house")
    @ManyToOne
    @JoinColumn(name = "house_id")
    private HouseholdEntity household;

    @Schema(name = "address")
    @Embedded
    private QuickAddress personalAddress;

    @Schema(name = "skills")
    @ManyToMany
    @JoinTable(
        name = "person_skill_map",
        joinColumns = @JoinColumn(name = "person_id"),
        inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    private List<SkillsEntity> skills;
   
}
