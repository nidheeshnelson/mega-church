package io.github.nidheeshnelson.mega_church.common.model.ministryrootbase;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table(name = "works")
public class Work {
            
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, length = 200)
  private String name;

  @Column(columnDefinition = "text")
  private String description;

  @OneToMany(mappedBy = "root", cascade = CascadeType.ALL, orphanRemoval = true)
  @Builder.Default
  private List<Task> task = new ArrayList<>();
}
