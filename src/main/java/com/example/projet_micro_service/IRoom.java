package com.example.projet_micro_service;

import java.util.List;

public interface IRoom {
    public RoomEntity addRoom(RoomEntity roomEntity);
    public RoomEntity updateRoom(RoomEntity roomEntity);
    public RoomEntity updatename(String name,long id);
    public RoomEntity updatenbr(int nbr,long id);
    public void deleatRoom(long id);
    public void decreasenbreroom(long id);
    public List<RoomEntity>getall();
    public RoomEntity getbyId(long id);

}
