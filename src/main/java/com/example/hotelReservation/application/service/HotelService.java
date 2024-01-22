package com.example.hotelReservation.application.service;

import com.example.hotelReservation.adapter.gateway.repository.HotelGatewayRepository;
import com.example.hotelReservation.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {

    @Autowired
    private HotelGatewayRepository hotelGatewayRepository;
    public Hotel createHotel(Hotel hotel){

        return hotelGatewayRepository.save(hotel);
    }
}
