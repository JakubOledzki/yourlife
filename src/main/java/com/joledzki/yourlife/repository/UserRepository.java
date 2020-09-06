package com.joledzki.yourlife.repository;

import com.joledzki.yourlife.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Long, User> {
}
