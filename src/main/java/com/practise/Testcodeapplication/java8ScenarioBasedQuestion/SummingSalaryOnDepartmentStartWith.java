package com.practise.Testcodeapplication.java8ScenarioBasedQuestion;

import com.practise.Testcodeapplication.dto.Employee;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Slf4j
public class SummingSalaryOnDepartmentStartWith {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Nishant", "BCA", 20000D),
                new Employee("Aman", "BCA", 20000D),
                new Employee("Shivam", "BBA", 20000D),
                new Employee("Ramu", "BBA", 20000D),
                new Employee("Naman", "B tech", 20000D),
                new Employee("Dileep", "MBA", 20000D));

        Map<String,Double> map=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment))
                        .entrySet().stream().filter(it->it.getKey().startsWith("B"))
                        .collect(Collectors.toMap(Map.Entry::getKey, value->value.getValue().stream().mapToDouble(Employee::getSalary).sum()));

        log.info("Map :"+map);



//        log.info("Map :"+map);


    }
}
