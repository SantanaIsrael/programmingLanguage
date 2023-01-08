package Heranca;

import base.Data;
import base.Livro;

public class LivroBiblioteca extends Livro {
    private Data dataDevolucao;
    private static boolean emprestado;

    public LivroBiblioteca(String tituoString, String autoString, int anoPubInt, int nPaginasInt, Data dataDevolucao,
            boolean emprestado) {
        super(tituoString, autoString, anoPubInt, nPaginasInt);
        this.dataDevolucao = dataDevolucao;
    }

    private boolean isAvaliable(){
        if(emprestado) return false;
        return true;
    }

    public boolean borrow(){
        if(isAvaliable()){
            emprestado = true;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Data de devolucao: " + dataDevolucao.dayPrintLong() + "\n" +
        "Emprestado: " + emprestado;
    }
}
