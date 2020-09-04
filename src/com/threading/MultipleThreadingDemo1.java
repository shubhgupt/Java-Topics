
package com.threading;

public class MultipleThreadingDemo1 {
    public static void main(String[] args) {
        A obj1 = new A();
//        obj1.run(); if I call run method then also it will use the same main thread instead of which
// I want to create two threads associated with these two objects. so, we have to use start() method which
// will call the run method and inside which we have written the call of our desired method for e.g. show
        obj1.start();
        
        B obj2 = new B();
        obj2.start();
        // After using start method also we our not able to see the mixing of output i.e. because of our 
        // CPU. It is damn fast, as soon as it reaches the for loop it use its cache storage and execute
        // the whole for loop in one go.
    }
}
class A extends Thread
{
    public void show()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hii");
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Some thread exception is occured!!");
            }
        }
    }
    @Override
    public void run(){
        show();
    }
}
class B extends Thread
{
    public void show()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Some thread exception is occured!!");
            }
        }
    }
    @Override
    public void run(){
        show();
    }
}
// After using sleep() method also you can not be sure of getting Hii and Hello one after another because
// it depends upon synchronizer of our OS to synchronize methods if two method reach the CPU at the same
// time.