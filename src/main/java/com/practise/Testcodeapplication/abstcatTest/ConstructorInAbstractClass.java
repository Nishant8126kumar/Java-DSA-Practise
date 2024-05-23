package com.practise.Testcodeapplication.abstcatTest;

import lombok.extern.slf4j.Slf4j;

abstract class Student {

    String studentName = null;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    abstract String getStudentName();

    public void showDetails() {
        System.out.println("Hello from show method .");
    }


}

@Slf4j
public class ConstructorInAbstractClass extends Student {
    String studentRollNo;

    public ConstructorInAbstractClass(String studentName, String studentRollNo) {
        super(studentName);
        this.studentRollNo = studentRollNo;
    }

    @Override
    String getStudentName() {
        return null;
    }

    public static void main(String[] args) {

        ConstructorInAbstractClass obj = new ConstructorInAbstractClass("Nishant", "2110");
        log.info("Student name :" + obj.studentName);
        log.info("Student RollNo :" + obj.studentRollNo);

    }
}
