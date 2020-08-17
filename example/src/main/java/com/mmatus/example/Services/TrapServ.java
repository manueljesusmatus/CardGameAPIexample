package com.mmatus.example.Services;

import com.mmatus.example.Entities.Trap;
import com.mmatus.example.Repositories.TrapRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("TrapService")
public class TrapServ {
    
    @Autowired
	@Qualifier("TrapRepository")
    private TrapRepo trapRepo;

    public boolean createTrap( Trap instancia) {
		try {
			trapRepo.save( instancia );
			return true;
		}catch(Exception e) {
			return false;
		}
    }
}