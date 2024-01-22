package com.example.hotelReservation.adapter.dto;
import com.example.hotelReservation.entities.Address;
import com.example.hotelReservation.entities.RoomStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HotelRequestDTO {
    private String name;
    private Address address;
    private List<RoomRequestDTO> rooms;
    private RoomStatus status;

}

