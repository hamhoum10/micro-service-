package com.example.projet_micro_service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public void decreasenbreroom(long id) {
        RoomEntity room =roomRepo.findById(id).orElse(null);
        room.setNBRMember(room.getNBRMember()-1);
        roomRepo.save(room);
    }

    @Override
    public void deleatRoom(long id) {
        roomRepo.deleteById(id);

    }



    @Override
    public List<RoomEntity> getall() {
        return roomRepo.findAll();
    }

    @Override
    public RoomEntity getbyId(long id) {
        return roomRepo.findById(id).orElse(null);
    }
}
