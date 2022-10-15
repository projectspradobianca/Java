import java.util.Random;
import java.util.Scanner;


public class Reserva {
    public static void main(String[] args) {
        boolean[][] aviao = new boolean[28][6];

        Random random = new Random();

        for (int fileira = 0; fileira < 28 ; fileira++){
            for (int assento = 0; assento < 6 ; assento++){
                aviao[fileira][assento] = random.nextBoolean();
            }
        }

        int executando = 1;

        do {

            for (int fileira = 0; fileira < 28 ; fileira++){
                for (int assento = 0; assento < 6 ; assento++){
                System.out.print((aviao[fileira][assento] ? " | OCUPADO | " :" | LIVRE  | "));
                }

            System.out.println("\n");
            }

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a fileira desejada de 0 até 27: ");
        int fileira = sc.nextInt();

        System.out.println("Digite o assento desejado de 0 até 5: ");
        int assento = sc.nextInt();

        if (aviao[fileira][assento]){
            System.out.println("Este assento não está desponível, selecione outro: ");
        } else {
            System.out.println("Assento reservado com sucesso!");
        }

        System.out.println("Você deseja reservar mais um assento? (1- Sim / 2-Não)");
        executando = sc.nextInt();

        }while (executando == 1);







    }
}