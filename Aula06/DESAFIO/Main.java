package Aula06.DESAFIO;

public class Main {

    public static void main() {
        Cafeteira c1 = new Cafeteira();
        c1.ligarCafeteira();
        c1.adicionarCafe(150);
        c1.adicionarAgua(150);
        c1.passarCafe(7);
        c1.desligarCafeteira();
        c1.status();
    }

}
