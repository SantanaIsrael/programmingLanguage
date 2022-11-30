public class Time {
    private int hours, min, seg;

    // Construtores
    public Time(int hours, int min, int seg) {
        this.hours = hours;
        this.min = min;
        this.seg = seg;
    }

    public Time(int hours, int min) {
        this.hours = hours;
        this.min = min;
        seg = 00;
    }

    public Time(int hours) {
        this.hours = hours;
        min = 00;
        seg = 00;
    }

    public Time() {
        hours = 00;
        min = 00;
        seg = 00;
    }

    // Getter
    public int getHours() {
        return hours;
    }

    public int getMin() {
        return min;
    }

    private int getSeg() {
        return seg;
    }

    // Verificções
    private boolean isAM() {
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

    public void addTime(int segundos) {
        /*
         * tenho que dividi o segundos por sessenta, o resto da divisão é o minutos.
         * Se esse minuto for maior que sessenta então eu divido por sessenta de novo o
         * cociente agora é a hora e o resto o minuto.
         */
        int seg, min;
        seg = segundos/60;
        min = segundos%60;
    }
}
