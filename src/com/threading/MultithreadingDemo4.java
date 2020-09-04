
package com.threading;


public class MultithreadingDemo4 {
    public static void main(String[] args) {
        new Thread(()  -> new MultithreadingDemo4().show("Hello")).start();
        
        try{ Thread.sleep(10);} catch(InterruptedException Ie){}
        
        new Thread(()  ->new MultithreadingDemo4().show("Hii")).start();
    }
    public void show(String str)
    {
        for (int i = 0; i < 5; i++) {
            System.out.println(str);
            try{ Thread.sleep(200);} catch(InterruptedException Ie){}
        }
    }
}

