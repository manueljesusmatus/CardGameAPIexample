package com.mmatus.example.Repositories;

import java.util.List;

import com.mmatus.example.Entities.Card;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("CardRepository")
public interface CardRepo extends JpaRepository<Card,Long> {


    public abstract Card findById(long id);

    public abstract Page<Card> findAll(Pageable pageable);

    public abstract List<Card> findAll();
    
}