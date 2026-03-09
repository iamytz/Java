package cursoEmVideo.pooJava;

public class TesteTipos {
    public static void main(String[] args) {
        // TRANSFORMANDO NUMEROS DA FAMILIA INT EM STR
        byte valor1 = 127;
        short valor2 = 32767;
        int valor3 = 1000000;
        long valor4 = 20000000;

        float valor5 = 80.2f;
        double valor6 = 160.4;

        String bytes = Byte.toString(valor1);
        String shorts = Short.toString(valor2);
        String ints = Integer.toString(valor3);
        String longs = Long.toString(valor4);

        String floats = Float.toString(valor5);
        String doubles = Double.toString(valor6);


        System.out.printf("%s, %s, %s, %s, %s, %s\n",bytes,shorts,ints,longs,floats,doubles);
        System.out.println(bytes+shorts+ints+longs+floats+doubles);


        // CONVERTENDO VALORES STR PARA VALORES NUMERICOS DA FAMILIA INT E FLOAT
        byte bytesNum = Byte.parseByte(bytes);
        short shortsNum = Short.parseShort(shorts);
        int intsNum = Integer.parseInt(ints);
        long longsNum = Long.parseLong(longs);

        float floatsNum = Float.parseFloat(floats);
        double doublesNum = Double.parseDouble(doubles);

        long somaInt = bytesNum+shortsNum+intsNum+longsNum;
        double somaFloat = floatsNum+doublesNum;
        double somaTotal = somaFloat+somaInt;

        System.out.printf("\nSoma dos inteiros: %d\nSoma dos Float: %.2f\n",somaInt,somaFloat);
        System.out.printf("Soma Total: %.2f",somaTotal);




    }
} 
