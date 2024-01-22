package com.example.hotelReservation.application.usecase;

import com.example.hotelReservation.application.service.HotelService;
import com.example.hotelReservation.entities.Hotel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UpdateHotelUseCase {
    private final HotelService hotelService;
    public Hotel execute(String hotelId, Hotel hotel) {
        return  hotelService.updateHotel(hotelId, hotel);
    }
}
