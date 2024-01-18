package com.example.desafiotutor.infrastructure.persistence.repository;

import com.example.desafiotutor.domain.model.Reservation;
import com.example.desafiotutor.adapter.gateway.repository.ReservationRepository;
import com.example.desafiotutor.infrastructure.persistence.jpa.ReservationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class ReservationRepositoryImpl implements ReservationRepository {

    private final ReservationJpaRepository reservationJpaRepository;

    @Override
    public Reservation findById(Long reservationId) {
        return null;
    }

    @Override
    public void save(Reservation reservation) {

    }
}
