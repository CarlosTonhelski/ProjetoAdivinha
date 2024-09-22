import java.util.Scanner;
import java.util.Random;

public class ProjetoAdivinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroDefinido = random.nextInt(100) + 1;
        int tentativas = 10;
        boolean acertou = false;

        System.out.println("Tente adivinhar o número entre 1 e 100.");
        System.out.println("Você tem " + tentativas + " tentativas.");

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": ");
            int palpite = scanner.nextInt();

            if (palpite == numeroDefinido) {
                acertou = true;
                // Queria colocar esses emojis no código 😂👍👌😎
                System.out.println("BOOOOAAAAA!!! Você adivinhou o número em " + i + " tentativas!!!! LENDA");
                break;
            } else if (palpite > numeroDefinido) {
                System.out.println("O número é menor que " + palpite);
            } else {
                System.out.println("O número é maior que " + palpite);
            }
        }

        if (!acertou) {
            System.out.println("HAHAHAHAHAHHAHA SUAS TENTATIVAS ESGOTARAM.");
            System.out.println("O número correto era: " + numeroDefinido);
        }

        scanner.close();
    }
}