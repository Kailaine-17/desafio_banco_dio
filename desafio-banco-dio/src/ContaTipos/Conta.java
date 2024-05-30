package ContaTipos;

public abstract class Conta implements RegrasConta{
    private static int AGENCIA_PADRAO = 470970;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        if (valor > this.saldo){
            System.out.println("Dinheiro insuficiente!");
        }
        else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
    }
}
