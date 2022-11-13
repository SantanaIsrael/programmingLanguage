import java.util.Scanner;

public class Ponto2DClient {
    public static void main(String[] args) {
        Ponto2D ponto = new Ponto2D();
        Ponto2D ponto2 = new Ponto2D();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite as cordenadas do primeiro ponto: ");
        ponto.setX(teclado.nextFloat());
        System.out.println("Digite as cordenadas do primeiro ponto: ");
        ponto.setY(teclado.nextFloat());

        System.out.println("Digite as cordenadas do segundo ponto: ");
        ponto2.setX(teclado.nextFloat());
        System.out.println("Digite as cordenadas do segundo ponto: ");
        ponto2.setY(teclado.nextFloat());

        System.out.printf("A distancia entre os pontos e de: %.1f", ponto.distancia(ponto, ponto2));

        teclado.close();
    }
}