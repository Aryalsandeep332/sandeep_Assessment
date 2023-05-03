package com.sandeep.empleavemanagement.model;


import com.sandeep.empleavemanagement.enums.EmpType;
import com.sandeep.empleavemanagement.exception.InvalidWorkDaysException;

public abstract class Employee {

    public static final int MIN_WORK_DAYS = 0;
    public static final int MAX_WORK_DAYS = 260;

    private int id;
    private String name;
    private EmpType type;
    private double maxVacationdays;
    private int workDays;


    public Employee(String name, double maxVacationdays, EmpType type) {
        this.name = name;
        this.maxVacationdays = maxVacationdays;
        this.type = type;
    }

    public void work(int workDays) {
        if (workDays < MIN_WORK_DAYS || workDays > MAX_WORK_DAYS) {
            throw new InvalidWorkDaysException("Valid work days should be a value between " +
                    MIN_WORK_DAYS + " to " + MAX_WORK_DAYS);
        }
        this.workDays = workDays;
//        int leaves = MAX_WORK_DAYS - workDays;
//        if (leaves <= maxVacationdays) {
//            this.maxVacationdays = this.maxVacationdays - leaves;
//        } else {
//            this.maxVacationdays = 0;
//        }

    }

    public void takeVacation(double leaves) {
        if (leaves > maxVacationdays) {
            this.maxVacationdays = 0;
        }
        this.maxVacationdays = this.maxVacationdays - leaves;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public EmpType getType() {
        return type;
    }

    public double getMaxVacationdays() {
        return maxVacationdays;
    }
    public int getWorkDays() {
        return workDays;
    }


    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maxVacationdays=" + maxVacationdays +
                ", workDays=" + workDays +
                '}';
    }
}
