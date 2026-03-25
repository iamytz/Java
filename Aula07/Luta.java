package Aula07;

import java.util.Random;

public class Luta {
    //DEFININDO ATRIBUTOS
    private Lutador desafiado;      //tipo abstrato de dado
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    public void marcarluta(Lutador l1, Lutador l2) {
        if (l1.equals(l2)) {
            System.out.println("Não pode ser o mesmo lutador");
            setAprovada(false);
            setDesafiante(null);
            setDesafiado(null);
        } else if (l1.getCategoria() != l2.getCategoria()) {
            System.out.println("Os lutadores precisam ter a mesm categoria");
            setAprovada(false);
            setDesafiante(null);
            setDesafiado(null);
        } else {
            setAprovada(true);
            setDesafiante(l1);
            setDesafiado(l2);
        }
    }
    // regras da luta
    // so pode ser marcada entre objetos diferentes
    // so podem ser lutadores da mesma classe
    // so pode 1 vencer, ou empate.

    public void lutar() {
        if (isAprovada()) {
            Random random = new Random();
            int numero_random = random.nextInt(0,3);
            desafiado.apresentarLutador();
            desafiante.apresentarLutador();
            System.out.println("Comemçando a luta.");
            switch (numero_random) {
                case 0:
                    System.out.println("Empate");
                    desafiado.empatar();
                    desafiante.empatar();
                case 1:
                    System.out.println("Lutador Desafiante Ganhou");
                    desafiante.ganhar();
                    desafiado.perder();
                case 2:
                    System.out.println("Lutador Desafiado Ganhou");
                    desafiado.ganhar();
                    desafiante.perder();

            }



        } else {
            System.out.println("A luta não pode acontecer");
        }
    }







    // METODOS ACESSORES E MODIFICADORES -> GETTERS E SETTERS

    private Lutador getDesafiado() {
        return desafiado;
    }

    private void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    private Lutador getDesafiante() {
        return desafiante;
    }

    private void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    private int getRounds() {
        return rounds;
    }

    private void setRounds(int rounds) {
        this.rounds = rounds;
    }

    private boolean isAprovada() {
        return aprovada;
    }

    private void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }




}


