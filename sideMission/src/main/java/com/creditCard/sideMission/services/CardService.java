package com.creditCard.sideMission.services;

import com.creditCard.sideMission.models.Card;

import java.util.List;
import java.util.Optional;

public interface CardService {
    Card createCard(Card card);
    Optional<Card> getCardById(Long id);
    List<Card> getAllCards();
    void deleteCard(Long id);
}
