package one.digitalinovation.laboojava.entidades;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(){
        this.nome = "Pedro";
        this.cpf = "12332112322";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome +
                '}';
    }
}
