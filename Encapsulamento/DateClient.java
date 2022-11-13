public class DateClient {
    public static void main(String[] args) {
        Date data = new Date();

        data.initializeDate();
        data.infoDate();

        data.setDay(13);
        data.setMonth(11);
        data.setYear(2022);

        data.infoDate();
        data.infoDateExt();
    }
}