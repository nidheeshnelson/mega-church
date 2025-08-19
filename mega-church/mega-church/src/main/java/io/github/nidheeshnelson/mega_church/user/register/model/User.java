package io.github.nidheeshnelson.mega_church.user.register.model;

import java.util.HashSet;
import java.util.Set;

import io.github.nidheeshnelson.mega_church.common.model.GroupBase;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   // user_id will be primary key

    private String name;

    @ManyToMany(mappedBy = "members")
    private Set<GroupBase> groups = new HashSet<>();

    // One user can have many orders
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private java.util.List<io.github.nidheeshnelson.mega_church.job.model.Task> Task;
}