package com.practise.Testcodeapplication;

import com.practise.Testcodeapplication.dto.Course;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class TestCustomObjectInSet {
    public static void main(String[] args) {
        Course course1 = new Course("BCA", "36", 30000D);
        Course course2 = new Course("BCA", "36", 30000D);

        Set<Std> set = new HashSet<>();
        log.info("HasCode course 1 :"+course1.hashCode());
        log.info("HasCode course 2 :"+course2.hashCode());

//        set.add(course1);
//        set.add(course2);

        Std std1 = new Std("aman", "BCA");
        Std std2 = new Std("aman", "BCA");

        set.add(std1);
        set.add(std2);

        log.info("Set :" + set);

    }
}

@ToString
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Std {
    String name;
    String course;
}
