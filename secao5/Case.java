package secao5;

import java.util.Scanner;

public class Case {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int res = 1;

        while (res == 1) {
            System.out.println("entre com um valor!");
            int dia = sc.nextInt();
            switch (dia) {
                case 1:
                    System.out.println("domingo");
                    break;
                case 2:
                    System.out.println("segunda");
                    break;
                case 3:
                    System.out.println("terça");
                    break;
                case 4:
                    System.out.println("quarta feira");
                    break;
                case 5:
                    System.out.println("quinta");
                    break;
                case 6:
                    System.out.println("sexta");
                    break;
                case 7:
                    System.out.println("sabado");
                default:
                    System.out.println("valor invalido");
                    break;
            }
            System.out.println("deseja continuar? 1(sim) 0(não)");
            res = sc.nextInt();
        }
    }
}