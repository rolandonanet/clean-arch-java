package com.example.hotelReservation.application.gateway;

import com.example.hotelReservation.application.dto.HotelDTO;

public interface HotelGateway {
    HotelDTO findById(Long hotelId);
    HotelDTO save(HotelDTO hotel);
}
