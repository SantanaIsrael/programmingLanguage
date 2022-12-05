public class DataClient {
    public static void main(String[] args) {
        Data d = new Data(04, 12, 2022);
        System.out.println("Dias para o ano acabar (finalmente): " + Data.howManyDaysUntilEndYear(d));
        System.out.println("Dias para o ano acabar ate o primeiro dia do mes seguinte: " +
                Data.howManyDaysUtilNextMonth(d));
        System.out.println("O ano e bisexto: " + Data.isBisexto(d));
        System.out.println("Dia da semana: " + Data.dayOfWeek(d));
        System.out.println("Data por extenso: " + Data.dayPrintLong(d));
        System.out.println("Data em outro formato: " + Data.dayToPrintShort(d));
    }
}
