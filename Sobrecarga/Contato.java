import java.util.Calendar;

public class Contato {
    private int dataNascimento, telefone;
    private String nome, email;

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
    }

    public Contato(String nome, int telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
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

    private int calcularIdade() {
        Calendar calendario = Calendar.getInstance();
        int idade = (dataNascimento % 10000) - calendario.get(Calendar.YEAR);
        return idade * -1;
    }
}