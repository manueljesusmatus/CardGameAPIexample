package com.mmatus.example.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mmatus.example.Entities.Banlist;
import com.mmatus.example.Entities.Card;
import com.mmatus.example.Entities.Price;
import com.mmatus.example.ErrorHandler.ErrorHandlerMessage;
import com.mmatus.example.Services.BanlistServ;
import com.mmatus.example.Services.CardServ;
import com.mmatus.example.Services.PriceServ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("AddCardController")
@RequestMapping("/api/v1")
public class AddCardsController {

	private String MESSAGE = "Error to create ID : ";

	@Autowired
	@Qualifier("CardService")
	private CardServ cardServ;

	@Autowired
	@Qualifier("BanlistService")
	private BanlistServ banServ;

	@Autowired
	@Qualifier("PriceService")
	private PriceServ priceServ;
    
    @PostMapping("/addCards")
	public ResponseEntity<List<Object>> saveCards(@RequestBody List<Card> lista){
		List<Object> errorsID = new ArrayList<Object>();
		try {
			for(Card item : lista) {
				if(!cardServ.createCard(item)){
					String errormessage = MESSAGE +  Long.toString(item.getId());
					errorsID.add(new ErrorHandlerMessage(new Date(), errormessage ));
				}
			}
			if(errorsID.isEmpty())
				return new ResponseEntity<List<Object>>(HttpStatus.CREATED);
			else
				return new ResponseEntity<List<Object>>( errorsID, HttpStatus.CONFLICT);
		}catch(Exception e) {
			return new ResponseEntity<List<Object>>(HttpStatus.BAD_REQUEST);
		}
	}


	@PostMapping("/addBanList")
	public ResponseEntity<List<Object>> saveBanLists(@RequestBody List<Banlist> lista){
		List<Object> errorsID = new ArrayList<Object>();
		try {
			for(Banlist item : lista) {
				if(!banServ.createBanlist(item)){
					String errormessage = MESSAGE +  Long.toString(item.getId());
					errorsID.add(new ErrorHandlerMessage(new Date(), errormessage ));
				}
			}
			if(errorsID.isEmpty())
				return new ResponseEntity<List<Object>>(HttpStatus.CREATED);
			else
				return new ResponseEntity<List<Object>>( errorsID, HttpStatus.CONFLICT);
		}catch(Exception e) {
			return new ResponseEntity<List<Object>>(HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/addPrices")
	public ResponseEntity<List<Object>> savePrices(@RequestBody List<Price> lista){
		List<Object> errorsID = new ArrayList<Object>();
		try {
			for(Price item : lista) {
				if(!priceServ.createPrice(item)){
					String errormessage = MESSAGE +  Long.toString(item.getId());
					errorsID.add(new ErrorHandlerMessage(new Date(), errormessage ));
				}
			}
			if(errorsID.isEmpty())
				return new ResponseEntity<List<Object>>(HttpStatus.CREATED);
			else
				return new ResponseEntity<List<Object>>( errorsID, HttpStatus.CONFLICT);
		}catch(Exception e) {
			return new ResponseEntity<List<Object>>(HttpStatus.BAD_REQUEST);
		}
	}
	

}