import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int voto;
        int totalVotos = 0;

        System.out.println("Sistema de votación");
        System.out.println("Ingrese el número del candidato (1, 2, 3).");
        System.out.println("Ingrese 0 para terminar.");

        do {
            System.out.print("Voto: ");
            voto = sc.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    totalVotos++;
                    break;
                case 2:
                    candidato2++;
                    totalVotos++;
                    break;
                case 3:
                    candidato3++;
                    totalVotos++;
                    break;
                case 0:
                    System.out.println("Votación finalizada.");
                    break;
                default:
                    System.out.println("Voto inválido.");
            }

        } while (voto != 0);

        if (totalVotos > 0) {
            System.out.println("\nResultados:");
            System.out.println("Total de votos: " + totalVotos);

            System.out.println("Candidato 1: " + candidato1 + " votos - " +
                    (candidato1 * 100.0 / totalVotos) + "%");

            System.out.println("Candidato 2: " + candidato2 + " votos - " +
                    (candidato2 * 100.0 / totalVotos) + "%");

            System.out.println("Candidato 3: " + candidato3 + " votos - " +
                    (candidato3 * 100.0 / totalVotos) + "%");
        } else {
            System.out.println("No hubo votos.");
        }

        sc.close();
    }
}
