
package javaapplication1;

public class SquareRoot {
    public static void main(String[] args) {
        double d= 98;
        d = sqrt(d);
        System.out.println(d);
    }
    public static double sqrt(double c)
    {
        if(c < 0)
            return Double.NaN;
        double err= 1e-15;
        double t=c;
        while(Math.abs(t-c/t)> err*t)
            t= (c/t + t) /2.0;
        return t;
    }
}
