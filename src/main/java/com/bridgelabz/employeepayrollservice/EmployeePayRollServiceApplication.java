package com.bridgelabz.employeepayrollservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages =  {"com.bridgelabz.employeepayrollservice.service"})
@Slf4j
public class EmployeePayRollServiceApplication {

    public static void main(String[] args) {
        System.out.println("welcome to employee payroll");
        ApplicationContext context = SpringApplication.run(EmployeePayRollServiceApplication.class, args);

        log.info("Employee payroll Started in {} environment", context.getEnvironment().getProperty("environment"));
        log.info("Employee Payroll DB User name is {} ", context.getEnvironment().getProperty("spring.datasource.username"));
    }

}
