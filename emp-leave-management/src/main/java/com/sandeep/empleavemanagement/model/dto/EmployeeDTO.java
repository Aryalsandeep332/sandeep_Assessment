package com.sandeep.empleavemanagement.model.dto;


import com.sandeep.empleavemanagement.enums.EmpType;
import com.sandeep.empleavemanagement.exception.InvalidWorkDaysException;

public class EmployeeDTO {

    private int id;
    private String name;
    private EmpType type;
    private double maxVacationdays;
    private int workDays;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmpType getType() {
        return type;
    }

    public void setType(EmpType type) {
        this.type = type;
    }

    public double getMaxVacationdays() {
        return maxVacationdays;
    }

    public void setMaxVacationdays(double maxVacationdays) {
        this.maxVacationdays = maxVacationdays;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }
}
