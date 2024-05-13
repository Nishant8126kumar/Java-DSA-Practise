package com.practise.Testcodeapplication;

import com.practise.Testcodeapplication.dto.Course;
import com.practise.Testcodeapplication.dto.Employee;
import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class TestCustomObjectInSet {
    public static void main(String[] args) {
        Course course1 = new Course("BCA", "36", 30000D);
        Course course2 = new Course("BCA", "36", 30000D);

        Set<Course> set = new HashSet<>();

        set.add(course1);
        set.add(course2);

        log.info("Set :" + set);

    }
}
