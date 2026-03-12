package cursoEmVideo.do0aoJava;

public class EstruturasRepeticao {
    public static void main(String[]args) {
        int contador = 1;
        /*
        while (contador <=10) {
            System.out.printf("%d é: %s\n",contador,(contador%2==0?"Par":"Impar"));
            contador++;
        }
            */
        while (contador <=10) {
            if (contador % 2 == 0) {
                System.out.printf("%d é Par\n",contador);
                contador++;
                continue;}

            System.out.printf("%d é Impar\n",contador);
            contador++;
        }


    }
}
