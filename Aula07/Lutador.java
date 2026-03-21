package Aula07;

public class Lutador {
    //  DEFININDO ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private char categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //DEFININDO METODO CONSTRUTOR -> CONSTRUCTOR
    public Lutador(String nome,String nacionalidade,int idade, float altura,float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setCategoria(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);

    }

    //  DENINDO METODOS







    //DEFININDO METODOS ACESSORES E MODIFICADORES -> GETTERS E SETTERS
    private int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }

    private char getCategoria() {
        return categoria;
    }

    private void setCategoria(float peso) {
        if (peso < 80) {
            this.categoria = 'L';
        } else if (peso >= 80 && peso < 100) {
            this.categoria = 'M';
        } else {
            this.categoria = 'P';
        }
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    private float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
    }
}
