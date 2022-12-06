public class DataHora {

    private Data dateData;
    private Time horaTime;

    public DataHora(Data d, Time h) {
        this.dateData = d;
        this.horaTime = h;
    }

    public String toString() {
        return "Hoje e: " + dateData.dayToPrintShort() + ", e sao: " + horaTime.toString();
    }

    public boolean isEquals(DataHora otheDataHora) {
        // retonrar verdadeiros se os objetos forem iguais
        if (dateData.getDia() == otheDataHora.dateData.getDia()
                && dateData.getMes() == otheDataHora.dateData.getMes()) {
            if (horaTime.getHours() == otheDataHora.horaTime.getHours()
                    && horaTime.getMin() == otheDataHora.horaTime.getMin())
                return true;
        }
            return false;
    }
    // isGreather
    // isLower()
}