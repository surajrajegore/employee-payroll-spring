package com.bridgelabz.employeepayrollservice.entity;

import com.bridgelabz.employeepayrollservice.dto.EmployeePayrollDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class EmployeePayrollData {

    private  int employeeId;
    private String name;
    private long salary;
    private Long id;

    public EmployeePayrollData() {
    }

    public EmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
        this.employeeId = empId;
        this.name = empPayrollDTO.name;
        this.salary = empPayrollDTO.salary;
    }


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
