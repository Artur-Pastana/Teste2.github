package secao10;

public class Produto {
    
    private String nome;
    private double preco;

    public Produto(String nome, double valor){
        this.nome = nome;
        this.preco = valor;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}