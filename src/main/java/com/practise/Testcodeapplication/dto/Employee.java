package com.practise.Testcodeapplication.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String name;
    private String contactNumber;
    private String address;
    private String mobileNo;
    private String emailId;
    private Double salary;
    private String department;
    private String gender;

    public Employee(String name, String department, Double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public Employee(String name, String department, Double salary,String gender) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.gender=gender;
    }
}

