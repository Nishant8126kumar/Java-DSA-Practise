package com.practise.Testcodeapplication.java8ScenarioBasedQuestion;

import com.practise.Testcodeapplication.dto.Employee;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class GroupOnMultiplesFields {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Nishant", "BCA", 20000D, "Male"),
                new Employee("Aman", "BCA", 20000D, "Male"),
                new Employee("Shivam", "BBA", 20000D, "Male"),
                new Employee("Seema", "BBA", 20000D, "Female"),
                new Employee("Neema", "MBA", 20000D, "Female"),
                new Employee("Naman", "MBA", 20000D, "Male"),
                new Employee("Ram", "B tech", 20000D, "Male"));

        Map<String, Double> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment))
                .entrySet().stream().filter(it -> it.getKey().startsWith("B"))
                .collect(Collectors.toMap(Map.Entry::getKey, values -> values.getValue().stream().mapToDouble(Employee::getSalary).sum()));

        log.info("Map values :"+map);

    }
}
