package com.example.desafiotutor.infrastructure.persistence.repository;

import com.example.desafiotutor.application.dto.HotelDTO;
import com.example.desafiotutor.application.gateway.HotelGateway;
import com.example.desafiotutor.infrastructure.persistence.entity.HotelEntity;
import com.example.desafiotutor.infrastructure.persistence.jpa.HotelJpaRepository;
import com.example.desafiotutor.infrastructure.persistence.mapper.HotelMapper;
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
