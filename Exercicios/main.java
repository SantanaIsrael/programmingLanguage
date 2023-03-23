public class main{
    public static void main(String[] args) {
        Conta c1 = new Conta(3235, 500, "Israel", 3017);
        System.out.println(c1);
        //testando o metodo deposito
        c1.depositar(2);
        System.out.println(c1);
        // testando o metodo sacar
        c1.sacar(3);
        System.out.println(c1);
    }
}