public class Date {
    private int day, month, year;

    public void initializeDate() {
        day = 1;
        month = 01;
        year = 2022;
    }

    // setters
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // getters
    public int getDia() {
        return day;
    }

    public int getMes() {
        return month;
    }

    public int getAno() {

        return year;
    }

    // verificação
    private boolean chekdate() {
        if ((day > 0 || day < 31) && (month > 0 || month < 13) && (year > 0)) {
            return true;
        } else
            return false;
    }

    // Impressão data
    public void infoDate() {
        if (chekdate()) {
            System.out.println(day + "/" + month + "/" + year);
        } else
            System.out.println("Data invalida.");
    }

    public void infoDateExt() {
        if (chekdate()) {
            String[] mesExtenso = { "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho",
                    "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };
            System.out.println(day + " de " + mesExtenso[month - 1] + " de " + year);
        } else {
            System.out.println("Data Invalida.");
        }
    }
}