package BancoFuncs;

import ContaTipos.Cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Banco{

    private List<Cliente> listaClientes = new ArrayList<>();

    public Banco() {
    }

    public final void adicionarClient(Cliente cliente){
        listaClientes.add(cliente);
    }

    public final void removerClient(String nomeClient, String senha){
        List<Cliente> removerClient = new ArrayList<>();

        listaClientes.stream()
                .filter(c -> c.getNomeCliente().equalsIgnoreCase(nomeClient) && c.getSenha().equalsIgnoreCase(senha))
                .forEach(removerClient::add);

        listaClientes.removeAll(removerClient);
    }

    public List<Cliente> listarClientes(){
        return listaClientes;
    }


}
