package com.mmatus.example.Repositories;

import java.util.List;

import com.mmatus.example.Entities.Card;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("CardRepository")
public interface CardRepo extends JpaRepository<Card,Long> {

    public abstract Card findById(long id);

    public abstract Page<Card> findAll(Pageable pageable);

    public abstract List<Card> findAll();

    @Query(value = "SELECT c FROM Card c WHERE (:atk is null or c.atk = :atk) and (:def is null or c.def = :def) and (:level is null or c.level = :level) and (:type is null or c.type = :type) and (:race is null or c.race = :race)",
    countQuery = "SELECT count(*) FROM Card")
    public abstract Page<Card> findWithFilters(Integer atk, Integer def, Integer level, String type, String race, Pageable pageable);

    @Query("SELECT c FROM Card c WHERE" + 
            "(:atk is null or c.atk = :atk) and " + 
            " (:def is null or c.def = :def) and " + 
            " (:level is null or c.level = :level) and " +
            " (:type is null or c.type = :type) and " +
            " (:race is null or c.race = :race)")
    public abstract List<Card> findWithFilters(Integer atk, Integer def, Integer level, String type, String race);
    
}