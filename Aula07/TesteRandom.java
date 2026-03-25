package Aula07;

import java.util.Random;

public class TesteRandom {
    static void main() {
        Random numero = new Random();
        int n = numero.nextInt(0,3);

        System.out.println(n);

    }
}
