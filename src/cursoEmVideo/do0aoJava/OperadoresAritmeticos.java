package cursoEmVideo.do0aoJava;

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        System.out.print("Digite o Num1: ");
        Scanner input = new Scanner(System.in);
        byte num1 = input.nextByte();
        System.out.print("Digite o Num2: ");
        byte num2 = input.nextByte();

        float num1Float = (float)num1;
        float num2Float = (float)num2;


        System.out.printf("A soma entre %d e %d é: %d\n",num1,num2,num1+num2);
        System.out.printf("A subtração entre %d e %d é: %d\n",num1,num2,num1-num2);
        System.out.printf("A multipicação entre %d e %d é: %d\n",num1,num2,num1*num2);
        System.out.printf("A divisão inteira entre %d e %d é: %d\n",num1,num2,num1/num2);

        System.out.printf("A divisão exata entre %.0f e %.0f é: %.2f\n",num1Float,num2Float,num1Float/num2Float);

        System.out.printf("O resto da divisão entre %d e %d é: %d",num1,num2,num1%num2);

        input.close();
        
    }
}
