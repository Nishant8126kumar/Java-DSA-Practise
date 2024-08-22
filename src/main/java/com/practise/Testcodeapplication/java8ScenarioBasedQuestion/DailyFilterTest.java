package com.practise.Testcodeapplication.java8ScenarioBasedQuestion;

import com.practise.Testcodeapplication.dto.Employee;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
public class DailyFilterTest {
    public static void main(String[] args) {

        Map map=new HashMap();
        map.forEach((key,value)-> System.out.println("Key :"+key +" value:"+value));
//        List<Employee> employeeList = Arrays.asList(new Employee("Nishant", "BCA", 20000D),
//                new Employee("Aman", "BCA", 30000D),
//                new Employee("Shivam", "BBA", 20000D),
//                new Employee("Ramu", "BBA", 50000D),
//                new Employee("Naman", "B tech", 20000D),
//                new Employee("Dileep", "MBA", 10000D));
//
//        Employee maxSalaryEmployee=employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
//        Employee minSalaryEmployee=employeeList.stream().min(Comparator.comparingDouble(Employee::getSalary)).get();
//
//        log.info("Max salary emp :"+maxSalaryEmployee);
//        log.info("Mix salary emp :"+minSalaryEmployee);
//        Map<String,Long> map=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//
//        log.info("Map :"+map);
//
//       Map map2= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment))
//                .entrySet().stream().filter(it->it.getKey().startsWith("B"))
//                .collect(Collectors.toMap(Map.Entry::getKey,value->value.getValue().stream().mapToDouble(Employee::getSalary).sum()));
//
//       log.info("Map 2 :"+map2);


































































//        Map<String, Double> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment))
//                .entrySet().stream().filter(it -> it.getKey().startsWith("B"))
//                .collect(Collectors.toMap(Map.Entry::getKey, value -> value.getValue().stream()
//                        .mapToDouble(Employee::getSalary).sum()));
//
//        Employee employee = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
//        log.info("Employee :"+employee);

//        log.info("Map :" + map);
    }

}