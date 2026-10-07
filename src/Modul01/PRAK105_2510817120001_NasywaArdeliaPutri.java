package Modul01;
import java.util.Scanner;
import java.util.Locale;

public class PRAK105_2510817120001_NasywaArdeliaPutri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        final double PHI = 3.14;

        System.out.print("Masukkan jari-jari: ");
        double r = sc.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double t = sc.nextDouble();

        double volume = PHI * (r * r) * t;

        System.out.printf(Locale.US, "Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3\n", r, t, volume);

        sc.close();
    }
}