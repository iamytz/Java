package projetosPraticos.bancoImobiliario;

public class Users {
    int id;
    String nome;
    int cash = 25000;
    int tempoPreso = 0;
    boolean preso = false;

    public void transferir(int cash, Users destino) {
        if(this.cash >= cash) {
            this.cash -= cash;
            destino.receber(cash);
        }
        

    }

    public void receber(int cash) {
        this.cash += cash;
    }

    public void retirar(int cash) {
        this.cash -= cash;
    }

}

