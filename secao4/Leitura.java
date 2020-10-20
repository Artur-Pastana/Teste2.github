package secao4;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String palavra;
        double valor;
        char letra;

        System.out.println("digite um palavra");
        palavra = sc.nextLine();
        System.out.println("vc digitou: "+palavra);

        System.out.println("digite um valor");
        valor = sc.nextDouble();
        System.out.println(valor);

        System.out.println("digite uma palvra");
        letra = sc.next().charAt(1);
        System.out.println(letra);

        
    }
}