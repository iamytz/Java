package cursoEmVideo.do0aoJava;

public class LacosdeRepeticao2 {
    public static void main(String[]args) {
        String month[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int daysMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        for (int i = 0; i < month.length;i++){
        System.out.printf("O Mês de %s Tem %d Dias\n",month[i],daysMonth[i]);
        }
        
    }
}
