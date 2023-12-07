package one.digitalinovation.laboojava.entidades;

import one.digitalinovation.laboojava.entidades.constantes.Materias;

public class Caderno extends Produto{
    private Materias tipo;

    public Materias getTipo() {
        return tipo;
    }

    public void setTipo(Materias tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcularFrete() {
        return (getPreco()*getQuantidade()) + tipo.getFator();
    }

    @Override
    public String toString() {
        return "Caderno{" +
                "tipo=" + tipo + '\'' +
                ", código=" + getCodigo() + '\'' +
                ", preço=R$" + getPreco() + '\'' +
                '}';
    }
}

