import { Component, OnInit } from '@angular/core';
import { Train } from '../train';
import { TrainService } from '../train.service';

@Component({
  selector: 'app-train',
  templateUrl: './train.component.html',
  styleUrls: ['./train.component.scss']
})
export class TrainComponent implements OnInit {

  Trains:Train[]

  constructor(private tService:TrainService) {
    this.Trains=[]
   }

   addNewTrain(newTrain:Train){
     this.tService.addNewTrain(newTrain).subscribe(
       res=>{
         this.tService.getTrains().subscribe(
           res=>{this.Trains= res}
         )
       }
     )
   }

  ngOnInit() {
    this.tService.getTrains().subscribe(
      res =>{ this.Trains= res}
    )
  
  }


}
