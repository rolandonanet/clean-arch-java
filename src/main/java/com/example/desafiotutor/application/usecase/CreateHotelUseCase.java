package com.example.desafiotutor.application.usecase;

import com.example.desafiotutor.application.dto.HotelDTO;
import com.example.desafiotutor.application.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class CreateHotelUseCase {

    @Autowired
    private HotelService hotelService;
    public HotelDTO execute(HotelDTO hotel){
       return hotelService.createHotel(hotel);
    }
}
