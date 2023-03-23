import javax.sound.sampled.SourceDataLine;

public class Conta{
    public int numero;
    public int agencia;
    private double saldo;
    public String titular;
    
    //Construtores
    public Conta (){
        saldo = 0.00;
        numero = 00;
        titular = "sem conta";
        agencia = 00;
    }

    public Conta (int numero, double saldo, String titular, int agencia){
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.agencia = agencia;
    }

    //Getters
    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //Setters
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //Metodos
    public void depositar (double deposito){
        saldo =+ deposito;
    }    

    public void sacar (double saque){
        saldo = saldo - saque;
    }
    
    public String toString (){
        return "Nome: " + titular + "\n" + "Agencia: " + agencia + "\n" + "Numero da conta: " + numero + "\n" + "Saldo: " + saldo;
    }
}