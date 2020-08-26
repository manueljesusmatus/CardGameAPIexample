package com.mmatus.example.Controller;


import java.util.Date;


import com.mmatus.example.Entities.Card;
import com.mmatus.example.ErrorHandler.ErrorHandlerMessage;
import com.mmatus.example.Services.CardServ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController("CardController")
@RequestMapping("/api/v1")
public class APIcontroller {
    
    @Autowired
	@Qualifier("CardService")
	private CardServ cardServ;
    
    
    
    @GetMapping("/Card")
	public ResponseEntity<Object> getCardById( 
			@RequestParam(required = true) long id
			){
		Card card = cardServ.readById(id);
		if(card == null) {
			String errormessage = "ID : " + Long.toString(id) + " not found";
			ErrorHandlerMessage error = new ErrorHandlerMessage( new Date(), errormessage);
			return new ResponseEntity<Object>(error,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Object>(card, HttpStatus.OK);
	}
}