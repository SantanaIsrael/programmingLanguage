public class CirculoClient {
    public static void main(String[] args) {
        Ponto2DConstru ponto = new Ponto2DConstru(5.9, 3.9);
        Circulo circle = new Circulo(3.5, 5.9, 5.0);
        Circulo circle2 = new Circulo(3.0, 2.9, 4.08);

        if (circle.isInnerPoint(ponto)) {
            System.out.println("Circulo e interno ao ponto enviado");
        } else {
            System.out.println("Circulo e externo ao ponto enviado.");
        }

        circle.printCircle();

        if (circle.isBiggerThan(circle2)) {
            System.out.println("Circulo maior que o enviado.");
        } else {
            System.out.println("Circulo menor que o enviado.");
        }
    }
}