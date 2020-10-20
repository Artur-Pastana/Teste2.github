package secao7;

import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int maximo = maximo(a, b, c);
        System.out.println(maximo);
    }

    public static int maximo(int a, int b, int c) {
        int aux;
        if (a > b && a > c) {
            System.out.println("maior = "+ a);
            aux = a;
        }else if (b > c) {
            System.out.println("maior = "+ b);
            aux = b;
        }else{
            System.out.println("maior = "+ c);
            aux = c;
        }
        return aux;
    }
}
