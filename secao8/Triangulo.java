package secao8;

public class Triangulo {
    
    private double a;
    private double b;
    private double c;

    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    public double area() {
        double p = (this.getA()+this.getB()+this.getC())/2;
        double res = Math.sqrt(p * (p - this.getA()) * (p - this.getB()) * (p - this.getC()));
        return res;
    }
}