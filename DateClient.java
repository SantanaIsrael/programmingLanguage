import java.util.Scanner;

public class DateClient {
    public static void main(String[] args) {
        Date data = new Date();
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma data no formato DD/M/AAAA: ");
        data.setDia(teclado.nextInt());
        data.setMes(teclado.nextInt());
        data.setAno(teclado.nextInt());

        data.infoDate();
        data.infoDateExt();
        teclado.close();
    }
}