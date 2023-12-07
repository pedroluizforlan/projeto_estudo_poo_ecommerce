package one.digitalinovation.laboojava.entidades;

public abstract class Produto {
    //Código de identificação do produto
    private String codigo;
    //Valor unitário do produto
    private double preco;
    //Quantidade comprada do produto
    private int quantidade;

    public Produto(){

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public abstract double calcularFrete();
}
