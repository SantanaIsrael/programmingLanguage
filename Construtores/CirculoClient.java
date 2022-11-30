public class CirculoClient {
    public static void main(String[] args) {
        Ponto2D ponto = new Ponto2D();
        Circulo[] circulo = new Circulo[2];

        circulo[0] = new Circulo(4.98f);
        circulo[1] = new Circulo(5.52f);

        if (circulo[0].isInnerPoint(ponto)) {
            System.out.println("Circulo e interno ao ponto enviado");
        } else {
            System.out.println("Circulo e externo ao ponto enviado.");
        }

        System.out.println(circulo[0]);

        if (circulo[0].isBiggerThan(circulo[1])) {
            System.out.println("Circulo maior que o enviado.");
        } else {
            System.out.println("Circulo menor que o enviado.");
        }
    }
}