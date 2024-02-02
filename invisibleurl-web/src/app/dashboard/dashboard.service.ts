import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ShortUrl } from './short-url';

@Injectable({
  providedIn: 'root'
})
export class DashboardService {

  private apiUrl = "http://localhost:8080/dashboard";

  constructor(private http: HttpClient) { }

  getShortUrls(): Observable<ShortUrl[]> {
    return this.http.get<ShortUrl[]>(this.apiUrl);
  }
}
