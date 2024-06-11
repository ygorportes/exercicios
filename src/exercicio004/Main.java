package exercicio004;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int codigo1 = scanner.nextInt();
        int numeroDePecas1 = scanner.nextInt();
        double valorPeca1 = scanner.nextDouble();
        double totalPorPeca1 = numeroDePecas1 * valorPeca1;

        int codigo2 = scanner.nextInt();
        int numeroDePecas2 = scanner.nextInt();
        double valorPeca2 = scanner.nextDouble();
        double totalPorPeca2 = numeroDePecas2 * valorPeca2;

        double totalGeral = totalPorPeca1 + totalPorPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalGeral);

        scanner.close();

    }

}
