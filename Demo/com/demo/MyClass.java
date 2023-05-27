package com.demo;

import java.util.HashMap;
import java.util.Map;

class Base
{ 
    Base()
    {
        System.out.print("Base");
    }
} 
public class MyClass extends Base
{ 
    public static void main(String[] args)
    { 
        new MyClass(); 
        new Base(); 
    } 
}