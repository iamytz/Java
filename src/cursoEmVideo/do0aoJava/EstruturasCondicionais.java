package cursoEmVideo.do0aoJava;

import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[]args) { 
        float a, b, media;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a 1° Nota: ");
        a = teclado.nextFloat();
        System.out.print("Digite a 2° Nota: ");
        b = teclado.nextFloat();

        media = (a+b)/2;
        System.out.printf("A Média é 9\n");
        System.out.printf("Sua Nota Média é %.2f\n",media);
        if (media >= 9) {
            System.out.print("Parabens");
        }
        else {
            System.out.println("Tente denovo.");
        }

        teclado.close();
    }
}
