package com.practise.Testcodeapplication.java8ScenarioBasedQuestion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Slf4j
public class HighestGradeStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Pawan", 99.0));
        students.add(new Student("Nishant", 82.0));
        students.add(new Student("Charlie", 82.5));
        students.add(new Student("Rob", 88.5));
        students.add(new Student("Daniel", 99.5));

//        Student student=students.stream()
//                .max(Comparator.comparingDouble(Student::getGrade))
//                .orElse(null);
//        log.info("Highest grade student is :"+student);

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(7);
        list.add(19);
        list.add(11);

        int x=list.stream().max(Comparator.comparingDouble(it->it)).orElse(0);
        log.info("Min :"+x);
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student {
    private String name;
    private Double grade;
}
