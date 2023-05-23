/**
* File		    : Lingkaran.java 23-05-2023
* Nama / NIM	: Fikri Prasetya Nurhidayat / 24060121140153
* Deskripsi     : implementasi Lingkaran sebagai BangunDatar
**/

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }
    public double hitungKeliling() {
        return 2*jejari*3.14;
    }
}