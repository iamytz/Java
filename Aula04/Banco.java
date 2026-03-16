package Aula04;

public class Banco {
    // DEFININDO ATRIBUTOS
    int numConta;
    String tipo;
    String nomeDono;
    float saldo;
    boolean status;

    // DEFININDO METODO CONSTRUTOR
    public Banco(int numConta, String tipo, String nomeDono){
        setNumConta(numConta);
        setTipo(tipo);
        setNomeDono(nomeDono);
        setSaldo(0);
        setStatus(false);
    }

    //CRIANDO METODOS

    public String show(){
        return  String.format("Conta: %d\nTipo: %s\nNome: %s\nSaldo: %.2f\nStatus: %b\n",getNumConta(), getTipo(), getNomeDono(), getSaldo(), getStatus());
    }

    public void abrirConta(){
        if(getTipo().equals("CC") || getTipo().equals("CP")) {
            System.out.println("=".repeat(30));
            System.out.printf("Conta %d Aberta Com Sucesso\n",getNumConta());
            System.out.println("=".repeat(30));
            if (getTipo().equals("CC")) {
                setSaldo(50);
                setStatus(true);
            }else {
                setSaldo(150);
                setStatus(true);
            }
        } else {
            setStatus(false);
            System.out.println("Não foi possivel abrir sua conta");
        }
        }

        //Arrumar para nao permitir valores negativos e verificar status da conta true
    public String depositar(float valor) {
        float valorAdepositar = valor + getSaldo();
        setSaldo(valorAdepositar);
        return "Valor depositado com sucesso!";
    }

    //CRIANDO GETTERS E SETTERS
    
    //GET NUMCONTA
    public int getNumConta() {
        return this.numConta;
    }
    //SET NUMCONTA
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    //GET TIPO
    public String getTipo() {
        return this.tipo;
    }
    //SET TIPO
    public void setTipo(String tipo) {
        if(!tipo.equals("CC") && !tipo.equals("CP")) {
            System.out.print("Tipo de Conta Invalida!! Sua Conta Será Criada Como CP\n");
            this.tipo = "CC";
        } else {
            this.tipo = tipo;
        }
        
    }

    //GET NOMEDONO
    public String getNomeDono() {
        return this.nomeDono;
    }
    //SET NOMEDONO
    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    } 

    //GET SALDO
    public Float getSaldo() {
        return this.saldo;
    }
    //SET SALDO
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //GET STATUS
    public boolean getStatus() {
        return this.status;
    }
    //SET STATUS
    public void setStatus(boolean status) {
        this.status = status;
    }
}
