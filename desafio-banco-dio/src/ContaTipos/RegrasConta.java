package ContaTipos;

public interface RegrasConta {

      void sacar(double valor);

      void depositar(double valor);

      void transferir(double valor, Conta contaDestino);
}
