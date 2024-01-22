package com.example.hotelReservation.adapter.gateway.repository;

import com.example.hotelReservation.entities.Hotel;

import java.util.List;

public interface HotelGatewayRepository {

    Boolean exists(Long hotelId);
    Hotel save(Hotel hotel);
    List<Hotel> list();
    Hotel findById(Long hotelId);

}
