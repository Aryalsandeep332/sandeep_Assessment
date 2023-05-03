package com.sandeep.empleavemanagement.model.impl;


import com.sandeep.empleavemanagement.enums.EmpType;
import com.sandeep.empleavemanagement.model.Employee;

public class ManagerEmployee extends Employee {

    public ManagerEmployee(String name) {
        super( name,30, EmpType.MANAGER);
    }
    public ManagerEmployee(int id, String name) {
        this(name);
        setId(id);
    }
}