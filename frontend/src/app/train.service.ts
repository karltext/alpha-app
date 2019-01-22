import { Injectable } from '@angular/core';
import { HttpClientModule, HttpClient, HttpHeaders } from '../../node_modules/@angular/common/http';
import { Train } from './train';
import { Observable } from '../../node_modules/rxjs';

@Injectable({
  providedIn: 'root'
})
export class TrainService {

  rootURL:string
  constructor(private httpsvc:HttpClient) {
    this.rootURL="http://localhost:9900/trains"
   }
   getTrains():Observable<Train[]> {

    return this.httpsvc.get<Train[]>(this.rootURL+"/list")
  }

  addNewTrain(newTrain:Train): Observable<Train> {
    const httpOpts = {
      headers: new HttpHeaders(
        {'Content-Type':
      'application/x-www-form-urlencoded;charset=UTF-8'})
    }
    var reqBody="trainOrigin=" +newTrain.origin
    +"&destination=" + newTrain.destination
    +"&price=" + newTrain.price
    return this.httpsvc.post<Train>(
      this.rootURL+"/register", reqBody, httpOpts)
  }
}
