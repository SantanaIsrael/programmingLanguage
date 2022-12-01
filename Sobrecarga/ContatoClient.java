public class ContatoClient {
    public static void main(String[] args) {
        Contato[] agenda = new Contato[3];

        agenda[0] = new Contato("Israel", 32355589, "isanjos@dominio.br", 23051999);
        System.out.println(agenda[0]);
        agenda[1] = new Contato("Israel", 32355589, "isanjos@dominio.br");
        System.out.println(agenda[1]);
        agenda[2] = new Contato("Israel", 32355589);
        System.out.println(agenda[2]);
    }
}