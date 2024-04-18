package com.techelevator.dao;

import com.techelevator.model.FlashCard;

import java.util.List;

public interface FlashCardDao {
    FlashCard getFlashCardById(int id);

    List<FlashCard> getFlashCards();

    FlashCard createFlashCard(FlashCard flashCard);

    FlashCard updateFlashCard(FlashCard updatedCard) throws Exception;

    int deleteFlashCard(int id);
}
