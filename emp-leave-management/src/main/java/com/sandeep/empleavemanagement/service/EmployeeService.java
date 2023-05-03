


package com.sandeep.empleavemanagement.service;

import com.sandeep.empleavemanagement.model.Employee;
import com.sandeep.empleavemanagement.model.impl.HourlyEmployee;
import com.sandeep.empleavemanagement.model.impl.ManagerEmployee;
import com.sandeep.empleavemanagement.model.impl.SalariedEmployee;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private List<Employee> employees;

    @PostConstruct
    private void setUp() {
        employees = new ArrayList<>();

        addTenHourlyEmployees();
        addTenSalariedEmployees();
        addTenManagerEmployees();
    }

    public List<Employee> getAllEmployees() {
        return this.employees;
    }

    public Optional<Employee> getEmployeeById(long id) {
        return this.employees.stream()
                .filter(e -> e.getId() == id).findAny();
    }

    public void updateWorkDays(long id, int workDays) {
        this.employees.stream()
                .filter(e -> e.getId() == id).findAny()
                .ifPresent(e -> e.work(workDays));

    }

    public void updateVacations(long id, double vacationDays) {
        this.employees.stream()
                .filter(e -> e.getId() == id).findAny()
                .ifPresent(e -> e.takeVacation(vacationDays));
    }

    private void addTenHourlyEmployees() {
        employees.add(new HourlyEmployee(101, "Tiger Nixon"));
        employees.add(new HourlyEmployee(102, "Garrett Winters"));
        employees.add(new HourlyEmployee(103, "Sandeep Gupta"));
        employees.add(new HourlyEmployee(104, "Candy Day"));
        employees.add(new HourlyEmployee(105, "Ashton Cox"));
        employees.add(new HourlyEmployee(106, "Sonya Frost"));
        employees.add(new HourlyEmployee(107, "Herrod Chandler"));
        employees.add(new HourlyEmployee(108, "Rhona Davidson"));
        employees.add(new HourlyEmployee(109, "Airi Satou"));
        employees.add(new HourlyEmployee(110, "Cedric Kelly"));
    }

    private void addTenSalariedEmployees() {
        employees.add(new SalariedEmployee(201, "Colleen Hurst"));
        employees.add(new SalariedEmployee(202, "Jena Gaines"));
        employees.add(new SalariedEmployee(203, "Quinn Flynn"));
        employees.add(new SalariedEmployee(204, "Charde Marshall"));
        employees.add(new SalariedEmployee(205, "Dinesh Tomar"));
        employees.add(new SalariedEmployee(206, "Manish Khatri"));
        employees.add(new SalariedEmployee(207, "Bidhiya Jayswal"));
        employees.add(new SalariedEmployee(208, "Sumit Sharma"));
        employees.add(new SalariedEmployee(209, "Hasan Raza"));
        employees.add(new SalariedEmployee(210, "Mohd Talha"));
    }

    private void addTenManagerEmployees() {
        employees.add(new ManagerEmployee(301, "Arif Khan"));
        employees.add(new ManagerEmployee(302, "Tushar Sharma"));
        employees.add(new ManagerEmployee(303, "Rahul Pandey"));
        employees.add(new ManagerEmployee(304, "Ajay Bhandari"));
        employees.add(new ManagerEmployee(305, "Vipin Singh"));
        employees.add(new ManagerEmployee(306, "Riya Verma"));
        employees.add(new ManagerEmployee(307, "Sony Chandra"));
        employees.add(new ManagerEmployee(308, "Ella Arun"));
        employees.add(new ManagerEmployee(309, "Gita Gopal"));
        employees.add(new ManagerEmployee(310, "Reena Thakur"));
    }


}
