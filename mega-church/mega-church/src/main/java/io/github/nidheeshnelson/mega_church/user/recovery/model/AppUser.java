package io.github.nidheeshnelson.mega_church.user.recovery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter @Setter
public class AppUser {
  @Id @GeneratedValue Long id;
  private String username;
  private String email;
  private String phoneE164;
  private String passwordHash; // BCrypt/Argon2
}
