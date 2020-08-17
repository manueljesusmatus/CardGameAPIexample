package com.mmatus.example.Repositories;

import com.mmatus.example.Entities.Trap;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("TrapRepository")
public interface TrapRepo extends JpaRepository<Trap,Long>{
    
}