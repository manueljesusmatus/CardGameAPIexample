package com.mmatus.example.Services;

import com.mmatus.example.Entities.SkillCard;
import com.mmatus.example.Repositories.SkillCardsRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("SkillCardService")
public class SkillCardServ {
    
    @Autowired
	@Qualifier("SkillCardRepository")
    private SkillCardsRepo skillcardRepo;

    public boolean createSkillCard( SkillCard instancia) {
		try {
			skillcardRepo.save( instancia );
			return true;
		}catch(Exception e) {
			return false;
		}
    }
}