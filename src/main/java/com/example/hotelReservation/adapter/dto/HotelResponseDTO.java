package com.example.hotelReservation.adapter.dto;

import com.example.hotelReservation.entities.Address;
import com.example.hotelReservation.entities.RoomStatus;

import java.util.List;

public class HotelResponseDTO {
    private Long id;
    private String name;
    private Address address;
    private List<RoomRequestDTO> rooms;
    private RoomStatus status;

}
