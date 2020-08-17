package com.mmatus.example.Services;

import com.mmatus.example.Entities.Spell;
import com.mmatus.example.Repositories.SpellRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("SpellService")
public class SpellServ {
    
    @Autowired
	@Qualifier("SpellRepository")
    private SpellRepo spellRepo;

    public boolean createSpell( Spell instancia) {
		try {
			spellRepo.save( instancia );
			return true;
		}catch(Exception e) {
			return false;
		}
    }
}