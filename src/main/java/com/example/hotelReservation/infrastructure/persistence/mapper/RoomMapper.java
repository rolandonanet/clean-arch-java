package com.example.hotelReservation.infrastructure.persistence.mapper;

import com.example.hotelReservation.entities.Room;
import com.example.hotelReservation.infrastructure.persistence.entity.RoomEntity;
import org.mapstruct.factory.Mappers;

public interface RoomMapper {
    RoomMapper map = Mappers.getMapper(RoomMapper.class);
    RoomEntity roomToEntity(Room room);
    Room entityToRoom(RoomEntity roomEntity);
}
