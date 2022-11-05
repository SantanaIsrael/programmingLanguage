import java.util.Scanner;

public class DateClient {
    public static void main(String[] args) {
        int dia, mes, ano;
        Date data = new Date();
        Scanner teclado = new Scanner(System.in);
        System.out.println("As datas são: " + data.getDia() + data.getMes() + data.getAno());
        
        System.out.println("Qual a data (formato: DD/MM/AAA) ");
        dia = teclado.nextInt();
        mes = teclado.nextInt();
        ano = teclado.nextInt();
        data.setDia(dia);
        data.setMes(mes);
        data.setAno(ano);
        
        System.out.println("As datas são: " + data.getDia() + data.getMes() + data.getAno());

    }
}