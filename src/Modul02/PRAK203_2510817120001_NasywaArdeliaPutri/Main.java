package Modul02.PRAK203_2510817120001_NasywaArdeliaPutri;

public class Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        // Pada baris ini terjadi error (syntax error) karena kurangnya titik koma (;) di akhir statement.
        // p1.nama = "Roi"
        p1.nama = "Roi";

        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");

        // Output tidak sesuai dengan format yang diminta, karena output aslinya mencetak "Nama: Roi", bukan "Nama Pegawai: Roi".
        // System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());

        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);

        // Pada baris ini ditambahkan inisialisasi nilai umur p1 karena pada kode sebelumnya nilai p1.umur belum pernah diset,
        // sehingga jika langsung dicetak akan menghasilkan angka 0 (default integer).
        p1.umur = 17;

        // Pada baris ini ditambahkan kata " tahun" agar sesuai dengan output yang diminta pada soal yaitu "17 tahun".
        // System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}