import Heranca.LivroLivraria;
import base.Data;

public class main {
    public static void main (String[] args){
        Data data = new Data(8, 01, 2023);
        LivroLivraria livro = new LivroLivraria("Bras Cubas", "Caetano",1998, 300,data,false, 0);
        System.out.println(livro);
        /*livro.borrow();
        System.out.println(livro);*/
        livro.sell();
    }
}
