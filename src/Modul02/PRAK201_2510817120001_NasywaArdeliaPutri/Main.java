package Modul02.PRAK201_2510817120001_NasywaArdeliaPutri;

public class Main {
    public static void main(String[] args) {
        Buah apel = new Buah("Apel", 0.4, 7000.0, 40.0);
        apel.tampilkanInfo();

        Buah mangga = new Buah("mangga", 0.2, 3500.0, 15.0);
        mangga.tampilkanInfo();

        Buah alpukat = new Buah("alpukat", 0.25, 10000.0, 12.0);
        alpukat.tampilkanInfo();
    }
}