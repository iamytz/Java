package Aula04;

public class Banco {
    // DEFININDO ATRIBUTOS
    int numConta;
    String tipo;
    String nomeDono;
    float saldo;
    boolean status;

    // DEFININDO METODO CONSTRUTOR  --Construct Method
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

    public String depositar(float valor) {
        if (valor <0) {
            System.out.printf("Tentaiva de Deposito de %.2f\n",valor);
            System.out.println("O valor de deposito nao pode ser menor que zero.");
            return "O valor nao pode ser menor que zero.";
        }
        if (!getStatus()) {

            System.out.println("A conta deve estar aberta.");
            return "A conta deve estar aberta";
        }
        float valorAdepositar = valor + getSaldo();
        System.out.printf("Deposito de %.2f realizado com sucesso.\n",valor);
        setSaldo(valorAdepositar);
        return "Valor depositado com sucesso!";
    }
    public String sacar(float valor) {
        if (getSaldo() < valor) {
            System.out.printf("Saldo Insfuciente Para Sacar %.2f!\n",valor);
            return "Sem Saldo";
        }
        if (!getStatus()) {
            System.out.println("A conta deve estar aberta");
            return "Conta Fechada";
        }
        System.out.printf("Saque de %.2f Realizado com Sucesso!z\n",valor);
        setSaldo(getSaldo()-valor);
        return "Saque Realizado";
    }

    public void pagarMensalidade() {
        if (!getStatus()) {
            System.out.println("A conta preicsar estar aberta");
            return;
        }
        switch (getTipo()) {
            case "CC":
                if (getSaldo() < 12) {
                    System.out.println("Saldo Insuficiente Para pagar mensalidade de R$12");
                    break;
                } else {
                    setSaldo(getSaldo()-12);
                    System.out.println("Mensalidade de R$12 Paga Com Sucesso. ");
                    break;
                }

            case "CP":
                if (getSaldo() <20) {
                    System.out.println("Saldo Insuficiente Para pagar mensalidade de R$20");
                    break;
                } else {
                    setSaldo(getSaldo()-20);
                    System.out.println("Mensalidade de R$20 Paga Com Sucesso.");
                    break;
                }

        }
    }

        public void fecharConta() {
        if (!getStatus()) {
            System.out.println("A conta precisa esta aberta para ser fechada!");
            }
        if (getSaldo()>0) {
            System.out.println("É Preciso sacar todo dinheiro antes de encerrar a conta!");
        }
        if (getSaldo()<0) {
            System.out.println("Voce nao pode fechar a conta com debitos ausentes!!!");
            }
        setSaldo(0);
        setStatus(false);
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
