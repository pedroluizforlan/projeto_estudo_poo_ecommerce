package one.digitalinovation.laboojava.basedados;

import one.digitalinovation.laboojava.entidades.Cupom;
import one.digitalinovation.laboojava.entidades.Cliente;
import one.digitalinovation.laboojava.entidades.Pedido;
import one.digitalinovation.laboojava.entidades.Produto;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Produto> produtos;
    private List<Pedido>  pedidos;
    private List<Cupom> cupons;
    private Cliente cliente;

    public Banco(){
        this.produtos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.cliente = new Cliente();
        this.cupons = new ArrayList<>();

        cupons.add(new Cupom("CUMPOM2", 2));
        cupons.add(new Cupom("CUMPOM5", 5));
        cupons.add(new Cupom("CUMPOM7", 7));
    }

    public Produto[] getProdutos() {
        return produtos.toArray(new Produto[pedidos.size()]);
    }

    public Pedido[] getPedidos() {
        return pedidos.toArray(new Pedido[pedidos.size()]);
    }

    public Cupom[] getCupons() {
        return cupons.toArray(new Cupom[cupons.size()]);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }
    public void removerProduto(int posicao){
        this.produtos.remove(posicao);
    }

    public void adicionarPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }

    public void removerPedido(int index){
        this.pedidos.remove(index);
    }
}
