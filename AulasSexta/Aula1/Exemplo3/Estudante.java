package AulasSexta.Aula1.Exemplo3;

public class Estudante extends Pessoa{
    
    private int ra;

    public Estudante(String nome, int ra){
        super(nome);
        this.ra = ra; 
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getRa() {
        return ra;
    }

    //polimorfismo
    @Override
    public void apresentar() {
        System.out.println("Boa noite!");
    }
}
