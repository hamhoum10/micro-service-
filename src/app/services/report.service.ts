import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Report} from "../models/report/report";
import {Observable} from "rxjs";
import {Ban} from "../models/Ban/ban";


const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
    'Access-Control-Allow-Origin': 'http://localhost:4200',
  }),
};
@Injectable({
  providedIn: 'root'
})
export class ReportService {

  constructor(private _http:HttpClient) { }

  addreport(report:Report):Observable<Report>{
    const headers = new HttpHeaders()
      .append('Content-Type', 'application/json')
      .append('Access-Control-Allow-Headers', 'Content-Type')
      .append('Access-Control-Allow-Origin', '*');
    return this._http.post<Report>('http://localhost:8081/reportandeport/addReport',report,{headers});
  }

  getAllreport():Observable<Report[]>{
    return this._http.get<Report[]>('http://localhost:8081/reportandeport/Reports',httpOptions);
  }

  getreport(id:number):Observable<Report>{
    return this._http.get<Report>("http://localhost:8081/reportandeport/getReportbyid/"+id,httpOptions);
  }

  updatereport(report:Report):Observable<Report>{
    return this._http.put<Report>("http://localhost:8081/reportandeport/updateReport",report,httpOptions);
  }
  deletereport(idu:number):Observable<Report>{
    return this._http.delete<Report>("http://localhost:8081/reportandeport/deleteeport/"+idu,httpOptions);
  }
  addReportAndAssignUser(report:Report,iduser:number):Observable<Report>{
    return this._http.post<Report>('http://localhost:8081/reportandban/addReportAndAssignUser/'+iduser,report,httpOptions);
  }

}
