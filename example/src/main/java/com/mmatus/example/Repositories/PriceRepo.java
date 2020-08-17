package com.mmatus.example.Repositories;

import com.mmatus.example.Entities.Price;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("PriceRepository")
public interface PriceRepo extends JpaRepository<Price,Long> {
    
}