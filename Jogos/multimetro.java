import java.util.Scanner;

public class multimetro{
    public static void main(String[] args){
        Scanner dados_coleta =  new Scanner(System.in);

        double voltagem[] = new double[10];
        double sumV = 0, sumS = 0, media, desvio_Padrao;

        for(int i = 0; i < 10; i++){
            System.out.printf("Entre com a medicao %d ", i + 1);
            voltagem[i] = dados_coleta.nextDouble();
            sumV = sumV + voltagem[i];
        }

        media = sumV / 10;

        for(int i = 0; i < 10; i++){
            sumS = sumS + (voltagem[i] - media) * (voltagem[i] - media);
        }

        desvio_Padrao = Math.sqrt(sumS / 10);

        System.out.printf("\n\nA media e %f\n\n", media);
        System.out.printf("O desvio padrao e %f\n\n", desvio_Padrao);

        for(int i = 0 ; i < 10; i++){
            System.out.printf("Voltagem %d: %.2f\n", i + 1, voltagem[i]);
        }

        if(desvio_Padrao > (0.1 * media)){
            System.out.println("\nMultimetro com problema.");
        }else{
            System.out.println("\nMultimetetro operante.");
        }
        dados_coleta.close();
    }
}