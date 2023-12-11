import { NgModule } from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {ChatComponent} from "./socket/chat/chat.component";
import {AffichenotifComponent} from "./notification/affichenotif/affichenotif.component";
import {AddroomComponent} from "./room/addroom/addroom.component";
import {UpdateRoomComponent} from "./room/update-room/update-room.component";
import {RoomsComponent} from "./room/rooms/rooms.component";
import {BanComponent} from "./RepAndBan/ban/ban.component";
import {ReportComponent} from "./RepAndBan/report/report.component";

const routes: Routes = [
  {path: 'user', loadChildren : () => import('./user/user.module').then(m=>m.UserModule)},
  {path:'chat', component:ChatComponent},
  { path: 'affichenotif/:id', component: AffichenotifComponent },
  {path:'addroom',component:AddroomComponent},
  {path:'editroom/:id',component:UpdateRoomComponent},
  {path:'getallroom',component:RoomsComponent},
  {path:'addban',component:BanComponent},
  {path:'addrep',component:ReportComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
