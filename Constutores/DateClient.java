import java.util.Scanner;

public class DateClient {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite uma data no formato DD/M/AAAA: ");
        Date data = new Date(teclado.nextInt(),teclado.nextInt(),teclado.nextInt());
        
        data.infoDate();
        data.infoDateExt();
        data.dayOfWeek();
        

        System.out.println("Digite outra data para comparacao: ");
        Date data2 = new Date(teclado.nextInt(),teclado.nextInt(),teclado.nextInt());
        System.out.println("Faltam: " + data.howManyDays(data2));
        teclado.close();
    }
}