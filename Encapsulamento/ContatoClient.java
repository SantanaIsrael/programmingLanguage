import java.util.Scanner;

public class ContatoClient {
    public static void main(String[] args) {
        Contato contato = new Contato();
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Dados padroes.\nNascimento: %d\nTelefone:%d\nNome:%s\nE-mail:%s",
                contato.getDataNascimento(),
                contato.getTelefone(), contato.getNome(), contato.getEmail());

        System.out.println("\nInicilizar contato");
        System.out.println("Nome: ");
        contato.setNome(teclado.next());
        System.out.println("Nascimento (DDMMAAAA): ");
        contato.setDataNascimento(teclado.nextInt());
        System.out.println("E-mail: ");
        contato.setEmail(teclado.nextLine());
        System.out.println("Telefone: ");
        contato.setTelefone(teclado.nextInt());

        contato.imprimirContato();

        teclado.close();
    }
}
