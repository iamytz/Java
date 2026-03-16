package projetosPraticos.bancoImobiliario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Users jogador1 = new Users();
        Users jogador2 = new Users();
        Users jogador3 = new Users();
        Users jogador4 = new Users();

        jogador1.nome = "Jogador1";
        jogador2.nome = "Jogador2";
        jogador3.nome = "Jogador3";
        jogador4.nome = "Jogador4";



        while(true){

            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("=".repeat(40));
            System.out.println("     Bem vindo ao Banco Imobiliario");
            System.out.println("=".repeat(40));
            System.out.printf("%s: %d   |   %s: %d\n",jogador1.nome,jogador1.cash,jogador2.nome, jogador2.cash);
            System.out.printf("%s: %d   |   %s: %d\n",jogador3.nome,jogador3.cash,jogador4.nome, jogador4.cash);
            System.out.println("=".repeat(40));
            System.out.print("1. Transferir     |   2.Debitar\n");
            System.out.print("3. Creditar       |   4.Sair\n");
            System.out.print("Digite Sua Opção: ");
            int opition = scan.nextInt();

            switch(opition) {
                case 1:
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("=".repeat(40));
                System.out.println("     Bem vindo ao Banco Imobiliario");
                System.out.println("=".repeat(40));
                System.out.printf("%s: %d   |   %s: %d\n",jogador1.nome,jogador1.cash,jogador2.nome, jogador2.cash);
                System.out.printf("%s: %d   |   %s: %d\n",jogador3.nome,jogador3.cash,jogador4.nome, jogador4.cash);
                System.out.println("=".repeat(40));
            }
            
            scan.close();
            break;
        }

    }
}
