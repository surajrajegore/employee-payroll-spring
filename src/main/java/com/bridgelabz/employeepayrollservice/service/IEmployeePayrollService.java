package com.bridgelabz.employeepayrollservice.service;

import com.bridgelabz.employeepayrollservice.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollservice.entity.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayrollData();
    EmployeePayrollData getEmployeePayrollDataById(int empId);
    List<EmployeePayrollData> getEmployeesByDepartment(String department);
    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);
    EmployeePayrollData updateEmployeePayrollData(int empId,EmployeePayrollDTO employeePayrollDTO);
    void deleteEmployeePayrollData(int empId);
}
