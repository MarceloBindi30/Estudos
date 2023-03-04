package AulasSexta.Aula1.Exemplo3;

public class Pessoa {
    
    private String nome;

    public Pessoa() {}

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void apresentar() {
        System.out.println("Olá!");
    }
}
