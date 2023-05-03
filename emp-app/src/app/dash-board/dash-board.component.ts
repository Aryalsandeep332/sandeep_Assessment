import { Component } from '@angular/core';
import { Employee } from '../models/employee';
import { EmpService } from '../services/emp-service.service';

@Component({
  selector: 'app-dash-board',
  templateUrl: './dash-board.component.html',
  styleUrls: ['./dash-board.component.css']
})
export class DashBoardComponent {

  constructor(private empService: EmpService) {

  }
  emps: Employee[] = [];

  ngOnInit() {
    // initialization logic goes here
    this.empService.getAllEmployees().subscribe(data => this.emps = data);
  }

}
