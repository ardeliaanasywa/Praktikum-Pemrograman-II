package Modul02.PRAK203_2510817120001_NasywaArdeliaPutri;

// Pada baris ini terjadi error karena nama class "Employee" tidak sama dengan nama file "Pegawai.java".
// public class Employee {
public class Pegawai {
    public String nama;

    // Pada baris ini terjadi error karena variabel "asal" bertipe data char yang hanya bisa menampung 1 karakter.
    // Sedangkan di main class, nilainya diisi String ("Kingdom of Orvel"). Sehingga harus diubah menjadi String.
    // public char asal;
    public String asal;

    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // Pada baris ini terjadi error karena method ini tidak memiliki parameter yang dibutuhkan untuk menampung argumen,
    // padahal di main class dipanggil p1.setJabatan("Assasin"); yang membutuhkan parameter String.
    // public void setJabatan() {
    //     this.jabatan = j;
    // }
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}