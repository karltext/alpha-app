import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AccountComponent } from './account/account.component';
import { FlightComponent } from './flight/flight.component';
import { HotelComponent } from './hotel/hotel.component';
import { CustomerComponent } from './customer/customer.component';
import { TrainComponent } from './train/train.component';
import { BookingComponent } from './booking/booking.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'account', component: AccountComponent},
  {path: 'booking', component: BookingComponent},
  {path: 'train', component: TrainComponent},
  {path: 'customer', component: CustomerComponent},
  {path: 'hotel', component: HotelComponent},
  {path: 'flight', component: FlightComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
