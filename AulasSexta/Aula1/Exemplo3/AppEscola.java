package AulasSexta.Aula1.Exemplo3;

public class AppEscola {
    public static void main(String[] args) {
        
        Estudante e = new Estudante("",0);

        e.apresentar();
        e.setNome("Marcelo");
        System.out.println("Nome: " + e.getNome());
        e.setRa(12301);
        System.out.println("RA: " + e.getRa());

    }
}
