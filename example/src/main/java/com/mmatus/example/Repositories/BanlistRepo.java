package com.mmatus.example.Repositories;

import com.mmatus.example.Entities.Banlist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("BanlistRepository")
public interface BanlistRepo extends JpaRepository<Banlist,Long> {
    
}