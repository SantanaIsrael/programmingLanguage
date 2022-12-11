public class Data {
    private int day, month, year;
    static private String[] week = { "Sabado", "Domingo", "Segunda", "Terca", "Quarta", "Quinta",
            "Sexta" };
    static private String[] mesExtenso = { "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };

    // Construtores
    public Data(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Data (Data otherDate){
        this(otherDate.day, otherDate.month, otherDate.year);
    }

    public Data() {
        this(01,01,1970);
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

    //Métodos de validade
    private boolean chekdate() {
        if ((day > 0 || day < 31) && (month > 0 || month < 13) && (year > 0)) {
            return true;
        } else
            return false;
    }

    private static boolean chekdate(int day, int month, int year) {
        if ((day > 0 || day < 31) && (month > 0 || month < 13) && (year > 0)) {
            return true;
        } else
            return false;
    }

    public boolean isPrevious(Data date) {
        int year = date.getAno(), month = date.getMes();
        if (year < this.year) {
            return true;
        } else if (month < this.month) {
            return true;
        } else if (day < this.day) {
            return true;
        } else
            return false;
    }

    public boolean isPrevious(int day, int month, int year) {
        if (year < this.year) {
            return true;
        } else if (month < this.month) {
            return true;
        } else if (day < this.day) {
            return true;
        } else
            return false;
    }

    //Métodos de impressão data
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

    public String dayOfWeek() {
        if (chekdate()) {
            int result = day + 2 * month + (3 * (month + 1) / 5) + year + year / 4 - year / 100 + year / 400 + 2;
            return week[result % 7];
        } else
            return "Erro";
    }
    
    //Métodos de verificação de dias
    public int howManyDays(Data otherDate) {
        int result;
        if (isPrevious(otherDate)) {
            result = this.day - otherDate.getDia();
            return result;
        } else
            result = otherDate.getDia() - this.day;
        return result;
    }

    public int howManyDays(int day, int month, int year) {
        int aux = 0;
        if (chekdate(day, month, year)) {
            if (isPrevious(day, month, year)) {
                aux = Math.abs(this.month - month) + Math.abs(this.day - day);
                if (this.year - year != -1) {
                    aux += Math.abs(this.year - year) * 365;
                }
            }
            aux = Math.abs(this.day - day) + (Math.abs(this.month - month) * 30);
            if (this.year - year != -1) {
                aux += Math.abs(this.year - year) * 365;
            }
        }
        return aux;
    }

    public static int howManyDaysUntilEndYear(Data d){
        //retornar a quantidade de dias desde a data d até o final do ano d
        int soma;
        soma = d.day - 30;
        return (soma += 30 * (d.month - 12))*-1;
    }

    public static int howManyDaysUtilNextMonth(Data d){
        //retorna a quantidade de dias desde a data d ao dia primeiro do mes seguinte
        //como saber a quantidade de dias que falta desde a data que eu tenho até o primeiro dia do mes seguinte?
        return (d.day - 30)*-1 + 1;
    }

    public static boolean isBisexto(Data d){
    //retorna verdadeiro se ano é bisexto
    /*1.Se o ano for uniformemente divisível por 4, vá para a etapa 2. Caso contrário, vá para a etapa 5.
    2.Se o ano for uniformemente divisível por 100, vá para a etapa 3. Caso contrário, vá para a etapa 4.
    3.Se o ano for uniformemente divisível por 400, vá para a etapa 4. Caso contrário, vá para a etapa 5.
    4.O ano é bissexto (tem 366 dias).
    5.O ano não é um ano bissexto (tem 365 dias). */
    if(d.year%4 == 0){
        if(d.year%100 == 0)
            if(d.year%400 == 0)
                return true;
    }
    if(d.year%100 == 0)
        if(d.year%400 == 0)
            return true;

    if(d.year%400 == 0) return true;
    return false;
    }

    public static String dayOfWeek(Data d){
        //retorna de dia da semana pela data passada por parametro
        if(chekdate(d.day, d.month, d.year)){
        int result = d.day + 2 * d.month + (3 * (d.month + 1) / 5) + d.year + d.year / 4 - d.year / 100 + d.year / 400 + 2;
        return week[result % 7];
        }
        return "Data invalida";
    }

    public static String dayToPrintShort(Data d){
        //retornar a data no formato dd/mm/aaaa
        return d.day + "/" + d.month + "/" + d.year;
    }

    public static String dayPrintLong(Data d){
        //retorna a data por extenso
        if(chekdate(d.day, d.month, d.year)){
            return d.day +  " de " + mesExtenso[d.month-1] + " de " + d.year;
        }
        return "Erro: data invalida";
    }
}