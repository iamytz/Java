    package cursoEmVideo.do0aoJava;

    /*
    "O java é como um carro poupular."

    por isso, para algumas operacoes matematicas utilizamos a classe math

    */

    public class ClasseMath {
        public static void main(String[]args) {
        double pi = Math.PI; //valor de PI
        double a = 5;
        double b = 2;
        double potenciacao = Math.pow(a,b);
        double raizQuadrada = Math.sqrt(potenciacao);
        double raizCubica = Math.cbrt(potenciacao);





        System.out.printf("O valor de PI é: %.4f\n",pi);
        System.out.printf("%.0f elevado a %.0f é: %.0f\n",a,b,potenciacao);
        System.out.printf("A Raiz Quadrada de %.0f é: %.0f\n",potenciacao,raizQuadrada);
        System.out.printf("A Raiz Cubica de %.0f é %.2f\n\n",potenciacao,raizCubica);

        //Arredondamentos

        System.out.printf("PI equivale a: %.4f\n",pi);
        System.out.printf("Arrendodando PI com floor (chao): %.0f\n",Math.floor(pi));
        System.out.printf("Arredondando PI com ceil (para cima): %.0f\n",Math.ceil(pi));
        System.out.printf("Arredondando PI Aritmeticamente: %d\n",Math.round(pi)); //Math.round() retorna um numero inteiro nao um double.

        // Trabalhando com numeros aleatorios
        // Nativamente Math so escolhe numeros aleatorios de 0 a 1
        double numAleatorio = Math.random();
        // Para escolhermos parametros, precisamos fazer alguns calculos
        // numMin + random * (numMax-numMin)
        int numAleatorioInt = (int)(5 + numAleatorio * (10-5));
        System.out.printf("%.4f\n",numAleatorio);
        System.out.println(numAleatorioInt);
        System.out.println("=\n");

        //para simplificar irei criar uma classe que calcula sem precisar disso, apenas passando parametros
        RandomInt randomizadorInteiro = new RandomInt();
        System.out.printf("Numero inteiro Aleatorio: %d",randomizadorInteiro.random(0,10));

        }
    

    }
