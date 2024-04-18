package com.techelevator.model;

import java.util.Objects;

public class FlashCard {
    private int cardId;
    private String question;
    private String answer;

    public FlashCard(int cardId, String question, String answer) {
        this.cardId = cardId;
        this.question = question;
        this.answer = answer;
    }

    public FlashCard() {
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlashCard flashCard = (FlashCard) o;
        return cardId == flashCard.cardId && Objects.equals(question, flashCard.question) && Objects.equals(answer, flashCard.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId, question, answer);
    }
}
