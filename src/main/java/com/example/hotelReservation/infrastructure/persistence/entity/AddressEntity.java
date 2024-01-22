package com.example.hotelReservation.infrastructure.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "address")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddressEntity {

    private Long id;
    private String street;
    private String zipcode;
    private String country;


}