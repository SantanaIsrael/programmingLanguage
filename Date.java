public class Date {
    private int day, month, year;
    private String[] week = { "Sabado", "Domingo", "Segunda", "Terca", "Quarta", "Quinta",
            "Sexta" };
    private String[] mesExtenso = { "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };

    public void initializeDate() {
        day = 1;
        month = 01;
        year = 2022;
    }

    // Construtor da classe
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
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

    public boolean isPrevious(Date otherDate) {
        int year = otherDate.year, month = otherDate.month;
        if (year < this.year) {
            return true;
        } else if (month < this.month) {
            return true;
        } else if (day < this.day) {
            return true;
        } else
            return false;
    }

    public float howManyDays(Date otherDate) {
        float result;
        if (isPrevious(otherDate)) {
            result = this.day - otherDate.day;
            return result;
        } else
            result = otherDate.day - this.day;
        return result;
    }

    public String dayOfWeek() {
        if (chekdate()) {
            int result = day + 2 * month + (3 * (month + 1) / 5) + year + year / 4 - year / 100 + year / 400 + 2;
            return week[result % 7];
        } else
            return "Erro";
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
            System.out.println(day + " de " + mesExtenso[month - 1] + " de " + year);
        } else {
            System.out.println("Data Invalida.");
        }
    }
}