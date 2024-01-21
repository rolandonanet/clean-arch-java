package com.example.hotelReservation.domain.model;

import java.time.LocalDate;

public abstract class Reservation {
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
}
