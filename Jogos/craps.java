import java.util.Random;

public class craps {
    public static void main(String[] args) {
        Random numeroAleatorio = new Random();
        int dado1, dado2, soma, i = 0;

        dado1 = numeroAleatorio.nextInt(6) + 1;
        dado2 = numeroAleatorio.nextInt(6) + 1;
        soma = dado1 + dado2;
        System.out.printf("Dado 1 = %d ", dado1);
        System.out.printf("Dado 2 = %d\n", dado2);

        // primeiro lançamento
        if (soma == 7 || soma == 11) {
            System.out.print("Voce venceu.");
        } else if (soma == 12 || soma == 3 || soma == 2) {
            System.out.printf("Ponto %d.", soma);
            System.out.print("Voce perdeu, sad!");
        } else if (soma == 4 || soma == 5 || soma == 6 || soma == 8 || soma == 9 || soma == 10) {
            System.out.printf("Ponto %d.\n", soma);

            System.out.print("Iniciando estagio dois:\n");

            do {
                dado1 = numeroAleatorio.nextInt(6) + 1;
                dado2 = numeroAleatorio.nextInt(6) + 1;
                soma = dado1 + dado2;

                System.out.printf("Dado 1 = %d ", dado1);
                System.out.printf("Dado 2 = %d\n", dado2);

                if (soma == 7) {
                    System.out.printf("Ponto %d.", soma);
                    System.out.print("Voce perdeu.");
                    break;
                }

                System.out.printf("Ponto %d.\n", soma);
                i++;
            } while (i < 4);
            
            if (i == 4)
            System.out.print("Voce ganhou, parabens!");
        }
    }
}