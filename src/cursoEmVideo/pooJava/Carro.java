package cursoEmVideo.pooJava;

public class Carro{
    String model;
    String color;
    int year;
    float weight;
    int maxSpeed;

    void acelerar(){
        System.out.printf("Acelerando até %d km/h",this.maxSpeed);
    }

}