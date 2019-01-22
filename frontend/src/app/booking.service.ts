import { Injectable } from '@angular/core';
import { throwError, Observable } from 'rxjs';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Booking } from './booking';

@Injectable({
  providedIn: 'root'
})
export class BookingService {

  constructor(private http: HttpClient) { }

  rootURL = "http://localhost:9900/bookings"

  listBookings(): Observable<Booking[]> {
    return this.http.get<Booking[]>(this.rootURL + "/list")
  }

  registerBooking(bookingType: string) {
    const http0pts = {
      headers: new HttpHeaders({'Content-Type': 'application/x-www-form-urlencoded;charset=UTF-8'})
    }
    const reqBody = "bookingType=" + bookingType
    const url = this.rootURL + "/register"
    return this.http.post<Booking>(url, reqBody, http0pts)
  }
}
