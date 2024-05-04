package com.practise.Testcodeapplication.desingPattern;

import lombok.extern.slf4j.Slf4j;

abstract class Product {
    public abstract void display();
}

@Slf4j
class ConcreteProductA extends Product {
    @Override
    public void display() {
        log.info("This is concrete product A.");
    }
}

@Slf4j
class ConcreteProductB extends Product {
    @Override
    public void display() {
        log.info("This is concrete product B.");
    }
}

abstract class Creator {
    public abstract Product factoryMethod();
}

class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}

@Slf4j
public class FactoryDesignPattern {
    public static void main(String[] args) {

        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.factoryMethod();
        productA.display();

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.factoryMethod();
        productB.display();

    }
}
