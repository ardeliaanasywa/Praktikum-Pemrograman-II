package Modul01;
import java.util.Scanner;
import java.util.InputMismatchException;

public class PRAK101_2510817120001_NasywaArdeliaPutri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.print("Masukkan Nama Lengkap: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = sc.nextLine();

        int tanggal = 0, bulan = 0, tahun = 0;
        double tinggi = 0, berat = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.print("Masukkan Tanggal Lahir: ");
                tanggal = sc.nextInt();
                System.out.print("Masukkan Bulan Lahir: ");
                bulan = sc.nextInt();
                System.out.print("Masukkan Tahun Lahir: ");
                tahun = sc.nextInt();
                System.out.print("Masukkan Tinggi Badan: ");
                tinggi = sc.nextDouble();
                System.out.print("Masukkan Berat Badan: ");
                berat = sc.nextDouble();

                if(cekTanggalValid(tanggal, bulan, tahun)) {
                    isValid = true;
                } else {
                    System.out.println("(!) Error: Tanggal/Bulan tidak valid pada kalender. Silakan ulangi.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("(!) Error: Tipe data salah! Harap masukkan angka yang benar.\n");
                sc.nextLine();
            }
        }

        String[] daftarBulan = {"", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.println("\nOutput:");
        System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggal + " " + daftarBulan[bulan] + " " + tahun);
        System.out.printf("Tinggi Badan %d cm dan Berat Badan %.2f kilogram\n", (int)tinggi, berat);

        sc.close();
    }

    public static boolean cekTanggalValid(int tgl, int bln, int thn) {
        if (bln < 1 || bln > 12 || tgl < 1) return false;

        int[] batasHari = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((thn % 400 == 0) || (thn % 4 == 0 && thn % 100 != 0)) {
            batasHari[2] = 29;
        }

        return tgl <= batasHari[bln];
    }
}