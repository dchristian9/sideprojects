package com.techelevator.dao;

import com.techelevator.model.FlashCard;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcFlashCardDao implements FlashCardDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcFlashCardDao(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public FlashCard getFlashCardById(int id) {
        FlashCard flashCard = null;
        String sql = "SELECT * FROM flash_card WHERE card_id = ?";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
        while (results.next()){
            flashCard = mapRowToFlashCard(results);

        }
        return flashCard;
    }

    @Override
    public List<FlashCard> getFlashCards() {
        List <FlashCard> cards = new ArrayList<>();
        String sql = "SELECT * from flash_card;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()){
            cards.add(mapRowToFlashCard(results));
        }
        return cards;
    }

    @Override
    public FlashCard createFlashCard(FlashCard flashCard) {
        int newCard;
        String sql = "INSERT INTO flash_card (question, answer) " +
                "VALUES (?, ?);";

        newCard = jdbcTemplate.queryForObject(sql, int.class, flashCard.getQuestion(), flashCard.getAnswer());

        return getFlashCardById(newCard);
    }

    @Override
    public FlashCard updateFlashCard(FlashCard updatedCard) throws Exception {
        FlashCard flashCard = null;
        String sql = "UPDATE flash_card SET question = ?, answer = ?;";

        int rowsAffected = jdbcTemplate.update(sql, updatedCard.getQuestion(), updatedCard.getAnswer());
        if(rowsAffected == 0){
            throw new Exception("Zero rows affected, expected at least one.");
        } else {
            flashCard = getFlashCardById(updatedCard.getCardId());
        }

        return flashCard;
    }

    @Override
    public int deleteFlashCard(int id) {
        int numOfRows = 0;
        String sql = "DELETE FROM flash_card WHERE card_id = ?;";

        numOfRows = jdbcTemplate.update(sql, id);
        return numOfRows;
    }

    private FlashCard mapRowToFlashCard(SqlRowSet rowSet){
        FlashCard flashCard = new FlashCard();
        flashCard.setCardId(rowSet.getInt("card_id"));
        flashCard.setQuestion(rowSet.getString("question"));
        flashCard.setAnswer(rowSet.getString("answer"));
        return flashCard;
    }
}
