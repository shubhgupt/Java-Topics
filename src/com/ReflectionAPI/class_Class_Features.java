
package com.ReflectionAPI;
class Abc
{
    
}
class A extends Abc
{
    
}
public class class_Class_Features {
    public static void main(String[] args) throws Exception
    {
        Class c = Class.forName("com.ReflectionAPI.A");
        // Using this class Class we can check a .class file is whether a class or an interface
        System.out.println(c.isInterface());
        // We can also check the Super class of any class using class Class
        System.out.println(c.getSuperclass());
    }
}
