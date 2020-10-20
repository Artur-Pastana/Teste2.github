package secao8;

public class Calculator {
    
    /*public final double PI = 3.14357;

    public  double circunferencia(double r) {
        return 2.0 * r * PI;
    }

    public  double volume(double r) {
        return (4.0 * PI * r *r *r)/3.0;
    }*/

    public static final double PI = 3.14357;

    public static double circunferencia(double r) {
        return 2.0 * r * PI;
    }

    public static double volume(double r) {
        return (4.0 * PI * Math.pow(r, 3))/3.0;
    }
    
}