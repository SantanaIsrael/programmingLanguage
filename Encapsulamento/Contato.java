import java.util.Calendar;

public class Contato {
    protected int dataNascimento;
    private long telefone;
    private String nome, email;

    public void incializarContato() {
        telefone = 0;
        dataNascimento = 0;
        nome = email = "Default";
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

    // set
    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void imprimirContato() {
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Idade: " + calcularIdade());
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Contato: " + telefone);
    }

    public int calcularIdade() {
        Calendar calendario = Calendar.getInstance();
        int idade = (dataNascimento % 10000) - calendario.get(Calendar.YEAR);
        return idade*-1;
    }
}