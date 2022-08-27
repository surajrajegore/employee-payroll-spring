package com.bridgelabz.employeepayrollservice.service;

import com.bridgelabz.employeepayrollservice.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollservice.entity.EmployeePayrollData;
import com.bridgelabz.employeepayrollservice.exception.EmployeeException;
import com.bridgelabz.employeepayrollservice.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
public class EmployeePayrollService implements IEmployeePayrollService{

    @Autowired
    private EmployeeRepository employeeRepository;
    private  List<EmployeePayrollData> employeePayrollList = new ArrayList<>();

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayrollList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        return employeePayrollList.stream()
                .filter(employeePayrollData -> employeePayrollData.getEmployeeId() == empId)
                .findFirst()
                .orElseThrow(() -> new EmployeeException("Employee Not Found"));
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(employeePayrollList.size()+1,employeePayrollDTO);
        employeePayrollList.add(employeePayrollData);
        return employeeRepository.save(employeePayrollData);
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData = this.getEmployeePayrollDataById(empId);
        empData.setName(employeePayrollDTO.name);
        empData.setSalary(employeePayrollDTO.salary);
        employeePayrollList.set(empId-1,empData);
        return empData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId)     {
        EmployeePayrollData empData = this.getEmployeePayrollDataById(empId);
        employeePayrollList.remove(empId-1);
    }
}
