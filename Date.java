import javax.lang.model.util.ElementScanner14;

public class Date{
    private int dia, mes, ano;

    public void initializeDate() {
        dia = 0;
        mes = 0;
        ano = 0;
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
    private boolean chekdate (){
        if ((dia > 0) && (mes > 0) && (ano > 0)){
            return true;
        }else
            return false;
    }
    //Impressão data
    public void printDate (){
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public void printDateExt (){
        System.out.println("");
    }
}