package com.example.hotelReservation.application.usecase;

import com.example.hotelReservation.application.dto.HotelDTO;
import com.example.hotelReservation.application.service.HotelService;
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
