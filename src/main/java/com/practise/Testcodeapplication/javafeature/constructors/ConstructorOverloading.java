package com.practise.Testcodeapplication.javafeature.constructors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConstructorOverloading {

    private String empName;
    private Double salary;

    public ConstructorOverloading(String empName) {
        this.empName = empName;
    }
    public ConstructorOverloading(String empName,Double salary) {
        this.empName = empName;
        this.salary=salary;
    }

    public static void main(String[] args) {
        ConstructorOverloading c1=new ConstructorOverloading("Nishant");
        log.info("Name :"+c1.empName);
        ConstructorOverloading c2=new ConstructorOverloading("Aman",10000D);
        log.info("After overloading :");
        log.info("Name =:"+c2.empName +" : Salary =:"+ c2.salary);

    }
}
