package Modul03.soal1;

public class Dadu {
    private int nilai;

    public void acakNilai() {
        this.nilai = (int) (Math.random() * 6) + 1;
    }

    public int getNilai() {
        return nilai;
    }
}