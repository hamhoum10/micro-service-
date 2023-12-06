package com.example.projet_micro_service;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
public class    RoomControler implements Serializable {
    private RoomService roomService;
    @PostMapping("/addRoom")
    public RoomEntity addRoom(@RequestBody RoomEntity f ){
        return  roomService.addRoom(f);
    }
    @PutMapping("/updateRoom")
    public RoomEntity updateRoom(@RequestBody RoomEntity f){
        return roomService.updateRoom(f);
    }

    @PutMapping("/updateRoomName/{id}")
    public RoomEntity updatename(@RequestBody String f,@PathVariable long id){
        return roomService.updatename(f,id);
    }
    @PutMapping("/updateRoomNbr/{id}")
    public RoomEntity updatename(@RequestBody int f,@PathVariable long id){
        return roomService.updatenbr(f,id);
    }
    @DeleteMapping("/deleteRoom/{id}")
    public void deleteById(@PathVariable long id){
        roomService.deleatRoom(id);
    }

    @PutMapping("/update-nbr/{id}")
    public void decreasenbr( @PathVariable long id){
         roomService.decreasenbreroom(id);
    }
    @GetMapping("getAll")
    public List<RoomEntity> getall(){ return roomService.getall();}
    @GetMapping("getone/{id}")
    public RoomEntity getone(@PathVariable long id){ return roomService.getbyId(id);}



}


