package io.github.nidheeshnelson.mega_church.common.model.ministryrootbase;

import java.util.ArrayList;
import java.util.List;

import io.github.nidheeshnelson.mega_church.common.enumeration.MinistryRootBaseEntityType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "entities", indexes = {
@Index(name = "idx_entities_type", columnList = "type")
})
@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor 
@Builder
public class RootBaseEntity {
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false, length = 32)
  private MinistryRootBaseEntityType type; // VISION / MISSION / SERVICE

  @Column(nullable = false, length = 200)
  private String name;

  @Column(columnDefinition = "text")
  private String description;

  @OneToMany(mappedBy = "root", cascade = CascadeType.ALL, orphanRemoval = true)
  @Builder.Default
  private List<Job> jobs = new ArrayList<>();
}
