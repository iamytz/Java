package Aula04;

// pagina inicial onde sera executado o banco

public class Desafio {
public static void main(String[] args) {
    Banco user1 = new Banco(1, "CP", "Jubileu");
    Banco user2 = new Banco(2, "CX", "Creusa");

    user1.abrirConta();
    user1.depositar(10);
    user1.pagarMensalidade();
    System.out.println(user1.show());

    //SEMPRE SEPARAR OS OBJETOS (PESSOAS)

    user2.abrirConta();
    user2.sacar(50);
    user2.pagarMensalidade();
    System.out.println(user2.show());
    user2.fecharConta();
    System.out.println(user2.show());



    }   
}
