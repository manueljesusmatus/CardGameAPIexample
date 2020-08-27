package com.mmatus.example.Services;

import java.util.List;

import com.mmatus.example.Entities.Card;
import com.mmatus.example.Repositories.CardRepo;

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

	public boolean createCard(Card instancia) {
		try {
			cardRepo.save(instancia);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Card readById(long id) {
		return cardRepo.findById(id);
	}

	public List<Card> readAllCardsByPage(int page, int size) {
		Pageable pageable = PageRequest.of(page, size);
		Page<Card> result = cardRepo.findAll(pageable);
		return result.getContent();
	}

	public Page<Card> readAllCardsByPagev2(int page, int size) {
		Pageable pageable = PageRequest.of(page, size);
		return cardRepo.findAll(pageable);
	}

	public List<Card> readByFilters(int atk, int def, int level) {
		return cardRepo.findAll();
	}
}