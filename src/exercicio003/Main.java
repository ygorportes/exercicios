package exercicio003;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome = scanner.next();
        double salario = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();

        double total = salario + (totalVendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", total );

        scanner.close();

    }

}
