import { Injectable } from '@angular/core';
import { DashboardItem } from './dashboard-item';
import {HttpClient } from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class DashboardService {
  private apiUrl = 'http://localhost:8080'


  constructor(private http: HttpClient) { }
  
  getDashboard(): Observable<DashboardItem[]> {
    return this.http.get<DashboardItem[]>(this.apiUrl + "/dashboard");
  }
}
