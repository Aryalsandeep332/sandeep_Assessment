import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { subscribeOn } from 'rxjs';
import { Employee } from '../models/employee';
import { EmpService } from '../services/emp-service.service';

@Component({
  selector: 'app-take-vacation',
  templateUrl: './take-vacation.component.html',
  styleUrls: ['./take-vacation.component.css']
})
export class TakeVacationComponent {

  constructor(private empService: EmpService, private route: ActivatedRoute) { }

  selectedId: number = -1;
  maxVacation: number = 0;
  selectedEmp: Employee = new Employee();

  ngOnInit() {
    this.route.queryParams.subscribe(
      params => {
        this.selectedId = params['id'];
        this.empService.getEmpById(this.selectedId).subscribe(resp => {
          this.selectedEmp = resp;
          this.maxVacation = this.selectedEmp.maxVacationdays;
          console.log(this.maxVacation);
        });


      }
    )
  }

  takeVacation() {

    if (this.selectedEmp.maxVacationdays < 0 || this.selectedEmp.maxVacationdays > this.maxVacation) {
      alert("Valid vacation days should be a value between 0 to " + this.maxVacation);
      this.selectedEmp.maxVacationdays = this.maxVacation;
      return;
    }

    this.empService.takeVacation(this.selectedEmp).subscribe(res => {

      alert(res['message']);
      window.location.href = 'http://localhost:4200/dashboard';

    });


  }

}
