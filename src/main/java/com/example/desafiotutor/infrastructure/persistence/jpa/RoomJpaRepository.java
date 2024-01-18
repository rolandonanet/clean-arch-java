package com.example.desafiotutor.infrastructure.persistence.jpa;

import com.example.desafiotutor.infrastructure.persistence.entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomJpaRepository extends JpaRepository<HotelEntity, Long> {

}
