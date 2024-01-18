package com.example.desafiotutor.infrastructure.persistence.repository;

import com.example.desafiotutor.domain.model.Room;
import com.example.desafiotutor.adapter.gateway.repository.RoomRepository;
import com.example.desafiotutor.infrastructure.persistence.jpa.RoomJpaRepository;
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
