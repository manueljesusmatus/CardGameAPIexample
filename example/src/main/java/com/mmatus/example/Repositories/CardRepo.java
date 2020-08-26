package com.mmatus.example.Repositories;

import com.mmatus.example.Entities.Card;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("CardRepository")
public interface CardRepo extends JpaRepository<Card,Long> {

    public abstract Card findById(long id);
    
}