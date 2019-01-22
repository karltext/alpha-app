import { Component, OnInit } from '@angular/core';
import { AccountService } from '../account.service';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.scss']
})

export class AccountComponent implements OnInit {
  accounts:Account[]

  constructor(private accountService:AccountService) {
    this.accounts=[]
  }

 addNewAccount(newAccount:Account) {
   this.accountService.addNewAccount(newAccount).subscribe(
     res=>{
       this.accountService.getAccounts().subscribe(
         res => {this.accounts=res}
       )
     }
   )
 }
 deleteAccount(index:number) {
   this.accountService.deleteAccount(index).subscribe(
     res => {
       this.accountService.getAccounts().subscribe(
         res=> (this.accounts=res)
       )
     }
   )
 }
 ngOnInit() {
   this.accountService.getAccounts().subscribe(
     res => (this.accounts=res)
   )
 }

}
