package com.bridgelabz.employeepayrollservice.service;

import com.bridgelabz.employeepayrollservice.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollservice.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayrollData();
    EmployeePayrollData getEmployeePayrollDataById(int empId);
    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);
    EmployeePayrollData updateEmployeePayrollData(int empId,EmployeePayrollDTO employeePayrollDTO);
    void deleteEmployeePayrollData(int empId);
}
