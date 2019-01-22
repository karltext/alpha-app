import { Component, OnInit } from '@angular/core';
import { BookingService } from '../booking.service';
import { Booking } from '../booking';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.scss']
})
export class BookingComponent implements OnInit {

  bookings: Booking[]

  constructor(private bookingService: BookingService) { }

  ngOnInit() {
    this.listBookings()
  }

  listBookings() {
    this.bookingService.listBookings()
      .subscribe(res => { this.bookings = res })
  }

  registerBooking(bookingType: string) {
    console.log(bookingType, "ran")
    this.bookingService.registerBooking(bookingType)
      .subscribe(res => {
        console.log(res)
        this.listBookings()
      })
  }
}
