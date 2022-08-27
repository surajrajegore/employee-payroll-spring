package com.bridgelabz.employeepayrollservice.repository;

import com.bridgelabz.employeepayrollservice.entity.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeePayrollData,Integer> {
    @Query(value = "select * from employee_payroll, employee_department where employee_id = id and departments = :department", nativeQuery = true)
    List<EmployeePayrollData> findEmployeesByDepartment(String department);
}
