package com.mmatus.example.Repositories;

import com.mmatus.example.Entities.Token;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("TokenRepository")
public interface TokenRepo extends JpaRepository<Token,Long>{
    
}