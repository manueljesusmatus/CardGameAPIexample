package com.mmatus.example.Services;

import com.mmatus.example.Entities.Token;
import com.mmatus.example.Repositories.TokenRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("TokenService")
public class TokenServ {
    
    @Autowired
	@Qualifier("TokenRepository")
    private TokenRepo tokenRepo;

    public boolean createToken( Token instancia) {
		try {
			tokenRepo.save( instancia );
			return true;
		}catch(Exception e) {
			return false;
		}
    }
}