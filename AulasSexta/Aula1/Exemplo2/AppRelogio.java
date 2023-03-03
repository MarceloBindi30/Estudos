package AulasSexta.Aula1.Exemplo2;

public class AppRelogio {
    public static void main(String[] args) {
        
        Relogio r = new Relogio(20, 80, 200);

        System.out.println("Hora: " + r.getHora());
        System.out.println("Minuto: " + r.getMinuto());
        System.out.println("Segundo: " + r.getSegundo());

        r.setHora(12);
        r.setMinuto(35);
        r.setSegundo(58);

        System.out.println("Hora: " + r.getHora());
        System.out.println("Minuto: " + r.getMinuto());
        System.out.println("Segundo: " + r.getSegundo());

    }
}
