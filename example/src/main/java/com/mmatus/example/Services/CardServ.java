package com.mmatus.example.Services;

import java.util.List;

import com.mmatus.example.DTOentities.DTOcard;
import com.mmatus.example.Entities.Card;
import com.mmatus.example.Repositories.CardRepo;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service("CardService")
public class CardServ {

	@Autowired
	@Qualifier("CardRepository")
	private CardRepo cardRepo;

	public boolean createCard( Card instancia) {
		try {
			cardRepo.save(instancia);
			return true;
		} catch ( Exception e) {
			return false;
		}
	}

	public Card readById( long id) {
		return cardRepo.findById(id);
	}

	public List<Card> readAllCards( Integer atk,  Integer def,  Integer level,  String type, String race) {
		return cardRepo.findWithFilters(atk, def, level, type, race);
	}

	public Page<Card> readAllCardsV2( Integer atk,  Integer def,  Integer level,  Integer page, Integer size,  String type,  String race) {
		Pageable pageable = PageRequest.of(page, size);
		return cardRepo.findWithFilters(atk, def, level, type, race, pageable);
	}

	public Page<DTOcard> convertToDTO(Page<Card> listCard) {
		ModelMapper modelMapper = new ModelMapper();
		return listCard.map(entity -> modelMapper.map(entity, DTOcard.class));
	}

	public List<DTOcard> convertToDTO(List<Card> listCard) {
		ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(listCard,  new TypeToken<List<DTOcard>>() {}.getType());
	}

	public DTOcard convertToDTO( Card instancia){
		ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(instancia, DTOcard.class);
	}
}