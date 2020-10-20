package secao6;

import java.util.Scanner;

public class Enquanto {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int valor = in.nextInt();
        int soma = 0;
        while (valor != 0) {
            soma += valor;
            valor = in.nextInt();
        }
        System.out.println(soma);
        in.close();
    }
}