package com.mmatus.example.Repositories;

import java.util.List;

import com.mmatus.example.Entities.Price;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("PriceRepository")
public interface PriceRepo extends JpaRepository<Price,Long> {

    public abstract List<Price> findAll();

    @Query(value = "SELECT c FROM Price c WHERE (c.id_card = :id_card)")
    public abstract Price findByIdCard(Long id_card);

}