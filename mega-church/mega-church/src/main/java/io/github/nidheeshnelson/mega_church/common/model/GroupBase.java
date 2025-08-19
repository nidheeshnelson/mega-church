package io.github.nidheeshnelson.mega_church.common.model;

import java.util.HashSet;
import java.util.Set;

import io.github.nidheeshnelson.mega_church.user.register.model.User;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // or JOINED
@DiscriminatorColumn(name = "group_type", discriminatorType = DiscriminatorType.STRING)
@Table(name = "groups")
@Getter @Setter
public abstract class GroupBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, length=120)
    private String name;

    @Column(length=500)
    private String description;

    @ManyToMany
    @JoinTable(
        name = "group_members",
        joinColumns = @JoinColumn(name = "group_id"),
        inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<User> members = new HashSet<>();

    public void addMember(User user) {
        if (members.add(user)) {
            user.getGroups().add(this);
        }
    }

    public void removeMember(User user) {
        if (members.remove(user)) {
            user.getGroups().remove(this);
        }
    }
}
