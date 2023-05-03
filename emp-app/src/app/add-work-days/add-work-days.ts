import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Employee } from '../models/employee';
import { EmpService } from '../services/emp-service.service';

@Component({
  selector: 'app-add-work-days',
  templateUrl: './add-work-days.component.html',
  styleUrls: ['./add-work-days.component.css']
})
export class AddWorkDaysComponent {
  constructor(private empService: EmpService, private route: ActivatedRoute) { }

  selectedId: number = -1;
  selectedEmp: Employee = new Employee();

  ngOnInit() {
    this.route.queryParams.subscribe(
      params => {
        this.selectedId = params['id'];
        this.empService.getEmpById(this.selectedId).subscribe(resp => this.selectedEmp = resp)
      }
    )
  }

  addWorkDays() {
    if (this.selectedEmp.workDays < 0 || this.selectedEmp.workDays > 260) {
      alert("Valid work days should be a value between 0 to 260");
      this.selectedEmp.workDays=0;
      return;
    }
    this.empService.addWorkDays(this.selectedEmp).subscribe(res => {

      alert("addWorkDays succesfully");
      window.location.href = 'http://localhost:4200/dashboard';

    });


  }

}
