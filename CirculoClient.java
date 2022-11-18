public class CirculoClient {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5, 3, 3);
        Ponto2D ponto = new Ponto2D();
        ponto.setX(3);
        ponto.setY(8);
        System.out.println("Perimetro: " + circulo.printCircle());
        System.out.println("E interno: " + circulo.isInnerPoint(ponto));
    }
}
