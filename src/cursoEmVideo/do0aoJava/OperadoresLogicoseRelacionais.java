package cursoEmVideo.do0aoJava;

public class OperadoresLogicoseRelacionais {
    public static void main(String[]args) {
        //Operadoes ternarios r = n1>n2 ? n1:n2
        // se n1 for > que n2 r recebe n1, senao recebe n2
        int n1,n2,result;
        RandomInt random = new RandomInt();

        //para essa clase, vou chamar o metodo random de 2 maneiras
        // pela classe math e pela minha classe
        // numeros aleatorios de 0 a 100

        n1 = (int) (0 + Math.random() * (10-0)); //clase math
        n2 = random.random(0,10); //minha classe criada 
        result = n1>n2?n1:(n2>n1?n2:11);
        
        System.out.printf("N1: %d\n",n1);
        System.out.printf("N2: %d\n",n2);
        if(result == 11) {
            System.out.print("São iguais\n");
        }
        else {
            System.out.printf("Resultado: %d é maior\n",result);
        }

        // Operadores logicos retornam true ou false
        System.out.printf("N1 && N2 >= 5 : %b\n",n1 > 5 && n2 > 5);
        System.out.printf("N1 || N2 >= 5 : %b\n",n1 > 5 || n2 > 5);
        System.out.printf("N1 ^  N2 >= 5 : %b",n1 > 5 ^ n2 > 5);








        // COMPARANDO STRINGS 
    /* 
     *  String nome1,nome2;
     *   nome1 = "Gabriel";
     *    nome2 = new String("Gabriel");
     *    System.out.println(nome1==nome2?"igual":"diferente");
    */
        // SEMPRE VAI RETORNAR "DIFERENTE" POIS COMPARA O OBJETO



    /* 
     * String nome1,nome2;
     * nome1 = "Gabriel";
     * nome2 = new String("Gabriel");
     * System.out.println(nome1.equals(nome2)?"Iguais":"Diferentes");
     */
        // esse sim funciona como esperado











    }
}
