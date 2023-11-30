package com.example.projet_micro_service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RoomService implements IRoom{
    RoomRepo roomRepo;
    @Override
    public RoomEntity addRoom(RoomEntity roomEntity) {
        return roomRepo.save(roomEntity);    }

    @Override
    public RoomEntity updateRoom(RoomEntity roomEntity) {
        return roomRepo.save(roomEntity);
    }

    @Override
    public RoomEntity updatename(String name,long id) {
        RoomEntity room =roomRepo.findById(id).orElse(null);
        room.setNameRoom(name);
        return roomRepo.save(room);
    }

    @Override
    public RoomEntity updatenbr(int nbr,long id) {
        RoomEntity room =roomRepo.findById(id).orElse(null);
        room.setNBRMember(nbr);
        return roomRepo.save(room);
    }

    @Override
    public void deleatRoom(long id) {
        roomRepo.deleteById(id);

    }

    @Override
    public void decreasenbreroom(long id,long nbr) {
        RoomEntity room =roomRepo.findById(id).orElse(null);
        room.setNBRMember(room.getNBRMember()-1);
    }
}
