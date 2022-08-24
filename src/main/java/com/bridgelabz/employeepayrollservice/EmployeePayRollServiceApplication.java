package com.bridgelabz.employeepayrollservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages =  {"com.bridgelabz.employeepayrollservice.service"})
public class EmployeePayRollServiceApplication {

    public static void main(String[] args) {
        System.out.println("welcome to employee payroll");
        SpringApplication.run(EmployeePayRollServiceApplication.class, args);
    }

}
