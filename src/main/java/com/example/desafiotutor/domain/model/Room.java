package com.example.desafiotutor.domain.model;


import java.math.BigDecimal;

public abstract class Room {
    private Long id;
    private Integer number;
    private BigDecimal price;
    private RoomStatus status;
}
