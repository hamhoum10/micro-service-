import {Component, OnInit} from '@angular/core';
import {Room} from "../../models/room/room";
import {RoomservService} from "../../services/roomserv.service";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-update-room',
  templateUrl: './update-room.component.html',
  styleUrls: ['./update-room.component.css']
})
export class UpdateRoomComponent implements OnInit{
  room:Room
  id : number;
  constructor(private  roomService:RoomservService,private ac:ActivatedRoute) {
  }
  ngOnInit() {
    const idParam = this.ac.snapshot.paramMap.get('id');

    if (idParam !== null) {
      this.id = +idParam;
      this.getbyid(this.id);
    } else {
      console.error('ID parameter is null or undefined');
    }

  }
    getbyid(id:number):void {
    this.roomService.getOne(id).subscribe((res)=>{this.room=res})
    }

  updateroom(){
    this.roomService.updateRoom(this.room).subscribe()
    alert("room updated")
    location.assign("http://localhost:4200/getallroom")

  }

}
