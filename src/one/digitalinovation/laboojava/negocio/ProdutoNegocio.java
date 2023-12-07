package one.digitalinovation.laboojava.negocio;

import one.digitalinovation.laboojava.basedados.Banco;
import one.digitalinovation.laboojava.entidades.Caderno;
import one.digitalinovation.laboojava.entidades.Livro;
import one.digitalinovation.laboojava.entidades.Produto;
import one.digitalinovation.laboojava.entidades.constantes.Materias;

import java.util.Optional;

public class ProdutoNegocio {
    private Banco bancoDados;

    public ProdutoNegocio(Banco banco){
        this.bancoDados = banco;
    }

    public void salvar(Produto novoProduto){
        String codigo = "PR%04d";
        codigo = String.format(codigo, bancoDados.getProdutos().length);
        novoProduto.setCodigo(codigo);

        boolean produtoRepetido = false;
        for(Produto produto: bancoDados.getProdutos()){
            if(produto.getCodigo().equals(novoProduto.getCodigo())){
                produtoRepetido = true;
                System.out.println("Produto já cadastrado.");
                break;
            }
        }

        if (!produtoRepetido){
            this.bancoDados.adicionarProduto(novoProduto);
            System.out.println("Produto adicionado com sucesso.");
        }

    }

    public void excluir(String codigo){
        int i = 0;
        boolean encontrou = false;
        for(Produto produto: bancoDados.getProdutos()){
            if (produto.getCodigo().equals(codigo)){
                encontrou = true;
                break;
            }
            i++;
        }

        if(encontrou){
            bancoDados.removerProduto(i);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }

    }

    public Optional<Produto> consultar(String codigo){
        for (Produto produto: bancoDados.getProdutos()){
            if (produto.getCodigo().equalsIgnoreCase(codigo)){
                return Optional.of(produto);
            };

        }
        return Optional.empty();
    }

    public void listarTodos(){
        if (bancoDados.getProdutos().length ==0){
            System.out.println("Não existem produtos listados");
        } else {
            for(Produto produto: bancoDados.getProdutos()){
                System.out.println(produto.toString());
            }
        }
    }

    public void consultarProduto(String consulta){

        for (Produto produto: bancoDados.getProdutos()){
            if (produto instanceof Caderno) {
                if (((Caderno) produto).getTipo().equals(Materias.valueOf(consulta.toUpperCase()))) {
                    System.out.println(produto.toString());
                }
            }
            if(produto instanceof Livro){
                if(((Livro) produto).getNome().equals(consulta)){
                    System.out.println(produto.toString());
                }
            }
        }
    }

}
