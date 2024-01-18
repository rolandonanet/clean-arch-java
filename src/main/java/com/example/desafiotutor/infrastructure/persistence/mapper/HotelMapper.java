package com.example.desafiotutor.infrastructure.persistence.mapper;

import com.example.desafiotutor.application.dto.HotelDTO;
import com.example.desafiotutor.infrastructure.persistence.entity.HotelEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HotelMapper {
    HotelMapper map = Mappers.getMapper(HotelMapper.class);

    HotelEntity dtoToEntity(HotelDTO hotelDTO);

    HotelDTO entityToDTO(HotelEntity hotelEntity);
}
