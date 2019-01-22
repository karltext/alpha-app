import { Component, OnInit } from '@angular/core';
import { HotelService } from '../hotel.service';
import { Hotel } from '../hotel';

@Component({
  selector: 'app-hotel',
  templateUrl: './hotel.component.html',
  styleUrls: ['./hotel.component.scss']
})
export class HotelComponent implements OnInit {
  hotels:Hotel[]

  constructor(private hotelService:HotelService) {
    this.hotels=[]
    }

  addNewTraining(newHotel:Hotel){
    this.hotelService.addNewHotel(newHotel).subscribe(
      res => {this.hotelService.getHotels().subscribe(
        res => {this.hotels=res}
      )}
    )
  }

  ngOnInit() {
    this.hotelService.getHotels().subscribe(
      res=> {this.hotels=res}
    )
  }

}
