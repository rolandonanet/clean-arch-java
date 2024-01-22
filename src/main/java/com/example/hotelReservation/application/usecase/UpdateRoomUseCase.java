package com.example.hotelReservation.application.usecase;

import com.example.hotelReservation.application.service.RoomService;
import com.example.hotelReservation.entities.Room;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UpdateRoomUseCase {

    private final RoomService roomService;
    public Room execute(String hotelId, String roomId, Room room) {
        return roomService.updateRoom(hotelId, roomId, room);
    }
}
