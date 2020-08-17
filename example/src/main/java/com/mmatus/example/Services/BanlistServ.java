package com.mmatus.example.Services;

import com.mmatus.example.Entities.Banlist;
import com.mmatus.example.Repositories.BanlistRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("BanlistService")
public class BanlistServ {

    @Autowired
	@Qualifier("BanlistRepository")
	private BanlistRepo banListRepo;
    
    public boolean createBanlist( Banlist instancia ) {
		try {
			banListRepo.save( instancia );
			return true;
		}catch(Exception e) {
			return false;
		}
    }
}