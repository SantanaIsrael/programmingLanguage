import java.util.Calendar;

public class Time {
    private int hours, minutes, seconds;

    // Construtores
    public Time(int hours, int min, int seg) {
        if (isValid()) {
            this.hours = hours;
            this.minutes = min;
            this.seconds = seg;
        } else
            inicitialize();
    }

    public Time(int hours, int min) {
        if (isValid()) {
            this.hours = hours;
            this.minutes = min;
            seconds = 00;
        } else
            inicitialize();
    }

    public Time(int hours) {
        if (isValid()) {
            this.hours = hours;
            minutes = 00;
        } else
            inicitialize();
    }

    public Time() {
        inicitialize();
    }

    public Time (Time hora){
        hours = hora.hours;
        minutes = hora.minutes;
        seconds = hora.seconds;
    }

    // Getter
    public int getHours() {
        return hours;
    }

    public int getMin() {
        return minutes;
    }

    public int getSeg() {
        return seconds;
    }

    // Inicializador
    private void inicitialize() {
        hours = minutes = seconds = 0;
    }

    // Verificações
    public boolean isAM() {
        if (hours < 12) {
            return true;
        }
        return false;
    }

    private boolean isValid() {
        if (hours >= 0 || hours <= 23) {
            return true;
        }
        if (minutes <= 60 || minutes >= 0) {
            return true;
        }
        if (seconds <= 60 || seconds >= 0) {
            return true;
        } else
            return false;
    }

    public static boolean isAm (Time t){
        if(t.hours < 12) return true;
        return false;
    }

    public static boolean isPM (Time t){
        if(t.hours > 12) return true;
        return false;
    }

    // Adições e comparações
    public int cron(Time otherHours) {
        int aux;

        if (otherHours.hours < hours) {
            aux = (24 - (hours - otherHours.hours)) * 3600;
            if (minutes < otherHours.minutes) {
                aux = aux + ((1440 - ((minutes - otherHours.minutes) * -1)) * 60);
            } else
                aux += ((minutes - otherHours.minutes) - 1440) * 60;
            return aux;
        } else
            aux = (otherHours.hours - hours) * 3600;
        return aux += ((otherHours.hours - hours) * 60);
    }

    public void addTime(int segundos) {

        seconds += segundos % 60;
        minutes += segundos / 60;
        hours += minutes / 60;

        while (seconds >= 60 || minutes >= 60) {
            seconds %= 60;
            minutes += seconds / 60;

            if (minutes >= 60) {
                minutes %= 60;
                hours += minutes / 60;
            }
        }
        if (hours > 23) {
            hours = hours - 23;
        }
    }

    public void addTime(int minutos, int segundos) {
        seconds += segundos % 60;
        minutes += (segundos / 60) + minutos;
        hours = hours + (minutes / 60);

        while (seconds > 60 || minutes >= 60) {
            seconds %= 60;
            minutes = minutes + (seconds / 60) + (minutos%60);

            if (minutes >= 60) {
                minutes %= 60;
                hours += minutes / 60;
            }
        }
        if (hours > 23) {
            hours -= 23;
        }
    }

    public void addTime(int hora, int minutos, int segundos) {
        seconds += segundos % 60;
        minutes += (segundos / 60) + minutos;
        hours += hora / 60;

        while (seconds > 60 || minutes >= 60) {
            seconds %= 60;
            minutes += (seconds / 60) + (minutos%60);

            if (minutes >= 60) {
                minutes %= 60;
                hours += minutes / 60;
            }
        }
        if (hours > 23) {
            hours = hours - 23;
        }
    }

    public static String diffTime(Time t1, Time t2){ 
        return "hora: " + (t1.hours - t2.hours) + "minuto: " + (t1.minutes - t2.minutes) 
                + "segundo(s): " + (t1.seconds - t2.seconds);
    }

    public static String diffTime(Time t){
        Calendar h = Calendar.getInstance();

        return (t.hours - h.get(Calendar.HOUR)) + " : " + (t.minutes - h.get(Calendar.MINUTE)) 
        + " : " + (t.seconds - h.get(Calendar.SECOND));
    }

    // Impressão
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}