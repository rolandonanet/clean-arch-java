package com.example.hotelReservation.infrastructure.persistence.entity;

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

    private String name;

    @OneToOne
    @JoinColumn(name = "address_id")
    private AddressEntity address;

    @OneToMany
    @JoinColumn(name = "hotel_id")
    private List<RoomEntity> rooms;

}
