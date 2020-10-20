package secao4;

import java.util.Locale;

public class ExpAritm {
    public static void main(String[] args) {
        
        char valor;
        double n;
        String nome;
        int idade;

        nome = "Artur";
        idade = 28;

        n = 10.5745;

        valor = '\u0061';
        System.out.println(valor);
        System.out.printf("Valor = %c%n", valor);
        System.out.printf("n = %.2f%n", n);
        System.out.printf("n = %.4f%n", n);
        
        Locale.setDefault(Locale.US);
        System.out.println("usando o Locale para  mudar a saida");

        System.out.printf("n = %.2f%n", n);
        System.out.printf("n = %.4f%n", n);

        System.out.printf("%s tem %d anos de idade e recebe %.4f de salario%n", nome, idade, n);

        idade = (int) n;//casting
        System.out.println(idade);
    }
}