package com.bridgelabz.employeepayrollservice.dto;

public class EmployeePayrollDTO {
    public String name;
    public  long salary;

    @Override
    public String toString() {
        return "EmployeePayrollDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
