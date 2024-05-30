package Program;

import BancoFuncs.Banco;
import ContaTipos.Cliente.Cliente;
import ContaTipos.Conta;
import ContaTipos.ContaCorrente;
import ContaTipos.ContaPoupanca;

import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        char resp;
        do {
            System.out.println("Qual banco deseja se cadastrar? ");
            String bancoNome = sc.next();

            sc.nextLine();

            System.out.println("Digite seu nome:");
            String clientNome = sc.nextLine();
            System.out.println("Digite sua senha:");
            String clientSenha = sc.next();
            System.out.println("Digite sua idade:");
            int clientIdade = sc.nextInt();
            System.out.println("Qual tipo de conta deseja criar? Corrente/Poupanca");
            String contaTipo = sc.next();

            Conta contaEscolhida = null;

            try {
                if (contaTipo.equalsIgnoreCase("Corrente")) {
                    contaEscolhida = new ContaCorrente();

                } else if (contaTipo.equalsIgnoreCase("Poupanca")) {
                    contaEscolhida = new ContaPoupanca();

                } else {
                    throw new IOException("Tipo de banco inválido!");
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            banco.adicionarClient(new Cliente(clientNome, clientSenha, clientIdade, contaEscolhida, bancoNome));
            System.out.println("Cliente Registrado!\nDeseja registrar outro cliente? (S/N)");
            resp = Character.toUpperCase(sc.next().charAt(0));


        } while (resp == 'S');


        banco.listarClientes().get(0).getContaTipo().depositar(124124.2);

        System.out.println(banco.listarClientes());

        sc.close();
    }
}
