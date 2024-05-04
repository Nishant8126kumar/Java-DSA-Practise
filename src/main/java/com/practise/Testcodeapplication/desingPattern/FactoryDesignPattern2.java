package com.practise.Testcodeapplication.desingPattern;

import lombok.extern.slf4j.Slf4j;

abstract class Plan {
    public int rate;

    abstract public void getRate();

    public int calculateUnit(int unit) {
        return rate * unit;
    }
}

class CommercialPlan extends Plan {
    @Override
    public void getRate() {
        rate = 20;
    }
}

class IndustrialPlan extends Plan {
    @Override
    public void getRate() {
        rate = 30;
    }
}

class GetPlanFactory {
    public static Plan getPlan(String planType) {
        if (planType == null)
            return null;
        else if (planType.equalsIgnoreCase("CommercialPlan")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("IndustrialPlan")) {
            return new IndustrialPlan();
        }
        return null;
    }
}

@Slf4j
public class FactoryDesignPattern2 {
    public static void main(String[] args) {
        Plan plan1=GetPlanFactory.getPlan("CommercialPlan");
        Plan plan2=GetPlanFactory.getPlan("IndustrialPlan");
        plan1.getRate();
        plan2.getRate();
        log.info("Bill calculate by plan1 . :"+plan1.calculateUnit(2));
        log.info("Bill calculate by plan2 . :"+plan2.calculateUnit(2));

    }
}
