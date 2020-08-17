package com.mmatus.example.Repositories;

import com.mmatus.example.Entities.SkillCard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("SkillCardRepository")
public interface SkillCardsRepo extends JpaRepository<SkillCard,Long> {
    
}