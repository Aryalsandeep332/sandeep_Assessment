package com.sandeep.empleavemanagement.model.impl;


import com.sandeep.empleavemanagement.enums.EmpType;
import com.sandeep.empleavemanagement.model.Employee;

public class HourlyEmployee extends Employee {

    public HourlyEmployee(String name) {
        super(name, 10, EmpType.HOURLY);
    }

    public HourlyEmployee(int id, String name) {
        this(name);
        setId(id);
    }

}
