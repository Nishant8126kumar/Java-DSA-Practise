package com.practise.Testcodeapplication.abstcatTest;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

abstract class Shape {
    @Getter
    private final int price = 10;
    int y = 20;
    final int salary = 10000;
    String name = "Aman";

//    public int getPrice() {
//        return price;
//    }

}

@Slf4j
public class DataMemberTestInSubtractClass extends Shape {
    public static void main(String[] args) {
        DataMemberTestInSubtractClass obj = new DataMemberTestInSubtractClass();
        //give error
//        log.info("Try to access x value :"+obj.x);
        log.info("Try to access y value :" + obj.y);

        log.info("Salary :" + obj.salary);
//        obj.salary=20000; can't changes salary is final.

        log.info("Name :" + obj.name);
        obj.name = "Shivam";
        log.info("Name changed :" + obj.name);


        log.info("Price :" + obj.getPrice());

    }
}
