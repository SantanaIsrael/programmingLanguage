public class Time {
    private int hours, min, seg;

    public Time(int hours, int min) {
        if (hours > 0) {
            this.hours = hours;
            this.min = min;
        } else
            initialize();
    }

    public Time (int hours){
        if(hours > 0){
            this.hours = hours;
            min = 00;
        }
    }

    private void initialize() {
        hours = 0;
        min = 0;
    }

    // Getter
    public int getHours() {
        return hours;
    }

    public int getMin() {
        return min;
    }

    //Verificções
    public boolean isAM() {
        if (hours < 12) {
            return true;
        }
        return false;
    }
    
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

    public void addSeconds(int segundos) {

        seg += segundos % 60;
        min += segundos/60;
        hours += min/60;

        if (seg > 60 || min >= 60) {
            seg %= 60;
            min += seg/60;
            
            if (min >= 60) {
                min %= 60;
                hours += min / 60;
                if (hours > 23) {
                    hours = hours - 23;
                }
            }
        }
    }
}
