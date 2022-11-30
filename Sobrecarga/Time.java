public class Time {
    private int hours, min, sec;
   
    //Construtores
    public Time(int hours, int min, int seg) {
        if (isValid()) {
            this.hours = hours;
            this.min = min;
            this.sec = seg;
        } else
            inicitialize();
    }

    public Time(int hours, int min) {
        if (isValid()) {
            this.hours = hours;
            this.min = min;
            sec = 00;
        } else
            inicitialize();
    }

    public Time(int hours) {
        if (isValid()) {
            this.hours = hours;
            min = 00;
        } else
            inicitialize();
    }

    public Time (){
        inicitialize();
    }

    // Getter
    public int getHours() {
        return hours;
    }

    public int getMin() {
        return min;
    }

    public int getSeg(){
        return sec;
    }

    //Inicializador
    private void inicitialize() {
        hours = min = sec = 0;
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
        if (min <= 60 || min >= 0) {
            return true;
        }
        if (sec <= 60 || sec >= 0) {
            return true;
        } else
            return false;
    }

    //Adições e comparações
    public int cron(Time otherHours) {
        int aux;

        if (otherHours.hours < hours) {
            aux = (24 - (hours - otherHours.hours)) * 3600;
            if (min < otherHours.min) {
                aux = aux + ((1440 - ((min - otherHours.min) * -1)) * 60);
            } else
                aux += ((min - otherHours.min) - 1440) * 60;
            return aux;
        } else
            aux = (otherHours.hours - hours) * 3600;
        return aux += ((otherHours.hours - hours) * 60);
    }

    public void addTime(int segundos) {

        sec += segundos % 60;
        min += segundos/60;
        hours += min/60;

        if (sec > 60 || min >= 60) {
            sec %= 60;
            min += sec/60;
            
            if (min >= 60) {
                min %= 60;
                hours += min / 60;
                if (hours > 23) {
                    hours = hours - 23;
                }
            }
        }
    }

    //Impressão

    public String toString(){
        return hours + ":" + min + ":" + sec;
    }
}