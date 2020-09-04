package com.threading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MultithreadingDemo2 {

    public static void main(String[] args) {
        Abc obj1 = new Abc();
        obj1.start();

//        Bcd obj2 = new Bcd();
//        Thread t = new Thread(obj2);
//        t.start();
// if we are creating a class Bcd whose sole purpose is to implement the runnable interface and run method 
// inside it then instead of creating that class we can also create a sub class inside main function which
// will take less lines of code to execute the same thing.
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("hello");
                    try {Thread.sleep(1000);} catch (InterruptedException Ie) {}
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
                
class Abc extends Thread {

        public void show() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hii");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        @Override
        public void run() {
            show();
        }
    }
// If we want to a class to extend another class and also execute multithreading then we can not not extend
// that class and Thread class both at the same time because multiple Inheritance is not supported in java
// therefore we then implement runnable interface and must define the run method inside it.
// Now Start method will not work for object of class Bcd So, we have to use Thread class to call start
// method.
//class Bcd implements Runnable
//{
//    public void run()
//    {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("hello");
//            try{ Thread.sleep(1000);} catch(InterruptedException Ie){}
//        }
//    }
//}
