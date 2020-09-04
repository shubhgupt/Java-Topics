
package com.threading;


public class MultithreadingDemo3 {
    public static void main(String[] args) {
        Abc obj1 = new Abc();
        obj1.start();
        
        // As we know that Thread class constructor only expects the object of runnable interface.
        //we can reduce much lines of code only by using lemda expression or annonymous classes.
        
        //Anonymous Class
//        Thread t = new Thread(new Runnable() {
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("hello");
//                    try {Thread.sleep(1000);} catch (InterruptedException Ie) {}
//                }
//            }
//        });
//        t.start();
        
        Thread t = new Thread(()  ->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
            }
        }
        );
        t.start();
        
    }
}
