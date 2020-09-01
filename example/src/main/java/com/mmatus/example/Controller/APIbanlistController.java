package com.mmatus.example.Controller;

import java.util.List;

import com.mmatus.example.Entities.Banlist;
import com.mmatus.example.Services.BanlistServ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("BanListController")
@RequestMapping("/api/v1")
public class APIbanlistController {
    
    @Autowired
	@Qualifier("BanlistService")
    private BanlistServ banlistServ;

    @GetMapping("/BanlistInfo")
    public ResponseEntity<Object> getBanlistInfo(
                        @RequestParam(value = "id", required = false) Long id )
        {
        List<Banlist> listCard;
        if(id != null){
            Banlist instancia = banlistServ.readBanlistByIdCard(id);
            return new ResponseEntity<Object>(banlistServ.convertToDTO(instancia), HttpStatus.OK);
        }else{
            listCard = banlistServ.readBanListInfo();
            return new ResponseEntity<Object>( banlistServ.convertToDTO(listCard) , HttpStatus.OK);
        }
    }
}