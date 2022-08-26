package com.bridgelabz.employeepayrollservice.dto;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

public @ToString class EmployeePayrollDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\\\s]{2,}$", message = "name is invalid")
    public String name;
    @Min(value = 500,message = "salary must be above 500")
    public  long salary;

    public String gender;

    @JsonFormat(pattern = "dd MMM yyyy")
    public LocalDate startDate;
    public String note;
    public String profilePic;
    public List<String> departments;

}
