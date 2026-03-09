    package cursoEmVideo.do0aoJava;

    public class CalculadoraBasica {

        void soma(int num1, int num2){
            int result = (int) (num1+num2);
            System.out.printf("O Resutado da Adição é: %d",result);
        }

        void sub(int num1, int num2){
            int result = (int) (num1-num2);
            System.out.printf("O Resutado da Subtração é: %d",result);

        }

        void mult(int num1, int num2){
            int result = (int) (num1 * num2);
            System.out.printf("O Resultado da Multiplicação é: %d",result);
        }

        void div(int num1, int num2){
            int intResult = (int) (num1/num2);
            float num1Float = (float)(num1);
            float num2Float = (float)(num2);
            float floatResult = (float)(num1Float/num2Float);
            System.out.printf("O Resultado da Divisão Inteira é: %d\n",intResult);
            System.out.printf("Resto da Divisão Inteira: %d\n",num1%num2);
            System.out.printf("O Resultado da Divisão Exata é: %.2f\n",floatResult);
            System.out.printf("Resto da Divisão Exata: %.2f",num1Float%num2Float);
        }
    }
