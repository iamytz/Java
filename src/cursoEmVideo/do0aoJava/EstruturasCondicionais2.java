package cursoEmVideo.do0aoJava;

import java.util.Scanner;


public class EstruturasCondicionais2 {
    public static void main(String[] agrs) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();

        if (idade <16){
            System.out.println("Não Vota!!");
        }
        else if (idade >=16 && idade <18 || idade >70) {
            System.out.println("Não é obrigatorio votar");
        }
        else {
            System.out.println("Obrigatorio Votar!!");
        }

        teclado.close();
    }


}