package com.example.hotelReservation.infrastructure.persistence.mapper;

import com.example.hotelReservation.entities.Hotel;
import com.example.hotelReservation.infrastructure.persistence.entity.HotelEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HotelMapper {
    HotelMapper map = Mappers.getMapper(HotelMapper.class);

    HotelEntity hotelToEntity(Hotel hotel);

    Hotel entityToHotel(HotelEntity hotelEntity);
}
