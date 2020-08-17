package com.mmatus.example.Services;

import com.mmatus.example.Entities.Image;
import com.mmatus.example.Repositories.ImageRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("ImageService")
public class ImageServ {
    
    @Autowired
	@Qualifier("ImageRepository")
	private ImageRepo imageRepo;
    
    public boolean createImage( Image instancia ) {
		try {
			imageRepo.save( instancia );
			return true;
		}catch(Exception e) {
			return false;
		}
    }
}