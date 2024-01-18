package com.example.desafiotutor.application.gateway;

import com.example.desafiotutor.application.dto.HotelDTO;

public interface HotelGateway {
    HotelDTO findById(Long hotelId);
    HotelDTO save(HotelDTO hotel);
}
