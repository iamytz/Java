package Aula06.DESAFIO;

public interface Contoller {
    public abstract void ligarCafeteira();
    public abstract void desligarCafeteira();
    public abstract void adicionarAgua(int qtd);
    public abstract void adicionarCafe(int qtd);
    public abstract void passarCafe(int qtd);

    public abstract void status();
}
