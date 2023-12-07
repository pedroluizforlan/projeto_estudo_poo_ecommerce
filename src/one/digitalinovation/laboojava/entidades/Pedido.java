package one.digitalinovation.laboojava.entidades;

import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private String codigo;
    private Cliente cliente;
    private List<Produto> produtos;
    private Double total;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Pedido(){
        this.produtos = new ArrayList<>();
    }
    public String getCodigo() {
        return codigo;
    }

    public String setCodigo(String codigo){
       return this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProduto() {
        return produtos;
    }

    public void setProduto(List<Produto> produto) {
        this.produtos = produto;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    private String getProdutosComprados(){
        StringBuilder produtos = new StringBuilder();
        produtos.append("[");

        for(Produto produto: getProdutos()){
            produtos.append(produto.toString());
            produtos.append("Qtd: ");
            produtos.append(produto.getQuantidade());
            produtos.append(" ");
        }
        produtos.append("]");

        return produtos.toString();
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "codigo='" + codigo + '\'' +
                ", cliente=" + cliente +
                ", produtos=" + getProdutosComprados() +
                ", total=" + total +
                '}';
    }
}
