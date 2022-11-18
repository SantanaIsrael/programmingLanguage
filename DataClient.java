import java.util.Scanner;
public class DataClient {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite uma data no formato DD/M/AAAA: ");
        DataConstrutor data = new DataConstrutor(teclado.nextInt(), teclado.nextInt(), teclado.nextInt());
        
        data.infoDate();
        data.infoDateExt();
        data.dayOfWeek();
        

        System.out.println("Digite outra data para comparacao: ");
        DataConstrutor data2 = new DataConstrutor(teclado.nextInt(), teclado.nextInt(), teclado.nextInt());
        System.out.println("Faltam: " + data2.howManyDays(data));//porque não ta indo?
        teclado.close();
    }
}