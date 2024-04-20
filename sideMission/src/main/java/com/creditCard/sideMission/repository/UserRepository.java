package com.creditCard.sideMission.repository;

import com.creditCard.sideMission.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
