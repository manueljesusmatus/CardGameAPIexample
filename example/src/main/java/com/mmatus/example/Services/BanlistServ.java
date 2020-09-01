package com.mmatus.example.Services;

import java.util.List;

import com.mmatus.example.DTOentities.DTObanlist;
import com.mmatus.example.Entities.Banlist;
import com.mmatus.example.Repositories.BanlistRepo;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
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
	
	public List<Banlist> readBanListInfo(){
		return banListRepo.findAll();
	}

	public Banlist readBanlistByIdCard(Long id){
		return banListRepo.findByIdCard(id);
	}

	public List<DTObanlist> convertToDTO(List<Banlist> listCard){
		ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(listCard,  new TypeToken<List<DTObanlist>>() {}.getType());
	}

	public DTObanlist convertToDTO(Banlist instancia){
		ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(instancia, DTObanlist.class);
	}
}