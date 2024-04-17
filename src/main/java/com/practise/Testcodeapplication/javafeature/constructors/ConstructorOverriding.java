package com.practise.Testcodeapplication.javafeature.constructors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConstructorOverriding {

    String empName;

    public ConstructorOverriding(String empName) {
        this.empName = empName;
    }

    void display() {
        log.info("Display emp name from base class :" + empName);
    }
}

@Slf4j
class TestOverride extends ConstructorOverloading {

    String empNewName;



    public TestOverride(String empName, String empNameNew) {
        super(empName);
        this.empNewName = empNameNew;
    }

    void display() {
        log.info("Display from sub-class :");
    }


    public static void main(String[] args) {
        TestOverride testOverride = new TestOverride("Nishant", "Aman");
        testOverride.display();
    }
}
