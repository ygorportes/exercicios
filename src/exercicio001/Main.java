package exercicio001;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double n = 3.14159;
        double raio = scanner.nextDouble();

        double area = (Math.pow(raio, 2)) * n;

        System.out.printf("A=%.4f%n", area);

        scanner.close();
    }
}
