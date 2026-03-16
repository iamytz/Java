package projetosPraticos.bancoImobiliario;

public class App {
    public static void main(String[]args) {
        Users jogador1 = new Users();
        jogador1.nome = "Gabriel";

        Users jogador2 = new Users();
        jogador2.nome = "teste";

        jogador1.transferir(24000,jogador2);

        jogador2.retirar(24000);

        System.out.printf("O %s tem R$%d\n",jogador1.nome,jogador1.cash);
        System.out.printf("O %s tem R$%d",jogador2.nome,jogador2.cash);

    }
}
