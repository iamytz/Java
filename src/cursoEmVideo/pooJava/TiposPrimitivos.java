package cursoEmVideo.pooJava;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[]args) { 
        System.out.print("Digite o Nome do aluno: ");
        Scanner teclado = new Scanner(System.in);
        String aluno = teclado.nextLine();
        System.out.printf("\nDigite a Nota do %s: ",aluno);
        float nota = teclado.nextFloat();
        teclado.close();
        System.out.printf("A nota de %s é :%.2f",aluno,nota);
    }
    
}
