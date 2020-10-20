package secao8;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    //metodos get e set
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //metodos adicionais
    public double totalValorEmEstoque() {
        return this.getPreco() * this.getQuantidade();
    }

    public void addProduto(int qtd) {
        this.quantidade += qtd;
        System.out.println("Vc add: "+qtd);
    }

    public void removerProduto(int qtd) {
        this.quantidade -= qtd;
        System.out.println("Vc removeu: "+qtd);
    }

    public void mostrar() {
        System.out.printf("Produto%nDados: Nome: %s Preço: %.2f Qtd: %d Total: %.2f%n",this.getNome(), this.getPreco(),this.getQuantidade()
            , totalValorEmEstoque());
    }

    @Override
    public String toString() {
        String info = "Produto\n";
        info += "Dados: ";
        info += "nome: "+this.getNome();
        info += " preço: "+this.getPreco();
        info += " Quantidade: "+this.getQuantidade();
        info += " Total em Estoque: "+this.totalValorEmEstoque();
        return info;
    }


}