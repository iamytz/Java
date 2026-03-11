package cursoEmVideo.do0aoJava;

import java.util.Scanner;

/*

Operadores de Atribuição server para atribuir uma valor acima do seu valor original
eles funciomam com todos os operadores aritmeticos

a += b -> a = a + b
a -= b -> a = a - b
a *= b -> a = a * b
a /= b -> a = a / b
a %= b -> a = a % b




*/

public class OperadoesAtribuicao {
    public static void main(String[]args) {
        System.out.print("Digite o Numero a : ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.print("Digite o Numero b : ");
        int num2 = input.nextInt();
        System.out.printf("Op. Atribuicão +=: a += b [%d += %d] -> a= %d\n",num1,num2,num1+=num2);
        System.out.printf("Op. Atribuicão -=: a -= b [%d -= %d] -> a= %d\n",num1,num2,num1-=num2);
        System.out.printf("Op. Atribuicão *=: a *= b [%d *= %d] -> a= %d\n",num1,num2,num1*=num2);
        System.out.printf("Op. Atribuicão /=: a /= b [%d /= %d] -> a= %d",num1,num2,num1/=num2);
        System.out.printf("Op. Atribuicão %=: a %= b [%d %= %d] -> a= %d",num1,num2,num1%=num2);
        input.close();
    }
}