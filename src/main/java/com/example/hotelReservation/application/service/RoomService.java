package com.example.hotelReservation.application.service;

import com.example.hotelReservation.adapter.gateway.repository.HotelGatewayRepository;
import com.example.hotelReservation.adapter.gateway.repository.RoomGatewayRepository;
import com.example.hotelReservation.entities.Room;
import com.example.hotelReservation.entities.Hotel;
import com.example.hotelReservation.infrastructure.persistence.mapper.HotelMapper;
import com.example.hotelReservation.infrastructure.persistence.mapper.RoomMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RoomService {
    private final HotelGatewayRepository hotelGatewayRepository;
    private final RoomGatewayRepository roomGatewayRepository;
    public void createRoom(Long hotelId, Room room) {
        Hotel hotel = hotelGatewayRepository.findById(hotelId);
        hotel.getRooms().add(room);
        hotelGatewayRepository.save(hotel);
    }

    public List<Room> listRooms(String hotelId) {
        return null;
    }

    public void updateRoom(String hotelId, String roomId, Room room) {
    }
}
