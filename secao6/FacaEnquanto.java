package secao6;

import java.util.Scanner;

public class FacaEnquanto {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double tempCelsius = 0; 
        double tempFahrenheit = 0;
        char res = 's';

        do {
            System.out.println("digite a temṕeratura em Celsius!");
            tempCelsius = in.nextDouble();
            //calculando
            tempFahrenheit = (9*tempCelsius/5)+32;
            System.out.printf("Equivalente a Farhenheit = %.2f%n", tempFahrenheit);

            System.out.println("deseja continuar s/n");
            res = in.next().charAt(0);
        } while (res !=  'n');
    }
}