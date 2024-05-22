package com.practise.Testcodeapplication.desingPattern.CreationalPattern;

import lombok.extern.slf4j.Slf4j;

interface Bank {
    public String getBankName();
}

class HDFC implements Bank {
    String bankName = null;

    public HDFC() {
        bankName = "HDFC BANK";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}

class ICICI implements Bank {

    String bankName = null;

    public ICICI() {
        bankName = "ICICI Bank";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}

abstract class AbstractFactory {
    public abstract Bank getBank(String bankName);
}

class BankFactory extends AbstractFactory {

    @Override
    public Bank getBank(String bankName) {
        if (bankName == null)
            return null;
        else if (bankName.equalsIgnoreCase("HDFC"))
            return new HDFC();
        else if (bankName.equalsIgnoreCase("ICIC"))
            return new ICICI();
        return null;
    }
}

@Slf4j
public class AbstractFactoryPattern {
    public static void main(String[] args) {

        BankFactory bankFactory=new BankFactory();
        Bank hdfc=bankFactory.getBank("HDFC");
        log.info("HDFC :"+hdfc.getBankName());
        Bank icic=bankFactory.getBank("ICIC");
        log.info("ICIC :"+icic.getBankName());

    }
}
