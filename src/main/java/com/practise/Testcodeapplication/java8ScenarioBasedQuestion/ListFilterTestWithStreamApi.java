package com.practise.Testcodeapplication.java8ScenarioBasedQuestion;

import com.practise.Testcodeapplication.dto.Course;
import com.practise.Testcodeapplication.dto.Employee;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
public class ListFilterTestWithStreamApi {
    public static void main(String[] args) {

        List<Course> courseList = Arrays.asList(new Course("BCA", "36", 30000D),
                new Course("BCA", "36", 30000D),
                new Course("BBA", "12", 35000D),
                new Course("MCA", "20", 32000D),
                new Course("BCA", "36", 40000D));

        Map<Double,Long> groupByCourseOnFees=courseList.stream()
                .collect(Collectors.groupingBy(Course::getCourseFees,Collectors.counting()));

        log.info("Group by list on course :"+groupByCourseOnFees);

        Course maxFeesCourse=courseList.stream().min(Comparator.comparingDouble(Course::getCourseFees)).get();
        log.info("Max Course fees :"+maxFeesCourse);

       Map<String,Double> map= courseList.stream().collect(Collectors.groupingBy(Course::getCourseName))
                .entrySet().stream().collect(Collectors.toMap(k->k.getKey(),v->
                        v.getValue().stream().mapToDouble(Course::getCourseFees).sum()));

       log.info("Map :"+map);




    }
}