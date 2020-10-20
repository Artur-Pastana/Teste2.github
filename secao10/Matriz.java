package secao10;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("entre com o tamanho da matriz");
        
        int n = sc.nextInt();

        int[][] matriz = new int [n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        //imprimindo valores
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("[%d]  ", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.print("diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.printf("%d  ", matriz[i][j]);
                }
            }
        }
        System.out.println("----------------");
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    cont += 1;
                    System.out.printf("%d  ",matriz[i][j]);
                }
            }
        }

        System.out.println("total de negativos: "+cont);


        sc.close();
    }
}