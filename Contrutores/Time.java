public class Time {
    private int hours, min;

    public Time(int hours, int min) {
        if (hours > 0) {
            this.hours = hours;
            this.min = min;
        } else
            initialize();
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
}
