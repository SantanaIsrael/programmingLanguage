package Associação;

import base.Data;
import base.Time;

public class DataHora {
    protected Data data;
    protected Time hora;

    public DataHora (Data data, Time hora){
        this.data = data;
        this.hora = hora;
    }

    //get e set
    public Data getData() {
        return data;
    }
    public Time getHora() {
        return hora;
    }

    public void setData(Data data) {
        this.data = data;
    }
    public void setHora(Time hora) {
        this.hora = hora;
    }

    public boolean equals(DataHora obj) {
        if (data.equals(obj.data))
            if (hora.equals(obj.hora))
                return true;
        return false;
    }

    public boolean isGreather(DataHora obj) {
        if (obj.data.getDia() > data.getDia())
            return true;
        else if (obj.data.getMes() > data.getMes())
            return true;
        else if (obj.hora.getHours() > hora.getHours())
            return true;
        else if (obj.hora.getMin() > hora.getMin())
            return true;
        return false;
    }

    public boolean isLower(DataHora obj) {
        if (obj.data.getDia() < data.getDia())
            return true;
        else if (obj.data.getMes() < data.getMes())
            return true;
        else if (obj.hora.getHours() < hora.getHours())
            return true;
        else if (obj.hora.getMin() < hora.getMin())
            return true;
        return false;
    }
        // Impressão
        public String toString() {
            return "Hoje e: " + data.dayToPrintShort() + " e sao: " + hora.toString();
        }
}
