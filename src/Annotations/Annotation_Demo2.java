package Annotations;

//Marker Annotation (consist of no fields)

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Single Value Annotation (consists of one field)
//Multi Value Annotation (consists of more than one field)

@Target(ElementType.TYPE)/* this annotation we have to use while creating our own Annotation this 
 specifies the scope of our annotation i.e. on which element we are gonna use it */
@Retention(RetentionPolicy.RUNTIME) /* this annotation specifies the time until which our annotation
 will be applicable */
@interface SmartPhone
{
    String OS() default "Symbian";
    int version() default 1;
}

@SmartPhone(OS = "Android", version = 3) /* After giving this Annotation Nokia can be called as an 
Smart Phone */
class NokiaASeries
{
    String model;
    int size;

    public NokiaASeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
    
}

public class Annotation_Demo2 {
    public static void main(String[] args) {
        NokiaASeries obj = new NokiaASeries("Fire", 5);
        Class c = obj.getClass();
        Annotation an = c.getAnnotation(SmartPhone.class);
        SmartPhone sm = (SmartPhone)an;
        System.out.println(sm.OS());
    }
}
