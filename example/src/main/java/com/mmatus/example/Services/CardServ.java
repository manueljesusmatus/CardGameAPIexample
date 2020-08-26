package com.mmatus.example.Services;

import com.mmatus.example.Entities.Card;
import com.mmatus.example.Repositories.CardRepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("CardService")
public class CardServ {
    
    @Autowired
	@Qualifier("CardRepository")
    private CardRepo cardRepo;

    public boolean createCard( Card instancia) {
		try {
			cardRepo.save( instancia );
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public Card readById(long id){
		return cardRepo.findById(id);
	}
}