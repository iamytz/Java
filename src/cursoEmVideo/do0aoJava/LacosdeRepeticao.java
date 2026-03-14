package cursoEmVideo.do0aoJava;

import java.util.Scanner;

public class LacosdeRepeticao {
    public static void main(String[]args) {
    
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas Notas Você Deseja Calcular?: ");

        int qtdNotas = teclado.nextInt();
        int notas[] = new int[qtdNotas];

        for(int i = 0; i < qtdNotas; i++) {
            System.out.printf("Digite a Nota do %d° Aluno: ",i+1);
            int nota = teclado.nextInt();
            notas[i] = nota;
        }
        int soma = 0;
        for (int i=0; i < qtdNotas;i++) {
            soma += notas[i];
        }
        System.out.printf("A soma das notas dos alunos é: %d\n",soma);
        System.out.printf("A Media das notas dos %d alunos é: %d",qtdNotas,soma/qtdNotas);

        teclado.close();
    }
    
}
