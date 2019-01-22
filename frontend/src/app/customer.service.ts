import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '../../node_modules/@angular/common/http';
import { Observable } from '../../node_modules/rxjs';
import { Customer } from './customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  rootURL:string
  constructor(private httpsvc:HttpClient) { 
    this.rootURL="http://localhost:9900/customers"
  }

  getCustomer():Observable<Customer[]>{
    return this.httpsvc.get<Customer[]>(this.rootURL+"/list")
  }

  addCustomer(newCustomer:Customer):Observable<Customer>{
    const httpOpts ={
      headers: new HttpHeaders(
        {'Content-Type':
        'application/x-www-form-urlencoded;charset=UTF-8'}
      )}

      var reqBody="name="+newCustomer.name

      return this.httpsvc.post<Customer>(
        this.rootURL+"/register", reqBody, httpOpts)
      }
}
