package Modul04.soal2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();

        System.out.print("Nama hewan peliharaan: ");
        String nama = input.nextLine();

        System.out.print("Ras: ");
        String ras = input.nextLine();

        System.out.print("Warna Bulu: ");
        String warnaBulu = input.nextLine();

        if (pilihan == 1) {
            Kucing kucing = new Kucing(nama, ras, warnaBulu);
            kucing.displayDetailKucing();
        } else if (pilihan == 2) {
            System.out.print("Kemampuan : ");
            String teksKemampuan = input.nextLine();
            String[] kemampuan = teksKemampuan.split("\\s*,\\s*");

            Anjing anjing = new Anjing(
                    nama, ras, warnaBulu, kemampuan
            );
            anjing.displayDetailAnjing();
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}