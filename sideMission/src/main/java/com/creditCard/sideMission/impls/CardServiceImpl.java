package com.creditCard.sideMission.impls;

import com.creditCard.sideMission.models.Card;
import com.creditCard.sideMission.repository.CardRepository;
import com.creditCard.sideMission.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    public Card createCard(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public Optional<Card> getCardById(Long id) {
        return cardRepository.findById(id);
    }

    @Override
    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    @Override
    public void deleteCard(Long id) {
        cardRepository.deleteById(id);
    }
}
