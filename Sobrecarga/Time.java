public class Time {
    private int hours, min, seg;

    public Time(int hours, int min, int seg) {
        if (isValid()) {
            this.hours = hours;
            this.min = min;
            this.seg = seg;
        } else
            inicitialize();
    }

    public Time(int hours, int min) {
        if (isValid()) {
            this.hours = hours;
            this.min = min;
            seg = 00;
        } else
            inicitialize();
    }

    public Time(int hours) {
        if (isValid()) {
            this.hours = hours;
            min = 00;
        }else
            inicitialize();
    }

    private void inicitialize() {
        hours = min = seg = 0;
    }

    // Getter
    public int getHours() {
        return hours;
    }

    public int getMin() {
        return min;
    }

    // Verificções
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
        if (seg <= 60 || seg >= 0) {
            return true;
        } else
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
        int hora, minuto, seg;

        seg = segundos % 60;
        minuto = segundos / 60;
        hora = minuto / 60;

        if (seg > 60) {
            seg %= 60;
            minuto += seg / 60;
            if (minuto > 60) {
                minuto %= 60;
                hora += minuto / 60;
                if (hora > 23) {
                    hora = hora - 23;
                }
            }
        }
        System.out.println(hora + ":" + minuto + ":" + seg);
    }
}
