package Modul02.PRAK201_2510817120001_NasywaArdeliaPutri;

public class Buah {
        private String nama;
        private double berat;
        private double harga;
        private double jumlahBeli;

        public Buah(String nama, double berat, double harga, double jumlahBeli) {
            this.nama = nama;
            this.berat = berat;
            this.harga = harga;
            this.jumlahBeli = jumlahBeli;
        }

        public void tampilkanInfo() {
            System.out.println("Nama Buah: " + nama);
            System.out.println("Berat: " + berat);
            System.out.println("Harga: " + harga);
            System.out.println("Jumlah Beli: " + jumlahBeli + "kg");

            double hargaSebelumDiskon = (jumlahBeli / berat) * harga;

            double hargaPer4Kg = (4.0 / berat) * harga;

            double diskonPer4Kg = hargaPer4Kg * 0.02;

            double totalDiskon = 0;

            int kelipatanDiskon = (int) (jumlahBeli / 4);
            for (int i = 0; i < kelipatanDiskon; i++) {
                totalDiskon += diskonPer4Kg;
            }

            double hargaSetelahDiskon = hargaSebelumDiskon - totalDiskon;

            System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", hargaSebelumDiskon);
            System.out.printf("Total Diskon: Rp%.2f\n", totalDiskon);
            System.out.printf("Harga Setelah Diskon: Rp%.2f\n\n", hargaSetelahDiskon);
        }
    }