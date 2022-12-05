public class ContatoClient{
    public static void main(String[] args){
        Contato agenda = new Contato("Israel", 719888855, "isanjos@cic.uesc.br", 25031998);
        System.out.println(agenda);
        System.out.println("Pessoas adicionadas: " + Contato.printQtd());
    }
}