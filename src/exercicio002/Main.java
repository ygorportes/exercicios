package exercicio002;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        double MEDIA = ((A * 3.5) + (B * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f%n", MEDIA);

        scanner.close();

    }

}
