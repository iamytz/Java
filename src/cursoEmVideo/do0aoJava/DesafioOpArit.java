package cursoEmVideo.do0aoJava;
import java.util.Scanner;


/*
INTUITO DO  DESAFIO: JUNTAR CURSO DE POO E JAVA

DESAFIO:

CRIAR UMA CLASSE QUE TEM SUAS OPERAÇÕES DEFINIDAS E , AO APLICAR VALORES (ATRIBUTOS)
ELA OS SOMA (METODOS) E IMPRIME O RESULTADO

ENTRADA DE DADOS 
CALCULO NA CLASSE 
IMPRIMIR RESULTADO POR METODO

*/


public class DesafioOpArit {
    public static void main(String[] args) {
        System.out.print("Digite o Primeiro Numero: ");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextShort();   
        num.nextLine(); // limpa o ENTER do buffer
        System.out.print("Digite o Operador: ");
        String string = num.nextLine();
        char operador = string.charAt(0);
        System.out.print("Digite o Segundo Numero: ");
        int num2 = num.nextShort();

        System.out.printf("%d %c %d\n",num1,operador,num2);

        CalculadoraBasica calc = new CalculadoraBasica();

        num.close();
        if(operador == '+'){
            calc.soma(num1,num2);
        }
        else if (operador == '-'){
            calc.sub(num1,num2);
        }
        else if (operador == '*'){
            calc.mult(num1, num2);
        }
        else if (operador == '/'){
            calc.div(num1, num2);
        }
        else {
            System.out.print("Operador Invalido.");
        }

    }
    
}
/* 
FUTURAS MELHORIAS

ADD SWITCH
RETURN RESULT AO INVES DE IMPRIMIR
DIV POR 0 RETORNAR MENSAGEM DE ERRO


*/