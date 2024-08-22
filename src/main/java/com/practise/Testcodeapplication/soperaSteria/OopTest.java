package com.practise.Testcodeapplication.soperaSteria;

class Parent {
    public  void m1() {
        System.out.println("From parent "
                + " m1()");
    }

    void m2() {
        System.out.println(
                "From parent "
                        + " m2() ");
    }
}

class Child extends Parent {
    public  void m1() {
        System.out.println("From child  m1()");
    }

    public void m2() {
        System.out.println(
                "From child "
                        + " m2() ");
    }

    public static void main(String[] args) {
        Parent obj1 = new Child();

        obj1.m1();

        obj1.m2();
    }
}