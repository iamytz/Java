package cursoEmVideo.do0aoJava;

import java.util.Scanner;

public class Vetores {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a qtd de notas: ");
        int qtdNotas = teclado.nextInt();
        int notas[] = new int [qtdNotas];
        qtdNotas++;

        for (int idx = 1; qtdNotas!=idx;idx++) {
            System.out.printf("Digite a Nota do %d° Aluno: ",idx);
            int nota = teclado.nextInt();
            notas[idx-1] = nota;
        }
        int soma=0 ;
        qtdNotas--;
        for(int i=0; i<qtdNotas;i++) {
            soma += notas[i];
        }
        System.out.printf("Soma %d",soma);
    teclado.close();
    }
    
}
