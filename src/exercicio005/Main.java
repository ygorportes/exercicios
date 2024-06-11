package exercicio005;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double R = scanner.nextDouble();

        double volume = (4.0 / 3) * 3.14159 * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

        scanner.close();



    }


}
