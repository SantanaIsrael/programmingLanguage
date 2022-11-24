public class TimeClient {
    public static void main(String[] args) {
        Time hora = new Time(19, 06);
        Time horaTwo = new Time(20, 35);

        System.out.println("Ja se passaram " + hora.cron(horaTwo) + " segundos");
    }
}
