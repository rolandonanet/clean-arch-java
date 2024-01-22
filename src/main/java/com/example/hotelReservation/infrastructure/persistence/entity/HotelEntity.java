package com.example.hotelReservation.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    private String name;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "address_id")
    private AddressEntity address;

//    @OneToMany
//    @JoinColumn(name = "hotel_id")
//    private List<RoomEntity> rooms;

}
