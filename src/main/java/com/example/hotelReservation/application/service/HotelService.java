package com.example.hotelReservation.application.service;

import com.example.hotelReservation.adapter.gateway.repository.HotelGatewayRepository;
import com.example.hotelReservation.entities.Hotel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class HotelService {

    private final HotelGatewayRepository hotelGatewayRepository;
    public Hotel createHotel(Hotel hotel){
        return hotelGatewayRepository.save(hotel);
    }

    public List<Hotel> listHotels() {
        return hotelGatewayRepository.list();
    }

    public Hotel updateHotel(String hotelId, Hotel hotel) {
        return null;
    }
}
