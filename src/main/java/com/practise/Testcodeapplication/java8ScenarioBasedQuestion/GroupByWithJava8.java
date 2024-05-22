package com.practise.Testcodeapplication.java8ScenarioBasedQuestion;

import com.practise.Testcodeapplication.dto.Course;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class GroupByWithJava8 {
    public static void main(String[] args) {
        List<Course> courseList = Arrays.asList(new Course("BCA", "36", 30000D),
                new Course("BCA", "36", 30000D),
                new Course("BBA", "12", 35000D),
                new Course("MCA", "20", 32000D),
                new Course("BCA", "36", 40000D));

        Map<String,List<Course>> map=courseList.stream().collect(Collectors.groupingBy(Course::getCourseName));

        log.info("List groupBy on course :"+map);
    }
}
