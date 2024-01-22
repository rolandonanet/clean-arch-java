package com.example.hotelReservation.adapter.controller;

import com.example.hotelReservation.adapter.dto.HotelRequestDTO;
import com.example.hotelReservation.adapter.dto.HotelResponseDTO;
import com.example.hotelReservation.adapter.mapper.controller.HotelControllerMapper;
import com.example.hotelReservation.entities.Hotel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ping")
public class PingController {

    @GetMapping
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("pong");
    }
}
