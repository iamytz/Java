package cursoEmVideo.do0aoJava;

import java.util.Arrays;

public class LacosdeRepeticao5 {
    public static void main(String[] args) {
        int count[] = new int[100];
        for (int i=0;i<100;i++) {
            Arrays.fill(count,i);
        }
        for (int num:count) {
            System.out.println(num);
        }
    }
}
