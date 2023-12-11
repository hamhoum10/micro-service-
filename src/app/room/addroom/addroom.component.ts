import {Component, OnInit} from '@angular/core';
import {RoomservService} from "../../services/roomserv.service";
import {Room} from "../../models/room/room";

@Component({
  selector: 'app-addroom',
  templateUrl: './addroom.component.html',
  styleUrls: ['./addroom.component.css']
})
export class AddroomComponent  implements OnInit{
  room:Room = new Room()
constructor(private roomService:RoomservService) {
}
ngOnInit() {
}
addroom(){
  this.roomService.sendsms()
  this.roomService.addRoom(this.room).subscribe();
  alert("room aded")
location.assign("http://localhost:4200/getallroom")

}


}
