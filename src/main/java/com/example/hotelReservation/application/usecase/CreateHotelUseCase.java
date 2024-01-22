package com.example.hotelReservation.application.usecase;

import com.example.hotelReservation.application.service.HotelService;
import com.example.hotelReservation.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class CreateHotelUseCase {

    @Autowired
    private HotelService hotelService;
    public Hotel execute(Hotel hotel){
       return hotelService.createHotel(hotel);
    }
}
