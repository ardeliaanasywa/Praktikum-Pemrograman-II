package Modul01;
import java.util.Scanner;

public class PRAK103_2510817120001_NasywaArdeliaPutri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalN = sc.nextInt();
        int angkaSekarang = sc.nextInt();

        int angkaTercetak = 0;

        do {
            if (angkaSekarang % 2 != 0) {
                System.out.print(angkaSekarang);
                angkaTercetak++;

                if (angkaTercetak < totalN) {
                    System.out.print(", ");
                }
            }
            angkaSekarang++;
        } while (angkaTercetak < totalN);

        sc.close();
    }
}