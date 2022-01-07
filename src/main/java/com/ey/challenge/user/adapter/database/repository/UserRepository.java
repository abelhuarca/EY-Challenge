package com.ey.challenge.user.adapter.database.repository;

import com.ey.challenge.user.domain.model.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<AppUser, String> {
    AppUser findUserByUsername(String username);
}
