package com.arjun.study;

@java.lang.FunctionalInterface
interface FunctionalInterface1{

    void m1();

    default void m2(){
        System.out.println("In a Functional interface");
    }
}



public class FunctionalInterface implements FunctionalInterface1{

    public void m1(){

        System.out.println("Do something");

    }

}
