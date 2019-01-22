import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '../../node_modules/@angular/common/http';
import { Observable } from '../../node_modules/rxjs';
import { Hotel } from './hotel';

@Injectable({
  providedIn: 'root'
})
export class HotelService {
  rootURL: string

  constructor(private httpsvc:HttpClient) {
    this.rootURL="http://localhost:9900/hotels"
  }

  getHotels():Observable<Hotel[]>{
    return this.httpsvc.get<Hotel[]>(this.rootURL+"/list")
  }

  addNewHotel(newEntity:Hotel):Observable<Hotel>{
    const http0pts ={
      headers: new HttpHeaders(
        {'Content-Type': 'application/x-www-form-urlencoded;charset=UTF-8'})
      }
      var reqBody="occupants="+newEntity.occupants+"&roomsize="+newEntity.roomSize+"&price="+newEntity.price+"&location="+newEntity.location+"&duration="+newEntity.duration+"&latecheckout="+newEntity.lateCheckout

      return this.httpsvc.post<Hotel>(
        this.rootURL+"/register",reqBody,http0pts)
      }
}
