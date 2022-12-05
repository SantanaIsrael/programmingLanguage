import java.util.Calendar;

public class Contato {
    private int dataNascimento, telefone;
    private String nome, email;
    static private int numeroContatos = 0;

    // Construtores
    public Contato() {
        email = nome = "Default";
        telefone = dataNascimento = 0;
    }

    public Contato(String nome, int telefone, String email, int dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        numeroContatos++;
    }

    public Contato(String nome, int telefone, String email) {
        this(nome, telefone, email, 0);
        numeroContatos++;
    }

    public Contato(String nome, int telefone) {
        this(nome, telefone, null);
        numeroContatos++;
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

    // Impressões
    public String toString() {
        String result = "Nome: " + nome + "\n" + "E-mail: " + email + "\n" + "Contato: " + telefone;
        
        if (email != null) {
            if (dataNascimento != 0) {
                return result + "\n" + "Data de nascimento: " + dataNascimento + "\n" + "Idade: " + calcularIdade();
            }
            return result;
        }

        return "Nome: " + nome +"\n" + "Telefone: " + telefone;
    }

    public static int printQtd(){
        return numeroContatos;
    }

    //Verificações
    private int calcularIdade() {
        Calendar calendario = Calendar.getInstance();
        int idade = (dataNascimento % 10000) - calendario.get(Calendar.YEAR);
        return idade * -1;
    }
}