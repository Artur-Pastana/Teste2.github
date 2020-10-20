package secao10;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        System.out.println("entre com a qtd de produtos");
        int n = sc.nextInt();

        Produto[] produtos = new Produto[n];

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("entre com nome do produto "+(i+1)+"º");
            String nome = sc.next();
            //produtos[i].setNome(nome);
            System.out.println("entre com o valor do produto "+(i+1)+"º");
            double preco = sc.nextDouble();
            //produtos[i].setPreco(preco);

            produtos[i] = new Produto(nome, preco);
        }
        double soma = 0;
        for (int i = 0; i < produtos.length; i++) {
            soma += produtos[i].getPreco();
            System.out.println("Nome: "+produtos[i].getNome()+", preço: "+produtos[i].getPreco());
        }

        double media = soma / n;

        System.out.println("media dos valores : "+media);
    }
}