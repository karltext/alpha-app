import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Customer } from '../customer';


@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.scss']
})
export class CustomerComponent implements OnInit {
  customer:Customer[]

  constructor(private customerService:CustomerService) {
    this.customer=[]
   }

   addCustomer(newCustomer:Customer){
     console.log("adding customer")
     this.customerService.addCustomer(newCustomer).subscribe(
       res=>{
         this.customerService.getCustomer().subscribe(
           res =>{this.customer=res}
         )
       }
     )
   }

  ngOnInit() {
    this.customerService.getCustomer().subscribe(
      res =>{ this.customer= res}
    )
  }

}
