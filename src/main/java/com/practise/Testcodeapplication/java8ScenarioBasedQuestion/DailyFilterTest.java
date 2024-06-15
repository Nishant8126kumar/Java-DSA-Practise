package com.practise.Testcodeapplication.java8ScenarioBasedQuestion;

import com.practise.Testcodeapplication.dto.Course;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
public class DailyFilterTest {
    public static void main(String[] args) {

        List<Course> courseList = Arrays.asList(new Course("BCA", "36", 30000D),
                new Course("BCA", "36", 30000D),
                new Course("BBA", "12", 35000D),
                new Course("MCA", "20", 32000D),
                new Course("BCA", "36", 40000D));

//        List<String> mapCourseList=courseList.stream().filter(it->it.getCourseFees()>30000)
//                .map(Course::getCourseName).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//
//        log.info("Map course List :"+mapCourseList);
//
//        Map customMap=courseList.stream().collect(Collectors.toMap(Course::getCourseName,Course::getCourseFees));
//
//        log.info("Map :"+customMap);

        List<String> list = courseList.stream().map(Course::getCourseFees).map(String::valueOf).collect(Collectors.toList());
        log.info("List :"+list);


    }

}