package Modul01;
import java.util.Scanner;

public class PRAK102_2510817120001_NasywaArdeliaPutri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiAwal = sc.nextInt();

        int jumlahOutput = 0;

        while (jumlahOutput < 10) {
            int nilaiCetak = (nilaiAwal % 5 == 0) ? (nilaiAwal / 5 - 1) : nilaiAwal;

            if (jumlahOutput == 9) {
                System.out.print(nilaiCetak);
            } else {
                System.out.print(nilaiCetak + ", ");
            }

            nilaiAwal++;
            jumlahOutput++;
        }
        sc.close();
    }
}