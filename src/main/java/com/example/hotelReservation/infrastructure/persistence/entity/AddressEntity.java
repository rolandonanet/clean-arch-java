package com.example.hotelReservation.infrastructure.persistence.entity;

import com.example.hotelReservation.domain.model.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "address")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddressEntity {

    @Embedded
    private Address address;

}