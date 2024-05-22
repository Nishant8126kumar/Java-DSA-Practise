package com.practise.Testcodeapplication.desingPattern.CreationalPattern;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

interface Prototype {
    Prototype getClone();
}

@Slf4j
@AllArgsConstructor
class EmployeeRecord implements Prototype {

    private int id;
    private String name, designation;
    private double salary;
    private String address;

    public EmployeeRecord() {
        System.out.println("   Employee Records of Oracle Corporation ");
        System.out.println("---------------------------------------------");
        System.out.println("Eid" + "\t" + "Ename" + "\t" + "Edesignation" + "\t" + "Esalary" + "\t\t" + "Eaddress");

    }


    public void showRecord() {

        System.out.println(id + "\t" + name + "\t" + designation + "\t" + salary + "\t" + address);
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id, name, designation, salary, address);
    }
}

@Slf4j
public class PrototypeDesignPattern {
    public static void main(String[] args) {
        EmployeeRecord e1=new EmployeeRecord(1,"Nishant","Java developer",1000D,"Gr noida");
        e1.showRecord();
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();
        e2.showRecord();

    }
}
