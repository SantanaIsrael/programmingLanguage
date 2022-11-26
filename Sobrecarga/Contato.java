import java.util.Calendar;

public class Contato {
    private int dataNascimento, telefone;
    private String nome, email;
    
    //Construtores
    public Contato() {
        email = nome = "Default";
        telefone = dataNascimento = 0;
    }

    public Contato(int dataNascimento, int telefone, String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Contato(String nome, int telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters
    public int getDataNascimento() {
        return dataNascimento;
    }

    public long getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    //Impressões
    public void imprimirContato() {
        System.out.println("Nome: " + nome + "E-mail: \n" + email + "Contato: \n" + telefone);
        if (dataNascimento != 0) {
            System.out.printf("Data de nascimento: " + dataNascimento + "\n"
                    + "Idade: " + calcularIdade());
        }
    }

    public void imprimeContatoSimples() {
        System.out.println("Nome: " + nome + "\n" + "Telefone: " + telefone);
    }

    private int calcularIdade() {
        Calendar calendario = Calendar.getInstance();
        int idade = (dataNascimento % 10000) - calendario.get(Calendar.YEAR);
        return idade * -1;
    }
}