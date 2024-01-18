package com.example.desafiotutor.application.dto;

import com.example.desafiotutor.adapter.dto.RoomRequestDTO;
import com.example.desafiotutor.domain.model.Address;
import com.example.desafiotutor.domain.model.RoomStatus;


import java.util.List;


public class HotelDTO {
    private String name;
    private Address address;
    private List<RoomRequestDTO> rooms;
    private RoomStatus status;

    public HotelDTO() {
    }

    public HotelDTO(String name, Address address, List<RoomRequestDTO> rooms, RoomStatus status) {
        this.name = name;
        this.address = address;
        this.rooms = rooms;
        this.status = status;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<RoomRequestDTO> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomRequestDTO> rooms) {
        this.rooms = rooms;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }
}
