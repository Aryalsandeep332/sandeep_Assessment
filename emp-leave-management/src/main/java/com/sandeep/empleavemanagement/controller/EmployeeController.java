package com.sandeep.empleavemanagement.controller;

import com.sandeep.empleavemanagement.model.Employee;
import com.sandeep.empleavemanagement.model.dto.EmployeeDTO;
import com.sandeep.empleavemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/emps")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return this.employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) {
        return ResponseEntity.ok(this.employeeService.getEmployeeById(id).orElse(null));
    }

    @PutMapping("/work")
    public ResponseEntity<Map<String, String>> updateWorkDays(@RequestBody EmployeeDTO emp) {
        employeeService.updateWorkDays(emp.getId(), emp.getWorkDays());
        return ResponseEntity.ok(Map.of("message","employee work days updated successfully"));
    }

    @PutMapping("/vacation")
    public ResponseEntity<Map<String, String>> updateVacations(@RequestBody EmployeeDTO emp) {
        employeeService.updateVacations(emp.getId(), emp.getMaxVacationdays());
        return ResponseEntity.ok(Map.of("message","employee vacation days updated successfully"));
    }


}
