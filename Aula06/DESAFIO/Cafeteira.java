package Aula06.DESAFIO;

import java.security.PublicKey;

public class Cafeteira implements Contoller {
    // DEFININDO ATRIBUTOS DA CAFETEIRA
    private int qtdAgua;    //quantidade de agua na cafeteira
    private int qtdCafe;    //quantidade de cafe na cafeteira
    private boolean  power;  //status de on ou off
    private int cafePassados; //QTD CAFE PASSADOS

    //DEFININDO METODO CONSTRUTOR
    public Cafeteira() {
        setQtdAgua(0);
        setQtdCafe(0);
        setPower(false);
        setCafePassados(0);
    }

    //  DEFININDO METODOS DO CONTROLLER ->
    public void ligarCafeteira() {
        if (!isPower()) {
            setPower(true);
        } else {
            System.out.println("A Cafeteira ja esta ligada");
        }
    }

    public void desligarCafeteira() {
        if (isPower()) {
            setPower(false);
        } else {
            System.out.println("A cafeteira ja esta desligada");
        }
    }

    public void adicionarAgua(int qtd) {
        this.setQtdAgua(this.getQtdAgua()+qtd);
    }

    public void adicionarCafe(int qtd) {
        this.setQtdCafe(this.getQtdCafe()+qtd);
    }

    public void passarCafe(int qtd) {
        int qtdNescessaria = 15 * qtd; //qtd nescessaria por xicara 15 de cada

        if (this.getQtdAgua() < qtdNescessaria || this.getQtdCafe() < qtdNescessaria) {
            System.out.println("Sem recursos, para cada café vao 15g de cada.");
        } else {
            System.out.printf("Os %d cafes estao prontinho, um brinde ao java",qtd);
            setQtdCafe(getQtdCafe()-qtdNescessaria);
            setQtdAgua(getQtdAgua()-qtdNescessaria);
            setCafePassados(qtd);
        }
    }

    public void status() {
        System.out.printf("Ligada?: %b\n",this.isPower());
        System.out.printf("QTD agua: %d\n",this.getQtdAgua());
        System.out.printf("QTD cafe: %d\n",this.getQtdCafe());
        System.out.printf("QTD Cafe passados: %d\n",this.getCafePassados());
    }


















    //DEFININDO METODOS ACESSORES E MODIFICADORES -> GETTERS E SETTERS

    private int getQtdCafe() {
        return qtdCafe;
    }

    private void setQtdCafe(int qtdCafe) {
        this.qtdCafe = qtdCafe;
    }

    private int getQtdAgua() {
        return qtdAgua;
    }

    private void setQtdAgua(int qtdAgua) {
        this.qtdAgua = qtdAgua;
    }

    private boolean isPower() {
        return power;
    }

    private void setPower(boolean power) {
        this.power = power;
    }

    private void setCafePassados(int qtd) {
        this.cafePassados = qtd;
    }

    private int getCafePassados() {
        return cafePassados;
    }
}
