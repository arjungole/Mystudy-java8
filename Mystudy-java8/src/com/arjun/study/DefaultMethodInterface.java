package com.arjun.study;


interface A{
    default void m1(){
        System.out.println("In A->m1");
    }
}

interface B{
    default void m1(){
        System.out.println("In B->m1");
    }
}
public class DefaultMethodInterface implements A,B{

    public void m1(){
        A.super.m1();
        B.super.m1();
    }

    public static void main(String arg[]){
        new DefaultMethodInterface().m1();
    }
}
