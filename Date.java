public class Date {
    private int dia, mes, ano;

    public void initializeDate() {
        this.dia = 0;
        this.mes = 0;
        this.ano = 0;
    }

    // getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {

        return ano;
    }

    // setters
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // verificação
    public boolean checkDate() {
        if (dia > 0) {
            if (mes > 0) {
                if (ano > 0) {
                    return true;
                }
            }
        } else {
            return false;
        }
    }
}