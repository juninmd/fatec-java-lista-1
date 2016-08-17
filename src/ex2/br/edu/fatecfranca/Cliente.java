package ex2.br.edu.fatecfranca;

public class Cliente {
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;

    public Cliente(){
        this.numeroAgencia = 0;
        this.numeroConta = 0;
        this.nome = "";
        this.saldo = 0;
    }
        
    public Cliente(int numeroAgencia, int numeroConta, String nome){
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = 0;
    }
    
    public void realizarDeposito(float saldo){
        this.saldo += saldo;
    }
    public void realizarSaque(float saldo)
    {
        if(this.saldo < saldo){
            return;
        }
        this.saldo -= saldo;
    }
    //o numero da conta, nome do cliente e saldo atual. 
    public String DadosCliente(){
        return "Número da conta: "+this.numeroConta+"\n"+
               "Nome do Cliente: "+ this.nome + "\n"+
               "Saldo Atual: "+this.saldo;
    }
}
