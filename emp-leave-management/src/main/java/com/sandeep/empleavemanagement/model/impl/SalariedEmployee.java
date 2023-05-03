package com.sandeep.empleavemanagement.model.impl;


import com.sandeep.empleavemanagement.enums.EmpType;
import com.sandeep.empleavemanagement.model.Employee;

public class SalariedEmployee extends Employee {

    public SalariedEmployee(String name) {
        super(name,15, EmpType.SALARIED);
    }
    public SalariedEmployee(int id, String name) {
        this(name);
        setId(id);
    }
}
