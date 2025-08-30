package io.github.nidheeshnelson.mega_church.common.model.person;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Schema(name = "SkillsEntity")
@Table(name = "skills")
public class SkillsEntity {
    
    @Schema(name = "skillId")
    @Column(name = "skill_id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillId;

    @Schema(name = "skill")
    @Column(name = "skill", length = 100, nullable = false, unique = true)
    private String skill;

    @Schema(name = "description")
    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "skills")
    @JsonIgnore
    private List<PersonEntity> persons;

}
