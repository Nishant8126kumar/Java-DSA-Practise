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
}

