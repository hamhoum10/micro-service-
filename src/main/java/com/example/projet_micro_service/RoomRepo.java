package com.example.projet_micro_service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepo extends JpaRepository<RoomEntity,Long> {
    public RoomEntity findByNameRoom(String name);
}
