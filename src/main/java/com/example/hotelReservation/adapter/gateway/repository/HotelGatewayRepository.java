package com.example.hotelReservation.adapter.gateway.repository;

import com.example.hotelReservation.entities.Hotel;

import java.util.List;

public interface HotelGatewayRepository {

    Hotel save(Hotel hotel);
    Hotel update(Hotel hotel);
    List<Hotel> list();

}
