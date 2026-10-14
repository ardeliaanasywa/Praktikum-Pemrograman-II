package Modul03.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahDadu = scanner.nextInt();

        LinkedList<Dadu> daftarDadu = new LinkedList<>();
        int totalNilai = 0;

        for (int i = 1; i <= jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            dadu.acakNilai();
            daftarDadu.add(dadu);
            totalNilai += dadu.getNilai();
            System.out.println("Dadu ke-" + i + " bernilai " + dadu.getNilai());
        }

        System.out.println("Total nilai dadu keseluruhan " + totalNilai);
        scanner.close();
    }
}