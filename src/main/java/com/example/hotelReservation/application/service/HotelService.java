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

    public void updateHotel(Long hotelId, Hotel hotel) {

        if (!hotelGatewayRepository.exists(hotelId)){}

        hotel.setId(hotelId);
        hotelGatewayRepository.save(hotel);

    }
}
