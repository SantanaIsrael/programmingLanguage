package base.Agregação;
import base.Data;
import base.Time;

public class DataHora {

    private Data date;
    private Time time;

    public DataHora(Data data, Time time) {
        this.date = data;
        this.time = time;
    }

    public Data getDateData() {
        return date;
    }

    public Time getHoraTime() {
        return time;
    }

    // Impressão
    public String toString() {
        return "Hoje e: " + date.dayToPrintShort() + ", e sao: " + time.toString();
    }

    public boolean equals(DataHora obj) {
        if (date.equals(obj.date))
            if (time.equals(obj.time))
                return true;
        return false;
    }

    public boolean isGreather(DataHora obj) {
        if (obj.date.getDia() > date.getDia())
            return true;
        else if (obj.date.getMes() > date.getMes())
            return true;
        else if (obj.time.getHours() > time.getHours())
            return true;
        else if (obj.time.getMin() > time.getMin())
            return true;
        return false;
    }

    public boolean isLower(DataHora obj) {
        if (obj.date.getDia() < date.getDia())
            return true;
        else if (obj.date.getMes() < date.getMes())
            return true;
        else if (obj.time.getHours() < time.getHours())
            return true;
        else if (obj.time.getMin() < time.getMin())
            return true;
        return false;
    }
}