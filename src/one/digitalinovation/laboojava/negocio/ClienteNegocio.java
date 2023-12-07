package one.digitalinovation.laboojava.negocio;

import one.digitalinovation.laboojava.basedados.Banco;
import one.digitalinovation.laboojava.entidades.Cliente;

import java.util.Optional;

public class ClienteNegocio {
    private Banco bancoDados;

    public ClienteNegocio(Banco banco){
        this.bancoDados = banco;
    }


    public Optional<Cliente> consultar(String cpf){
        if (bancoDados.getCliente().getCpf().equals(cpf)){
            return Optional.of(bancoDados.getCliente());
        } else {
            return Optional.empty();
        }

    }
}
