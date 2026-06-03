import java.util.Arrays;
import java.util.Scanner;

public class ResgatedeDados {
    void main() {
        Scanner sc = new Scanner(System.in);
        int[] temperaturas = new int[10];

        for (int i = 0; i < 10; i++) {
            temperaturas[i] = sc.nextInt();
        }
        Arrays.sort(temperaturas);
        IO.println("Maior temperatura " + temperaturas[9]);
        IO.println("Menor temperatura " + temperaturas[0]);
        int soma = 0;
        int divisao = 0;
        for (int i = 0; i < 10; i++) {
            soma += temperaturas[i];
            divisao = soma / 10;
        }
        IO.println("A soma total dos numeros sao " + soma);
        IO.println("Media do calculo é " + divisao);

        IO.println("os numeros que sao menores que a media de temperatura são");
        for (int i = 0; i < divisao; i++) {
            IO.println(i);
        }


        while (true) {

            IO.println("agora escolha um numero que esteja na tabela de temperaturas ou digite -1 para encerrar o codigo");
            int resposta = sc.nextInt();
            int loop = 0;
            for (int i = 0; i < 10; i++) {
                if (resposta == temperaturas[i]) {
                    loop = temperaturas[i];
                }
            }
            if (resposta == loop) {
                IO.println("este numero esta na tabela");
            }else if (resposta !=loop) {
                IO.println("temperatura não indentificada, tente novamente");
            } else if (resposta == -1) {
                break;
            }
            if (resposta == -1) {
                break;}
        }
    }
}
