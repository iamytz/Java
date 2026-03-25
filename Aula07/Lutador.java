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
        this.setPeso(peso);
        this.setCategoria(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);

    }

    //  DENINDO METODOS

    //apresentar lutador
    //ganhar
    //perder
    //empatar

    public void apresentarLutador() {
        System.out.print("=".repeat(20));
        System.out.print(" ULTRA EMOJI COMBAT ");
        System.out.print("=".repeat(20));
        System.out.printf("\nNome: %s\n",this.getNome());
        System.out.printf("Nacionalidade: %s\n",this.getNacionalidade());
        System.out.printf("Idade: %d\n",this.getIdade());
        System.out.printf("Altura %.2fm\n",this.getAltura());
        System.out.printf("Peso: %.2fkg\n",this.getPeso());
        System.out.printf("Categoria: %c\n",this.getCategoria());
    }

    public void ganhar() {
        this.setVitorias(getVitorias()+1);
    }

    public void perder() {
        this.setDerrotas(getDerrotas()+1);
    }

    public void empatar() {
        this.setEmpates(getEmpates()+1);
    }



    //DEFININDO METODOS ACESSORES E MODIFICADORES -> GETTERS E SETTERS
    private int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }

    public char getCategoria() {
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
        return this.peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
    }
}
