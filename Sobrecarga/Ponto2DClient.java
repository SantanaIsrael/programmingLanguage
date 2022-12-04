public class Ponto2DClient {
    public static void main(String[] args) {
        Ponto2D[] ponto = new Ponto2D[2];
        ponto[0] = new Ponto2D(10.3f,6);
        ponto[1] = new Ponto2D(5, 10);

        System.out.println("Distancia entre pontos do objeto e parametro: " 
            + ponto[0].distancia(ponto[1]));
        System.out.println("Distancia entre dois pontos (x,y) passados por parametro: " 
            + ponto[0].distancia(5, 6));
        System.out.println("Distancia entre os pontos do objeto: " + ponto[1].distancia());
        
    }
}
