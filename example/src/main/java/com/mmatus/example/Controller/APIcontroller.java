package com.mmatus.example.Controller;

import java.util.Date;
import java.util.List;

import com.mmatus.example.Entities.Card;
import com.mmatus.example.ErrorHandler.ErrorHandlerMessage;
import com.mmatus.example.Services.CardServ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
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

	String NOT_FOUND_MESSAGE = "Not Found";
	String PAGE_MESSAGE = "Page : ";
    
    @GetMapping("/Card")
	public ResponseEntity<Object> getCardById( 
			@RequestParam(required = true) long id
			){
		Card card = cardServ.readById(id);
		if(card == null) {
			String errormessage = "ID : " + Long.toString(id) + NOT_FOUND_MESSAGE;
			ErrorHandlerMessage error = new ErrorHandlerMessage( new Date(), errormessage);
			return new ResponseEntity<Object>(error,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Object>(card, HttpStatus.OK);
	}


	@GetMapping("/Cards")
	public ResponseEntity<Object> getCardsFilters( 
			@RequestParam(value = "atk",required = false) Integer atk,
			@RequestParam(value = "def",required = false) Integer def,
			@RequestParam(value = "level",required = false) Integer level,
			@RequestParam(value = "type",required = false) String type,
			@RequestParam(value = "race",required = false) String race
			){
		List<Card> listCard = cardServ.readAllCards(atk, def, level, type, race);
		return new ResponseEntity<Object>(listCard, HttpStatus.OK);
	}

	@GetMapping("/CardsPage")
	public ResponseEntity<Object> getCardsFiltersv2( 
			@RequestParam(value = "atk",required = false) Integer atk,
			@RequestParam(value = "def",required = false) Integer def,
			@RequestParam(value = "level",required = false) Integer level,
			@RequestParam(value = "type",required = false) String type,
			@RequestParam(value = "race",required = false) String race,
			@RequestParam(value = "page",required = false, defaultValue = "0") Integer page,
			@RequestParam(value = "size",required = false, defaultValue = "10") Integer size
			){
		if(size > 20){
			size = 20;
		}else if(size < 10){
			size = 10;
		}
		Page<Card> listCard = cardServ.readAllCardsV2(atk, def, level, page, size, type, race);
		return new ResponseEntity<Object>(listCard, HttpStatus.OK);
	}
}