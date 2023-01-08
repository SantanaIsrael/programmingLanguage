package Heranca;
import base.Data;

public class LivroLivraria extends LivroBiblioteca{
    private int preco;
    private int estoque;

    public LivroLivraria (String tituoString, String autoString, int anoPubInt, int nPaginasInt, Data dataDevolucao,
    boolean emprestado, int preco){
        super(tituoString, autoString, anoPubInt, nPaginasInt, dataDevolucao, emprestado);
        this.estoque++;
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }
    public int getPreco(){
        return preco;
    }

    public void setPreco(int preco){
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void sell(){
        if(super.borrow()){
            System.out.println("Vendido.");
            estoque--;
        }else
        System.out.println("Livro nao pode ser vendido.");
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
