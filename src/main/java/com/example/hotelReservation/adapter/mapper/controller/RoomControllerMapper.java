package com.example.hotelReservation.adapter.mapper.controller;

import com.example.hotelReservation.adapter.dto.HotelRequestDTO;
import com.example.hotelReservation.adapter.dto.HotelResponseDTO;
import com.example.hotelReservation.adapter.dto.RoomRequestDTO;
import com.example.hotelReservation.adapter.dto.RoomResponseDTO;
import com.example.hotelReservation.entities.Room;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface RoomControllerMapper {
    RoomControllerMapper map = Mappers.getMapper(RoomControllerMapper.class);
    Room roomRequestDtoToRoom(RoomRequestDTO roomRequestDTO);
    RoomRequestDTO roomToRoomRequestDto(Room room);
    Room roomResponseDtoToRoom(HotelResponseDTO roomResponseDTO);
    RoomResponseDTO roomToRoomResponseDto(Room room);
    List<RoomResponseDTO> listRoomToListRoomResponseDto(List<Room> rooms);
}
