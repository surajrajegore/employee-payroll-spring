package com.bridgelabz.employeepayrollservice.controller;

import com.bridgelabz.employeepayrollservice.Service.EmployeePayrollData;
import com.bridgelabz.employeepayrollservice.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollservice.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeePayrollController")
public class EmployeePayrollController {
//    @RequestMapping(value = {"","/","/get"})
//    public ResponseEntity<String> getEmployeePayrollData(){
//        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
//    }


//    @GetMapping("/get/{empId}")
//    public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId")int empId){
//        return new ResponseEntity<String>("Get Call Success for id:"+empId,HttpStatus.OK);
//    }

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDto> getEmployeePayrollData(){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1,new EmployeePayrollDTO("Suraj",20000));
        ResponseDto responseDTO = new ResponseDto("Get Call Success", employeePayrollData);
        return new ResponseEntity<ResponseDto>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDto> getEmployeePayrollData(@PathVariable("empId")int empId){
        EmployeePayrollData employee = null;
        employee = new EmployeePayrollData(empId,new EmployeePayrollDTO("Suraj",15000));
        ResponseDto responseDTO = new ResponseDto("Get Call Id is Sucessful ", employee);
        return new ResponseEntity<ResponseDto>(responseDTO, HttpStatus.OK);
    }


//    @PostMapping("/create")
//    public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
//        return new ResponseEntity<String>("Created Employee Payroll Data for:"+employeePayrollDTO,HttpStatus.OK);
//    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> addEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1,empPayrollDTO);
        ResponseDto responseDTO = new ResponseDto("Created Employee Payroll Data Successfully:", employeePayrollData);
        return new ResponseEntity<ResponseDto>(responseDTO, HttpStatus.OK);
    }


//    @PutMapping("/update")
//    public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
//        return new ResponseEntity<String>("Upated Employee Payroll Data for:"+employeePayrollDTO,HttpStatus.OK);
//    }

    @PutMapping("/update/{empId}")
    public ResponseEntity<ResponseDto> updateEmployeePayrollData(@PathVariable("empId") int empId, @RequestBody EmployeePayrollDTO empPayrollDTO){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(empId,empPayrollDTO);
        ResponseDto responseDTO = new ResponseDto(" data updated Employee Payroll Data Successfully:", employeePayrollData);
        return new ResponseEntity<ResponseDto>(responseDTO, HttpStatus.OK);
    }

//    @DeleteMapping("/delete/{empId}")
//    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId")int empId){
//        return new ResponseEntity<String>("Delete Call Success for id:"+empId,HttpStatus.OK);
//    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDto> deleteEmployeePayrollData(@PathVariable("empId")int empId){
        ResponseDto responseDTO = new ResponseDto("Deleted Successfully:","Delete Id:"+empId);
        return new ResponseEntity<ResponseDto>(responseDTO,HttpStatus.OK);
    }


}
