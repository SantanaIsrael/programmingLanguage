package base;

public abstract class Livro {
    private String tituloString, autorString;
    private int nPaginasInt, anoPubInt;

    // Getter
    public int getAnoPubInt() {
        return anoPubInt;
    }

    public String getAutorString() {
        return autorString;
    }

    public String getTituloString() {
        return tituloString;
    }

    public int getnPaginasInt() {
        return nPaginasInt;
    }

    // Setter
    public void setAnoPubInt(int anoPubInt) {
        this.anoPubInt = anoPubInt;
    }

    public void setAutorString(String autorString) {
        this.autorString = autorString;
    }

    public void setTituloString(String tituloString) {
        this.tituloString = tituloString;
    }

    public void setnPaginasInt(int nPaginasInt) {
        this.nPaginasInt = nPaginasInt;
    }

    public Livro(String tituoString, String autoString, int anoPubInt, int nPaginasInt) {
        this.tituloString = tituoString;
        this.autorString = autoString;
        this.anoPubInt = anoPubInt;
        this.nPaginasInt = nPaginasInt;
    }

    public String toString(){
        return "Titulo livro: " + tituloString + "\n" + 
        "Autor: " + autorString + "\n" + "Ano de publicacao: " + anoPubInt + "\n" + 
        "Numero de pagina: " + nPaginasInt;
    }

    protected boolean isOlder(){
        if(anoPubInt < 1900) return true;
        return false;
    } 
}