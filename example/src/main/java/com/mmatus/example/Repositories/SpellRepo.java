package com.mmatus.example.Repositories;

import com.mmatus.example.Entities.Spell;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("SpellRepository")
public interface SpellRepo extends JpaRepository<Spell,Long> {
    
}