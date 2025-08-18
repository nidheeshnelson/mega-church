package io.github.nidheeshnelson.mega_church.user.recovery.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.nidheeshnelson.mega_church.user.recovery.model.AppUser;

public interface UserRepo extends JpaRepository<AppUser, Long> {
  Optional<AppUser> findByEmailIgnoreCase(String email);
  Optional<AppUser> findByPhoneE164(String phone);
}