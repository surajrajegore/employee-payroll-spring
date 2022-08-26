package com.bridgelabz.employeepayrollservice.repository;

import com.bridgelabz.employeepayrollservice.entity.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeePayrollData,Integer> {

}
