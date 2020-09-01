package com.mmatus.example.Controller;

import java.util.List;

import com.mmatus.example.Entities.Price;
import com.mmatus.example.Services.PriceServ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("PriceController")
@RequestMapping("/api/v1")
public class APIpricesController {

    @Autowired
	@Qualifier("PriceService")
    private PriceServ priceServ;

    @GetMapping("/PriceInfo")
    public ResponseEntity<Object> getPriceInfo(
                        @RequestParam(value = "id", required = false) Long id )
        {
        List<Price> listCard;
        if(id != null){
            Price instancia = priceServ.readPriceByIdCard(id);
            return new ResponseEntity<Object>(priceServ.convertToDTO(instancia), HttpStatus.OK);
        }else{
            listCard = priceServ.readPriceInfo();
            return new ResponseEntity<Object>(priceServ.convertToDTO(listCard), HttpStatus.OK);
        }
    }

}