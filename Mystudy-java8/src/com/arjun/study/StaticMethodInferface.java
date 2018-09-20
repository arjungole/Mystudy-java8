package com.arjun.study;

interface StaticInterface{

    static void m1(){

        System.out.println("in Static");
    }
}

public class StaticMethodInferface {


    public static void main(String args[]){

        StaticInterface.m1();
    }

}
