package com.bridgelabz.employeepayrollservice.entity;

import com.bridgelabz.employeepayrollservice.dto.EmployeePayrollDTO;
import lombok.Data;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

@Entity

public @Data class EmployeePayrollData {

    @Id
    private  int employeeId;
    private String name;
    private long salary;
    private String gender;
    private LocalDate startDate;
    private String note;
    private String profilePic;
    @ElementCollection
    private List<String> departments;

    public EmployeePayrollData(){

    }

    public EmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
        this.employeeId = empId;
        this.updateEmployeePayrollData(employeePayrollDTO);

    }
    public void updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO){
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
        this.gender = employeePayrollDTO.gender;
        this.note = employeePayrollDTO.note;
        this.startDate = employeePayrollDTO.startDate;
        this.profilePic = employeePayrollDTO.profilePic;
        this.departments = employeePayrollDTO.departments;

    }


}
