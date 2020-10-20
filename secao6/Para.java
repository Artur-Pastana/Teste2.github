package secao6;

import java.util.Scanner;

public class Para {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("digite quantas vezes quer rodar");
        int v = input.nextInt();
        int soma = 0;

        for(int i = 0; i < v ;i++){
            int x = input.nextInt();
            soma += x;
            System.out.println(soma);
        }
        System.out.println("soma: "+soma);

        input.close();
    }
}