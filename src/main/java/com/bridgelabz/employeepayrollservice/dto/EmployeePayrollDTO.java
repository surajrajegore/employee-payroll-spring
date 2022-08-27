package com.bridgelabz.employeepayrollservice.dto;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

public @ToString class EmployeePayrollDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\\\s]{2,}$", message = "name is invalid")
    public String name;
    @Min(value = 500,message = "salary must be above 500")
    public  long salary;

    @Pattern(regexp = "m|f",message = "Gender needs to be m or f")
    public String gender;

    @PastOrPresent
    @JsonFormat(pattern = "dd MMM yyyy")
    public LocalDate startDate;
    @NotBlank(message = "note not be blank")
    public String note;
    @NotBlank(message = "profile can not be empty.")
    public String profilePic;
    @NotNull(message = "department can't be null")
    public List<String> departments;

}
