package com.practise.Testcodeapplication.java8ScenarioBasedQuestion;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Slf4j
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FiendAverageSalaryEmployee {
    private String name;
    private int age;
    private double salary;

    public static void main(String[] args) {

        List<FiendAverageSalaryEmployee> employee = Arrays.asList(new FiendAverageSalaryEmployee("rajesh", 23, 23000)
                , new FiendAverageSalaryEmployee("mohan", 21, 29000),
                new FiendAverageSalaryEmployee("amrita", 25, 13000));



        double averageSalary=employee.stream().mapToDouble(FiendAverageSalaryEmployee::getSalary).average().orElse(0.0);

        log.info("Average salary is :" + averageSalary);


    }
}
