package com.practise.Testcodeapplication.javafeature;

import com.practise.Testcodeapplication.dto.Employee;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Slf4j
public class FilterTest {

    public static void main(String[] args) {
        Employee employee1=Employee.builder()
                .name("Nishant Sharma")
                .address("Aligarh")
                .contactNumber("8126632693")
                .build();

        Employee employee2=Employee.builder()
                .name("Aman Dixit")
                .address("Rampur")
                .contactNumber("9926632693")
                .build();

        Employee employee3=Employee.builder()
                .name("Nitin")
                .address("Noida")
                .contactNumber("8226632693")
                .build();

        Employee employee4=Employee.builder()
                .name("Nitin")
                .address("Aligarh")
                .contactNumber("7326632693")
                .build();

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(employee1, employee2, employee3, employee4));

        log.info("Size of arrayList is :"+employeeList.size());


//        List<Employee> filterList=employeeList.stream()
//                .filter(it->it.getAddress().equalsIgnoreCase("Aligarh"))
//                .collect(Collectors.toList());
//
//        log.info("filterList :"+filterList.stream().map(Employee::getName).collect(Collectors.toList()));

        Predicate<?super Employee> predicate=employee -> employee.getName().equalsIgnoreCase("Nishant Sharma");

        Employee employee=employeeList.stream().filter(predicate).findFirst().get();

        log.info("Employee :"+employee);


    }
}
