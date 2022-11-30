import java.util.Calendar;

public class Contato {
    private int dataNascimento;
    private int telefone;
    private String nome, email;

    public Contato(String nomeString, String emailString, int telefoneInt, int dataNascimentoInt) {
        nome = nomeString;
        email = emailString;
        telefone = telefoneInt;
        dataNascimento = dataNascimentoInt;
    }

    public Contato(String nomeString, String emailString, int telefoneInt) {
        nome = nomeString;
        email = emailString;
        telefone = telefoneInt;
    }

    public Contato(String nomeString, int telefoneInt) {
        nome = nomeString;
        telefone = telefoneInt;
    }

    // Getters
    public int getDataNascimento() {
        return dataNascimento;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        String result;
        result = "Nome: " + nome + "\n" + "Telefone: " + telefone;
        if (email != null) {
            result += "\n" + "Email: " + email;
            if (dataNascimento != 0) {
                result += "\n" + "Idade: " + calcularIdade();
            }
        }
        return result;
    }

    private int calcularIdade() {
        Calendar calendario = Calendar.getInstance();
        int idade = (dataNascimento % 10000) - calendario.get(Calendar.YEAR);
        return idade * -1;
    }
}