package cursoEmVideo.do0aoJava;

/*

Operadores Unarios servem para trabalhart com uma unidade, seja + OU -
PÓS INCREMENTO OU DECREMENTO FUNCIONA NO FINAL DE UMA OPERAÇÃO 
PRÉ INCREMENTO OU DECREMENTO FUNCIONA NO COMECO DE UMA OPERACAO

*/

public class OperadoresUnarios {
    public static void main(String[]args) {
        // POS INCREMENTRO
        int num = 10;
        int valorMais = 10 + num++;
        System.out.printf("Soma Com pós incremento\nValor: %d\nNum: %d\n",valorMais,num);


        //PRE INCREMENTO
        int valorMenos = 10 + --num;
        System.out.println(valorMenos);
    }
    
}
