package com.example.desafiotutor.application.service;

import com.example.desafiotutor.adapter.gateway.repository.HotelGateway;
import com.example.desafiotutor.application.dto.HotelDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {

    @Autowired
    private HotelGateway hotelGateway;
    public HotelDTO createHotel(HotelDTO hotel){

        return hotelGateway.save(hotel);
    }
}
