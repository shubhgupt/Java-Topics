
package com.ReflectionAPI;

import java.lang.reflect.Method;

/**
 *Reflection API
 * We can call a private method using Reflection API but, this is not a purpose of reflection API, It is 
 * basically used for testing of a class mainly.
 */
public class ReflectionDemo1 {
    public static void main(String[] args) throws Exception
    {
        Class c = Class.forName("com.ReflectionAPI.Test");
        
        Test t = (Test)c.newInstance();
        
        Method m = c.getDeclaredMethod("show", null);
        //As method is private so we have to make it accessible
        m.setAccessible(true);
        //here we are invoking method
        m.invoke(t, null);
    }
}
