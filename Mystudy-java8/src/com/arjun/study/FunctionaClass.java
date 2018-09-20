package com.arjun.study;

@java.lang.FunctionalInterface
interface FunctionalInterface{

    void m1();

    default void m2(){
        System.out.println("In a Functional interface");
    }
}



public class FunctionaClass {

    public static void main(String arg[]){
        FunctionalInterface interface1 = () -> {

            System.out.println("Do Something here");

        };

        interface1.m1();
        interface1.m2();
    }

}
