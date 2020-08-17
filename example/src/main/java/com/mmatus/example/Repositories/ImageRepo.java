package com.mmatus.example.Repositories;

import com.mmatus.example.Entities.Image;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ImageRepository")
public interface ImageRepo extends JpaRepository<Image,Long> {
    
}