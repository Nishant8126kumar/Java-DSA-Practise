package com.practise.Testcodeapplication.desingPattern.CreationalPattern;

import lombok.extern.slf4j.Slf4j;
interface XData
{
   static int x=0;
}

@Slf4j
public class SingleTonDesignPattern {


    private static SingleTonDesignPattern singleTonDesignPattern = null;

    public static SingleTonDesignPattern getInstance() {

        if (singleTonDesignPattern == null)
            singleTonDesignPattern = new SingleTonDesignPattern();
        return singleTonDesignPattern;
    }

    public SingleTonDesignPattern() {
        log.info("Instance creation .");
    }

    public static void main(String[] args) {

        SingleTonDesignPattern instance1 = SingleTonDesignPattern.getInstance();
        SingleTonDesignPattern instance2 = SingleTonDesignPattern.getInstance();
        SingleTonDesignPattern instance3 = SingleTonDesignPattern.getInstance();



    }
}
