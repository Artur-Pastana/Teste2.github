package secao9;

import java.util.Scanner;

public class ContaTeste {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.println("entre com o numero da conta");
        int num = sc.nextInt();
        System.out.println("digite o nome do titular da conta");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Desejas iniciar com depósito (s / n)?");
        char resp = sc.next().charAt(0);

        if (resp == 's') {
            System.out.println("valor do depósito?");
            double dp = sc.nextDouble();
            conta = new Conta(num, dp, nome);
        }
        else{
            conta = new Conta(nome, num);
        }

        System.out.println(conta);

        System.out.println("Valor para deposito");
        double valor = sc.nextDouble();
        conta.depositar(valor);
        System.out.println(conta);

        System.out.println("valor a sacar:");
        valor = sc.nextDouble();
        conta.sacar(valor);
        System.out.println(conta);
    }
}