package ContaTipos.Cliente;

import ContaTipos.Conta;

public class Cliente {

    private String nomeCliente;
    private String senha;
    private Integer idade;
    private Conta contaTipo;
    private String bancoTipo;

    public Cliente(String nomeCliente, String senha, Integer idade, Conta contaTipo, String bancoTipo) {
        this.nomeCliente = nomeCliente;
        this.senha = senha;
        this.idade = idade;
        this.contaTipo = contaTipo;
        this.bancoTipo = bancoTipo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Conta getContaTipo() {
        return contaTipo;
    }

    public void setContaTipo(Conta contaTipo) {
        this.contaTipo = contaTipo;
    }

    public String getBancoTipo() {
        return bancoTipo;
    }

    public void setBancoTipo(String bancoTipo) {
        this.bancoTipo = bancoTipo;
    }

    @Override
    public String toString() {
        return "Nome: " + nomeCliente + "\nIdade: " + idade +"\nBanco: " + bancoTipo
                + "\nAgencia: " + contaTipo.getAgencia() + "-" + contaTipo.getNumero() + "\nSaldo: " + contaTipo.getSaldo() + "\n";
    }
}
