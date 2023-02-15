package com.driver;

public class Main {

    public static void main(String[] args)
    {
        RWOnly obj = new RWOnly();
        obj.setName("vijay");
     //getting value of the name member
        System.out.println(obj.getName());
    }
}