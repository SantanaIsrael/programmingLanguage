public class DataHoraClient {
    public static void main(String[] args) {
        
        Data dia1 = new Data(06, 12, 2022);
        Time hora1 = new Time(01, 24);
        Time hora2 = new Time(01, 23);
        DataHora objeto1 = new DataHora(dia1, hora1);
        DataHora objeto2 = new DataHora(dia1, hora2);

        System.out.println(objeto1);
        System.out.println(objeto2);
        System.out.println(objeto1.equals(objeto2));
    }
}
