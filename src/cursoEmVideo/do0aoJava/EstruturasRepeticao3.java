package cursoEmVideo.do0aoJava;

import java.util.Scanner;


public class EstruturasRepeticao3 {
    public static void main(String[]args) {
        int count = 0;
        System.out.print("Digite seu nome: ");
        Scanner teclado = new Scanner(System.in);
        String nome = new String (teclado.nextLine());
        int qtd_letras = nome.length();
        
        
        while (count != qtd_letras) {
            System.out.printf("%c\n",nome.charAt(count));
            count++;
        }
        teclado.close();
    }   
    
}
