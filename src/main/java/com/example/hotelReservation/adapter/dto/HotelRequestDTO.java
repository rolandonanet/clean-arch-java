package com.example.hotelReservation.adapter.dto;

import com.example.hotelReservation.application.dto.HotelDTO;
import com.example.hotelReservation.domain.model.Address;
import com.example.hotelReservation.domain.model.RoomStatus;

import java.util.List;


public class HotelRequestDTO {

    private String name;
    private Address address;
    private List<RoomRequestDTO> rooms;
    private RoomStatus status;

    public HotelDTO toDTO(){
        return new HotelDTO(this.name, this.address, this.rooms, this.status);
    }
}

