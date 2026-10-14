package Modul03.soal2;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahNegara = Integer.parseInt(scanner.nextLine());

        LinkedList<Negara> daftarNegara = new LinkedList<>();

        HashMap<Integer, String> mapBulan = new HashMap<>();
        mapBulan.put(1, "Januari");
        mapBulan.put(2, "Februari");
        mapBulan.put(3, "Maret");
        mapBulan.put(4, "April");
        mapBulan.put(5, "Mei");
        mapBulan.put(6, "Juni");
        mapBulan.put(7, "Juli");
        mapBulan.put(8, "Agustus");
        mapBulan.put(9, "September");
        mapBulan.put(10, "Oktober");
        mapBulan.put(11, "November");
        mapBulan.put(12, "Desember");

        for (int i = 0; i < jumlahNegara; i++) {
            String nama = scanner.nextLine();
            String jenisKepemimpinan = scanner.nextLine();
            String namaPemimpin = scanner.nextLine();

            if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin);
                daftarNegara.add(negara);
            } else {
                int tanggal = Integer.parseInt(scanner.nextLine());
                int bulan = Integer.parseInt(scanner.nextLine());
                int tahun = Integer.parseInt(scanner.nextLine());
                Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggal, bulan, tahun);
                daftarNegara.add(negara);
            }
        }

        for (Negara n : daftarNegara) {
            String sebutanPemimpin = "";
            if (n.getJenisKepemimpinan().equalsIgnoreCase("monarki")) {
                sebutanPemimpin = "Raja";
            } else if (n.getJenisKepemimpinan().equalsIgnoreCase("presiden")) {
                sebutanPemimpin = "Presiden";
            } else if (n.getJenisKepemimpinan().equalsIgnoreCase("perdana menteri")) {
                sebutanPemimpin = "Perdana Menteri";
            } else {
                sebutanPemimpin = n.getJenisKepemimpinan();
            }

            System.out.println("Negara " + n.getNama() + " mempunyai " + sebutanPemimpin + " bernama " + n.getNamaPemimpin());

            if (!n.isMonarki()) {
                String namaBulan = mapBulan.get(n.getBulanKemerdekaan());
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + n.getTanggalKemerdekaan() + " " + namaBulan + " " + n.getTahunKemerdekaan());
            }
        }
        scanner.close();
    }

}