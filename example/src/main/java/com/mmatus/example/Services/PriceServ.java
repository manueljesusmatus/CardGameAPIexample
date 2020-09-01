package com.mmatus.example.Services;

import java.util.List;

import com.mmatus.example.DTOentities.DTOprice;
import com.mmatus.example.Entities.Price;
import com.mmatus.example.Repositories.PriceRepo;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("PriceService")
public class PriceServ {
    
    @Autowired
	@Qualifier("PriceRepository")
	private PriceRepo priceRepo;
    
    public boolean createPrice( Price instancia ) {
		try {
			priceRepo.save( instancia );
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<Price> readPriceInfo(){
		return priceRepo.findAll();
	}

	public Price readPriceByIdCard(Long id){
		return priceRepo.findByIdCard(id);
	}

	public List<DTOprice> convertToDTO(List<Price> listCard){
		ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(listCard,  new TypeToken<List<DTOprice>>() {}.getType());
	}

	public DTOprice convertToDTO(Price instancia){
		ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(instancia, DTOprice.class);
	}
}