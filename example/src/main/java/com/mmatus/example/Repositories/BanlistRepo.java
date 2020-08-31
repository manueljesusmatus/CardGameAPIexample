package com.mmatus.example.Repositories;

import java.util.List;

import com.mmatus.example.Entities.Banlist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("BanlistRepository")
public interface BanlistRepo extends JpaRepository<Banlist,Long> {

    public abstract List<Banlist> findAll();

    @Query(value = "SELECT c FROM Banlist c WHERE (c.id_card = :id_card)")
    public abstract Banlist findByIdCard(Long id_card);
    
}