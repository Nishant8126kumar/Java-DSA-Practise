package com.practise.Testcodeapplication.AccenturesTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EqualAndHashTest {


    private EqualAndHashTest()
    {

    }

    public static void main(String[] args) {
        EntityData data1=new EntityData("Aman",200D);
        EntityData data2=new EntityData();

        log.info("Equal check :"+data1.equals(data2));

        log.info("Data1 HashCode :"+data1);
        log.info("Data2 HashCode :"+data2);
    }
}
