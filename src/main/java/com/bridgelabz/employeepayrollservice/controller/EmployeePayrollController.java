package com.bridgelabz.employeepayrollservice.controller;

import com.bridgelabz.employeepayrollservice.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollservice.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollservice.dto.ResponseDto;
import com.bridgelabz.employeepayrollservice.service.EmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeePayrollController")
public class EmployeePayrollController {

    @Autowired
    private EmployeePayrollService employeePayrollService;

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDto> getEmployeePayrollData(){
        List<EmployeePayrollData> empDataList = null;
        empDataList = employeePayrollService.getEmployeePayrollData();
        ResponseDto responseDTO = new ResponseDto("Get Call Success.",empDataList);
        return new ResponseEntity<ResponseDto>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDto> getEmployeePayrollData(@PathVariable("empId")int empId){
        EmployeePayrollData employeePayrollData = employeePayrollService.getEmployeePayrollDataById(empId);
        ResponseDto responseDTO = new ResponseDto("Get Call For ID Successful.",employeePayrollData);
        return new ResponseEntity<ResponseDto>(responseDTO, HttpStatus.OK);
    }



    @PostMapping("/create")
    public ResponseEntity<ResponseDto> addEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO){
       EmployeePayrollData employeePayrollData = employeePayrollService.createEmployeePayrollData(empPayrollDTO);
        ResponseDto responseDTO = new ResponseDto("Created Employee Payroll Data Successfully.", employeePayrollData);
        return new ResponseEntity<ResponseDto>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{empId}")
    public ResponseEntity<ResponseDto> updateEmployeePayrollData(@PathVariable("empId") int empId, @RequestBody EmployeePayrollDTO empPayrollDTO){
        EmployeePayrollData employeePayrollData = employeePayrollService.updateEmployeePayrollData(empId, empPayrollDTO);
        ResponseDto responseDTO = new ResponseDto(" data updated Employee Payroll Data Successfully.", employeePayrollData);
        return new ResponseEntity<ResponseDto>(responseDTO, HttpStatus.OK);
    }

//

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDto> deleteEmployeePayrollData(@PathVariable("empId")int empId){
        employeePayrollService.deleteEmployeePayrollData(empId);
        ResponseDto responseDTO = new ResponseDto("Deleted Successfully:","Delete Id:"+empId);

        return new ResponseEntity<ResponseDto>(responseDTO,HttpStatus.OK);
    }


}
