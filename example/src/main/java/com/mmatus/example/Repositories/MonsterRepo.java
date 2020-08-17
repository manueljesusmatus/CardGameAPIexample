package com.mmatus.example.Repositories;

import com.mmatus.example.Entities.Monster;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("MonsterRepository")
public interface MonsterRepo extends JpaRepository<Monster,Long> {

    
    
}