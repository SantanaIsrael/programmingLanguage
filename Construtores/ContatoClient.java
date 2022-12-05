public class ContatoClient {
    public static void main(String[] args) {
        Contato[] contato = new Contato[3];

        contato[0] = new Contato("Israel Santana", 99557398);
        contato[1] = new Contato("Israel Santana", "isanjos.cic@dominio.br",
                99557498);
        contato[2] = new Contato("Israel Santana", "isanjos.cic@dominio.br",
                99557598, 29051998);

        System.out.println("Construtor um: ");
        System.out.println(contato[0]);
        System.out.println("\nConstrutor dois: ");
        System.out.println(contato[1]);
        System.out.println("\nConstrutor tres: ");
        System.out.println(contato[2]);
    }
}