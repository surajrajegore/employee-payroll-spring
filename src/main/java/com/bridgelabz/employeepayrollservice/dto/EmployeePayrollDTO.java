package com.bridgelabz.employeepayrollservice.dto;

import javax.validation.constraints.Pattern;

public class EmployeePayrollDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\\\s]{2,}$", message = "name is invalid")
    public String name;
    public  long salary;

    public EmployeePayrollDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String   toString() {
        return "EmployeePayrollDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
