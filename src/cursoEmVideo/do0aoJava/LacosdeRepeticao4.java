package cursoEmVideo.do0aoJava;

import java.util.Arrays;

public class LacosdeRepeticao4 {
    public static void main(String[]args) {
    int lista[] = {3, 7, 6, 1, 9, 4, 2};

    int p = Arrays.binarySearch(lista,1);
    System.out.printf("Encontrei o valor na posicao %d",p);
    }
}
