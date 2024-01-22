package com.example.hotelReservation.infrastructure.persistence.repository;

import com.example.hotelReservation.adapter.gateway.repository.HotelGatewayRepository;
import com.example.hotelReservation.entities.Hotel;
import com.example.hotelReservation.infrastructure.persistence.entity.HotelEntity;
import com.example.hotelReservation.infrastructure.persistence.jpa.HotelJpaRepository;
import com.example.hotelReservation.infrastructure.persistence.mapper.HotelMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class HotelRepositoryImpl implements HotelGatewayRepository {

    private final HotelJpaRepository hotelJpaRepository;

//    @Override
//    public HotelDTO findById(Long hotelId) {
//        return null;
//    }

    @Override
    public Hotel save(Hotel hotel) {
        HotelEntity hotelToSave = HotelMapper.map.hotelToEntity(hotel);
        HotelEntity savedHotel = hotelJpaRepository.save(hotelToSave);
        return HotelMapper.map.entityToHotel(savedHotel);
    }
}
