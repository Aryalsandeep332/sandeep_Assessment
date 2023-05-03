import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddWorkDaysComponent } from './add-work-days/add-work-days';
import { DashBoardComponent } from './dash-board/dash-board.component';
import { TakeVacationComponent } from './take-vacation/take-vacation.component';


const routes: Routes = [
  { 'path': '', component: DashBoardComponent },
  { 'path': 'dashboard', component: DashBoardComponent },
  { 'path': 'takeVacations', component: TakeVacationComponent },
  { 'path': 'addWorkDays', component: AddWorkDaysComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
