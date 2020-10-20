package secao8;

import java.util.Scanner;

public class EstaticoTeste {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Entre com um Raio:");
        double raio = in.nextDouble();

        //Calculator calc = new Calculator();

        double c = Calculator.circunferencia(raio);

        double v = Calculator.volume(raio);

        System.out.printf("Circunferencia: %.2f%n",c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f", Calculator.PI);
    }
    
   
}