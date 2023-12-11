import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {Room} from "../models/room/room";
//


@Injectable({
  providedIn: 'root'
})

export class RoomservService {
  roomURL : string = "http://localhost:8081/room/";
  constructor(private _http:HttpClient) { }
  getAllRoom():Observable<Room[]>{
    return this._http.get<Room[]>(this.roomURL+'getAll');
  }
  getOne(id:number):Observable<Room> {
    return this._http.get<Room>(this.roomURL+'getone/'+id);
  }

  //momkin 8alit
  decreaseNBR(id:number,room:Room):Observable<Room> {
  return this._http.put<Room>(this.roomURL+'update-nbr/'+id,room);
}
deleatRoom(id:number):Observable<Room>{
    return this._http.delete<Room>(this.roomURL+'deleteRoom/'+id)
}
updateNBR(id:number,num:number):Observable<Room>{
    return this._http.put<Room>(this.roomURL+'updateRoomNbr/'+id,num)
}
updateName(id:number,name:string):Observable<Room>{
    return this._http.put<Room>(this.roomURL+'updateRoomName'+id,name)
}
updateRoom(room:Room):Observable<Room>{
    return this._http.put<Room>(this.roomURL+'updateRoom',room)
}
addRoom(room:Room):Observable<Room>{
    return this._http.post<Room>(this.roomURL+'addRoom',room)
}
joinRoom(id:number,iduser:number):Observable<Room>{
  return this._http.put<Room>(this.roomURL+'addmember/'+id,iduser)
}
sendsms(){
    return this._http.get("http://localhost:8085/")
}

}
