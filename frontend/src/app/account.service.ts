import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '../../node_modules/@angular/common/http';
import { Observable } from '../../node_modules/rxjs';
import {Account} from './account';

@Injectable({
  providedIn: 'root'
})
export class AccountService {
rootURL:string

  constructor(private httpsvc:HttpClient) {
    this.rootURL="http://localhost:9900/accounts"
   }
   getAccounts():Observable<Account[]>{
     return this.httpsvc.get<Account[]>(this.rootURL+"/list")
   }
   
addNewAccount(newAccount:Account):Observable<Account>{
  const httpOpts ={
    headers: new HttpHeaders(
      {'Content-Type':
      'application/x-www-form-urlencoded;charset=UTF-8'})
      }
      var reqBody="accountType="+newAccount.accountType+"&bonuspoints="+newAccount.bonuspoints

      return this.httpsvc.post<Account>(
        this.rootURL+"/register",reqBody,httpOpts)
}
deleteAccount(accountNumber:number):Observable<Account>{
  return this.httpsvc.request<Account>('DELETE',this.rootURL+"/delete",
{
  headers:new HttpHeaders({'Content-Type': 'text/plain'}),
  body:accountNumber
})
}

  }

