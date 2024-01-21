package com.example.hotelReservation.infrastructure.persistence.entity;

import com.example.hotelReservation.domain.model.Hotel;
import com.example.hotelReservation.domain.model.RoomStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hotel")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class HotelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Hotel hotel;

    @OneToOne
    @JoinColumn(name = "id")
    private AddressEntity address;

    @OneToMany
    private List<RoomEntity> rooms;

    private RoomStatus status;
}
