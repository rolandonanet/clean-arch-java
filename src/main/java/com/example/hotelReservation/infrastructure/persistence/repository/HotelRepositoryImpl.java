package com.example.hotelReservation.infrastructure.persistence.repository;

import com.example.hotelReservation.application.dto.HotelDTO;
import com.example.hotelReservation.application.gateway.HotelGateway;
import com.example.hotelReservation.infrastructure.persistence.entity.HotelEntity;
import com.example.hotelReservation.infrastructure.persistence.jpa.HotelJpaRepository;
import com.example.hotelReservation.infrastructure.persistence.mapper.HotelMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class HotelRepositoryImpl implements HotelGateway {

    private final HotelJpaRepository hotelJpaRepository;

    @Override
    public HotelDTO findById(Long hotelId) {
        return null;
    }

    @Override
    public HotelDTO save(HotelDTO hotel) {
        HotelEntity hotelToSave = HotelMapper.map.dtoToEntity(hotel);
        HotelEntity savedHotel = hotelJpaRepository.save(hotelToSave);
        return HotelMapper.map.entityToDTO(savedHotel);
    }
}
