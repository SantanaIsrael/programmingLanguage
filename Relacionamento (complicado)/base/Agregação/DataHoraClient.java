package base.Agregação;
import base.Data;
import base.Time;

public class DataHoraClient {
    public static void main(String[] args) {
        
        Data data = new Data(06, 12, 2022);
        Data data2 = new Data(07, 12, 2022);
        Time hora = new Time(20, 23, 32);

        DataHora dia = new DataHora(data, hora);
        DataHora dia2 = new DataHora(data2, hora);
        DataHora dia3 = new DataHora(data2, hora);

        System.out.println("VERIFICANDO IGUALDADE");
        System.out.println("Sao iguais? " + dia.equals(dia2));
        System.out.println("Sao iguais? " + dia.equals(dia3) + "\n");
        System.out.println("MEDINDO");
        System.out.println("E maior? " + dia2.isGreather(dia));
        System.out.println("E menor? " + dia3.isLower(dia));
    }
}
