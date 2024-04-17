package com.practise.Testcodeapplication.java8ScenarioBasedQuestion;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class FindStudentGradesBySystem {

    private String name;
    private double grades;

    public static void main(String[] args) {
        List<FindStudentGradesBySystem> students = new ArrayList<>();
        students.add(new FindStudentGradesBySystem("Pawan", 99.0));
        students.add(new FindStudentGradesBySystem("Nishant", 82.0));
        students.add(new FindStudentGradesBySystem("Charlie", 82.5));
        students.add(new FindStudentGradesBySystem("Rob", 88.5));
        students.add(new FindStudentGradesBySystem("Daniel", 99.5));

        FindStudentGradesBySystem filterStudent=students.stream()
                .max(Comparator.comparingDouble(it->it.grades)).orElse(null);

        log.info("Highest grades student is :" + filterStudent.name);
    }
}
