package one.digitalinovation.laboojava.entidades;

import one.digitalinovation.laboojava.entidades.constantes.Genero;

public class Livro extends Produto{
    //Nome do Livro
    private String nome;
    // Genero
    private Genero genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public double calcularFrete() {
        return (getPreco()*getQuantidade()) * (1+ getGenero().getFator());
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", genero=" + genero + '\'' +
                ", código=" + getCodigo() + '\'' +
                ", preço=R$" + getPreco() + '\'' +
                '}';
    }
}
