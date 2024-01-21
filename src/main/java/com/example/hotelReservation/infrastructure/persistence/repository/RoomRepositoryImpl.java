package com.example.hotelReservation.infrastructure.persistence.repository;

import com.example.hotelReservation.domain.model.Room;
import com.example.hotelReservation.adapter.gateway.repository.RoomRepository;
import com.example.hotelReservation.infrastructure.persistence.jpa.RoomJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class RoomRepositoryImpl implements RoomRepository {

    private final RoomJpaRepository roomJpaRepository;

    @Override
    public Room findById(Long roomId) {
        return null;
    }

    @Override
    public void save(Room room) {

    }

}
