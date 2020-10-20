package secao10;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nome = "Artur";
        Object obj  = nome;
        System.out.println(obj);
        String nome2 = (String)obj;
    

        System.out.println("Quantas entradas deseja?");
        int n = sc.nextInt();

        double[] vetor  = new double[n];
        double soma = 0;

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Entre com a "+(i+1)+"º Altura");
            vetor[i] = sc.nextDouble();
        }

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = soma / n;

        System.out.printf("Media das Alturas: %.2f%n", media);
        sc.close();
    }
}