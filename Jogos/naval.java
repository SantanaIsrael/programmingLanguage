import java.util.Scanner;

public class naval {
    public static void main(String[] args) {
        // Declaração de variaveis
        int i, j, a, cord1, cord2;
        char[][] tabuleiro_jogador1 = new char[5][5], tabuleiro_jogador2 = new char[5][5], jogada1 = new char[5][5],
                jogada2 = new char[5][5];
        String jogador1, jogador2;
        Scanner dados_S = new Scanner(System.in);

        // Telas de boas vindas
        System.out.println("Ola, bem vindo a batalha naval.");
        System.out.print("Digite seu ID (Jogador 1): ");
        jogador1 = dados_S.next();

        // Tela de carregamento de tabuleiro ID_1
        imprimePrenche(tabuleiro_jogador1, jogada1);

        a = 0;
        do {
            System.out.print("Digite as cordenadas dos seus barcos (separadas por espaço): ");
            cord1 = dados_S.nextInt();
            cord2 = dados_S.nextInt();

            if ((cord1 <= 4 || cord2 >= 0) && (cord1 >= 0 || cord2 <= 4)) {

                if (Character.compare(tabuleiro_jogador1[cord1][cord2], '@') == 0) {
                    System.out.println("Cordenadas ja digitadas.");
                }
                tabuleiro_jogador1[cord1][cord2] = '@';
                a++;
                // Tabuleiro com as cordenadas digitadas
                System.out.println("  0 1 2 3 4");
                for (i = 0; i < 5; i++) {
                    System.out.print(i + " ");
                    for (j = 0; j < 5; j++) {
                        System.out.print(tabuleiro_jogador1[i][j] + " ");
                    }
                    System.out.println(" ");
                }
            } else // ELSE NÃO ESTÁ FUNCIONANDO
                System.out.print("Certo.");

        } while (a <= 4);

        System.out.print("Digite seu ID (Jogador 2): ");
        jogador2 = dados_S.next();

        System.out.print(" 0 1 2 3 4");
        for (i = 0; i <= 4; i++) {
            System.out.print(i + " ");
            for (j = 0; j <= 4; j++) {
                tabuleiro_jogador2[i][j] = '_';
                jogada2[i][j] = '_';
                System.out.print(tabuleiro_jogador2[i][j] + " ");
            }
            System.out.println(" ");
        }

        a = 0;
        do {
            System.out.print("Digite as cordenadas para atirar " + jogador1 + ":");
            cord1 = dados_S.nextInt();
            cord2 = dados_S.nextInt();

            if ((cord1 <= 4 || cord2 <= 4) && (cord2 >= 0 || cord1 >= 0)) {
                if (Character.compare(tabuleiro_jogador1[cord1][cord2], '@') == 0) {
                    jogada1[cord1][cord2] = 'X';
                    a++;
                } else if (Character.compare(tabuleiro_jogador1[cord1][cord2], 'X') == 0) {
                    System.out.println("Cordenadas ja digitadas.");
                } else {
                    jogada1[cord1][cord2] = 'O';
                }

                System.out.println("  0 1 2 3 4");
                for (i = 0; i < 5; i++) {
                    System.out.print(i + " ");
                    for (j = 0; j < 5; j++) {
                        System.out.print(jogada1[i][j] + " ");
                    }
                    System.out.println(" ");
                }
            } else {
                System.out.print("Digite uma cordenada valida por favor.");
            }

        } while (a <= 4);
        dados_S.close();
    }
    public static void imprimePrenche (char[][] tabuleiro, char[][]jogada){
        
        System.out.println(" 0 1 2 3 4");
        for(int i = 0; i <=4; i++){
            System.out.print(i + " ");
            for(int j = 0; j <=4; j++){
                tabuleiro[i][j] = '_';
                jogada[i][j] = '_';
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println(" ");
        }
    };
}