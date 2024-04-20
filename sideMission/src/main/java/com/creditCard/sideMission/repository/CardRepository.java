package com.creditCard.sideMission.repository;

import com.creditCard.sideMission.models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
