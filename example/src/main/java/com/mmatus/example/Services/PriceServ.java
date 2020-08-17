package com.mmatus.example.Services;

import com.mmatus.example.Entities.Price;
import com.mmatus.example.Repositories.PriceRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("PriceService")
public class PriceServ {
    
    @Autowired
	@Qualifier("PriceRepository")
	private PriceRepo priceRepo;
    
    public boolean createPrice( Price instancia ) {
		try {
			priceRepo.save( instancia );
			return true;
		}catch(Exception e) {
			return false;
		}
    }
}