package secao8;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Triangulo triangulo = new Triangulo();
        triangulo.setA(5);
        triangulo.setB(5);
        triangulo.setC(5);
        System.out.printf("A area do triangulo = %.1f%n", triangulo.area());
    }
}