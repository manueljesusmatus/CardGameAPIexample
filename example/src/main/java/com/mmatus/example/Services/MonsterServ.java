package com.mmatus.example.Services;

import com.mmatus.example.Entities.Monster;
import com.mmatus.example.Repositories.MonsterRepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("MonsterService")
public class MonsterServ {
    
    @Autowired
	@Qualifier("MonsterRepository")
    private MonsterRepo monsterRepo;

    public boolean createMonster( Monster instancia) {
		try {
			monsterRepo.save( instancia );
			return true;
		}catch(Exception e) {
			return false;
		}
    }
}