package secao5;

public class Teste {
    public static void main(String[] args) {
        
        boolean n = 10 != 10;
        System.out.println(n);

        n = (5 != 10 && 5 < 10 && 10 > 100) || 100 > 200;

        System.out.println(n);
        System.out.printf("A    B   A e B %n");
        System.out.printf("V    V     %b%n", true && true);
        System.out.printf("V    F     %b%n", true && false);
        System.out.printf("F    V     %b%n", false && true);
        System.out.printf("F    F     %b%n", false && false);
        System.out.println();
        System.out.printf("A    B   A OU B %n");
        System.out.printf("V    V     %b%n", true || true);
        System.out.printf("V    F     %b%n", true || false);
        System.out.printf("F    V     %b%n", false ||true);
        System.out.printf("F    F     %b%n", false || false);

        System.out.printf("%b%n",!(5 == 10));

        String nome;
        nome = "Artur";
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Nome: %s%n", nome.toLowerCase());
        System.out.printf("Nome: %s%n", nome.toUpperCase());
        System.out.printf("Nome: %s%n", nome.charAt(4));
        

    }
}