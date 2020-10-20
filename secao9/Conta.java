package secao9;

public class Conta {
    private String nome;
    private double saldo;
    private int numConta;

    public Conta(){

    }

    public Conta(String nome, int numConta){
        this.nome = nome;
        this.numConta = numConta;
    }
    public Conta(int numConta, double deposito, String nome ){
        this.nome = nome;
        this.numConta  = numConta;
        depositar(deposito);
    }

    public String getNome() {
        return nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public int getNumConta() {
        return numConta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumConta(int numConta) {
        if (numConta <= 0) {
            System.out.println("Digite um numero de conta válido");
        }
        else{
            this.numConta = numConta;
        }
    }

    /*public void setSaldo(double saldo) {
        if (saldo <= 0){
            System.out.println("Digite um valor válido");
        }
        else{
            this.saldo = saldo;
        }
    }*/

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Digite um valor válido");
        }
        else{
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("digite um valor válido");
        }
        else{
            this.saldo -= valor + 5.0;
        }
    }
    @Override
    public String toString() {
        return "Dados da conta\n"
                +"Nome da conta: "+this.getNome()
                +", Numero da conta: "+this.getNumConta()
                +", Saldo da conta: "
                +String.format("%.2f",this.getSaldo());
    }
}