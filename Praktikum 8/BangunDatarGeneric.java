/**
* File		    : BangunDatarGeneric.java 23-05-2023
* Nama / NIM	: Fikri Prasetya Nurhidayat / 24060121140153
* Deskripsi     : kelas konstruksi generic untuk BangunDatar
**/

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}

/*
Pertanyaan:
Cobalah pada saat praktikum : Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti
dengan karakter yang lain seperti, T1,T2,T1234. Simpulkan apa yang anda lakukan !

Jawaban:
Ketika mengganti 'T' dengan karakter lain seperti 'T1', 'T2', atau 'T1234', 
kode tersebut masih akan berfungsi dengan baik 
selama karakter tersebut masih memenuhi syarat generic parameter.

Dalam bahasa pemrograman Java, penamaan generic parameter tidak terbatas pada huruf 'T'. 
kita dapat menggunakan karakter apa pun yang diinginkan, 
asalkan karakter tersebut valid dalam penamaan variabel Java.

Namun, penting untuk menjaga konsistensi dan konvensi dalam penamaan generic parameter 
untuk memudahkan pemahaman dan pembacaan kode oleh pengembang lain. 
Biasanya, konvensi yang umum digunakan adalah menggunakan huruf tunggal 'T' sebagai generic parameter standar.

*/