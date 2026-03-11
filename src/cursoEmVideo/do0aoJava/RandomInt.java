package cursoEmVideo.do0aoJava;

public class RandomInt{

        public int random(int a, int b) {
            int valorAleatorio = (int)(a + Math.random()*(b- a+1));
            return valorAleatorio;


        }

}