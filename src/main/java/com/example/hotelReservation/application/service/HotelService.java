package com.example.hotelReservation.application.service;

import com.example.hotelReservation.adapter.gateway.repository.HotelGatewayRepository;
import com.example.hotelReservation.entities.Hotel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class HotelService {
    
    private final HotelGatewayRepository hotelGatewayRepository;
    public Hotel createHotel(Hotel hotel){
        return hotelGatewayRepository.save(hotel);
    }
}
