package Composição;

public class DataHoraClient {
    public static void main(String[] args) {
        
        /*Data dia = new Data(06, 12, 2022);
        Time hora = new Time(20, 23, 32);*/

        DataHora dia3 = new DataHora(06, 12,2022, 20,23, 32);
        DataHora dia4 = new DataHora(07, 12,2022, 20,23, 32);
        DataHora dia5 = new DataHora(06, 12,2022, 20,23, 32);

        System.out.println("VERIFICANDO IGUALDADE");
        System.out.println("Sao iguais? " + dia3.equals(dia3));
        System.out.println("Sao iguais? " + dia3.equals(dia4) + "\n");
        System.out.println("MEDINDO");
        System.out.println("E maior? " + dia3.isGreather(dia4));
        System.out.println("E menor? " + dia3.isLower(dia5));
    }
}
