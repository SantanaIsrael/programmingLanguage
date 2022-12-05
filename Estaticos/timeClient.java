import java.util.Calendar;

public class timeClient {
    public static void main(String[] args) {

        Time h1 = new Time(15, 35, 37);
        Time h2 = new Time(12, 35, 37);
     
        Calendar c = Calendar.getInstance();
        System.out.println("Hora do computador: " + c.getTime());

        h1.addTime(2, 3, 3);
        System.out.println(h1);
    }
}
