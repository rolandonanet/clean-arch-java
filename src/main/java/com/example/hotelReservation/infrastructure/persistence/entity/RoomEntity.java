package com.example.hotelReservation.infrastructure.persistence.entity;

import com.example.hotelReservation.domain.model.RoomStatus;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "room")
@Data
public class RoomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int number;

    private double price;

    @Enumerated(EnumType.STRING)
    private RoomStatus status;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private HotelEntity hotel;

}
