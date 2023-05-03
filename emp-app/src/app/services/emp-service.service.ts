import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../models/employee';


@Injectable({
  providedIn: 'root'
})
export class EmpService {

  constructor(private httpClient: HttpClient) { }

  baseUrl: string = 'http://localhost:9090/emps';

  public getAllEmployees(): Observable<Employee[]> {
    // Logic to call APIs
    let url = this.baseUrl + '/all';
    console.log(url);

    return this.httpClient.get<Employee[]>(url);

  }
  public getEmpById(id: number): Observable<Employee> {
    // Logic to call APIs
    const url = this.baseUrl + '/' + id;
    return this.httpClient.get<Employee>(url);

  }

  addWorkDays(emp: Employee): Observable<String> {
    // Call PUT API to edit emp

    let url = this.baseUrl + '/work';

    console.log(url + ' & ' + emp);
    return this.httpClient.put<String>(url, emp);
  }

  takeVacation(emp: Employee): Observable<any> {
    // Call PUT API to edit emp

    let url = this.baseUrl + '/vacation';

    console.log(url + ' & ' + emp);
    return this.httpClient.put<any>(url, emp);
  }
}
