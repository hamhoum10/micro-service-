import {Component, OnInit} from '@angular/core';
import {RoomservService} from "../../services/roomserv.service";
import {Room} from "../../models/room/room";

@Component({
  selector: 'app-rooms',
  templateUrl: './rooms.component.html',
  styleUrls: ['./rooms.component.css']
})
export class RoomsComponent implements OnInit{
  rooms:Room[]
  constructor(private roomService:RoomservService) {
  }

  ngOnInit() {
    this.roomService.getAllRoom().subscribe((res:Room[])=>this.rooms=res)
  }
deleatRoom(id:number){
    this.roomService.deleatRoom(id).subscribe()
      location.reload()
}
joinRoom(id:number,iduser:number){
this.roomService.joinRoom(id,iduser).subscribe();
}

}
