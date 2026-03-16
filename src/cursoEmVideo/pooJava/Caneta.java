package cursoEmVideo.pooJava;

public class Caneta{
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //DEFININDO METODO CONSTRUTOR
    public Caneta(String modelo, float ponta){
        setModelo(modelo);
        setCor("Azul");
        setPonta(ponta);
        serCarga(100);
        setTampada(true);
    }

    //  CRIANDO GETTERS E SETTERS PARA CADA ATRIBUTO

    //MODELO GET
    public String getModelo() {
        return this.modelo;
    }
    //MODELO SET
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //COR GET
    public String getCor() {
        return this.cor;
    }
    //COR SET
    public void setCor(String cor) {
        this.cor = cor;
    }

    //PONTA GET
    public float getPonta() {
        return this.ponta;
    }
    //PONTA SET
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    //CARGA GET
    public int getCarga() {
        return this.carga;
    }
    //CARGA SET
    public void serCarga(int carga) {
        this.carga = carga;
    }

    //TAMPADA GET
    public boolean getTampada() {
        return this.tampada;
    }
    //TAMPADA SET
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }









    void status() {
        System.out.println("Caneta Modelo: " + getModelo() );
        System.out.println("Caneta de cor: " + getCor() );
        System.out.println("Caneta de Ponta:  " + getPonta() );
        System.out.println("Carga da Caneta: " + getCarga() );
        System.out.println("Caneta Tampada? " + getTampada() );
    }


    void rabiscar() {
    if(this.tampada == false) {
        System.out.println("Rabiscando.");
    }
    }

    void tampar () {
        if(this.tampada == true) {
            System.out.println("A Caneta Já Está Tampada.");
        }
        else {
            System.out.println("Tampando Caneta.");
            this.tampada = true;
        }
    }

    void destampar() {
        if(tampada == false){
            System.out.println("A Caneta Já Esta Tampada");
        } else {
            System.out.println("Destampando a Caneta.");
            this.tampada = false;
        }
    }

}
