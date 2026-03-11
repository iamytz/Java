package cursoEmVideo.do0aoJava;

import java.util.Scanner;

public class VerificadorIdade {
    public static void main(String[]args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();
        int categoria;
        if (idade < 16){
            categoria = 1;
        }
        else if (idade >= 16 && idade <18) {
            categoria = 2;
        }
        else if (idade >= 18 && idade <=70) {
            categoria = 3;
        }
        else {
            categoria = 4;
        }

        switch (categoria) {
            case 1:
                System.out.print("Não pode votar!");
                break;
            case 2:
                System.out.print("Voto não obrigatorio");
                break;
            case 3:
                System.out.print("Voto Obrigatorio");
                break;
            case 4:
                System.out.print("Voto não obrigatorio");
        }


        teclado.close();

    }


}