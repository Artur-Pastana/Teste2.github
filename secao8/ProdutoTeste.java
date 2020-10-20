package secao8;

import java.util.Scanner;

public class ProdutoTeste {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Produto prod1 = new Produto();
        System.out.println("Entre com os dados do produto");
        System.out.println("nome:");
        String nome = sc.nextLine();
        prod1.setNome(nome);
        System.out.println("Preço:");
        double preco = sc.nextDouble();
        prod1.setPreco(preco);
        System.out.println("Quantidade:");
        int qtd = sc.nextInt();
        prod1.setQuantidade(qtd);

        //prod1.mostrar();
        System.out.println(prod1);

        System.out.println("Entre com a Quantidade alterados no estoque:");
        int valor = sc.nextInt();
        prod1.addProduto(valor);
        System.out.println(prod1);
        
        System.out.println("Entre com o valor de retirada do estoque");
        int saida = sc.nextInt();
        prod1.removerProduto(saida);
        System.out.println(prod1);


    }
}