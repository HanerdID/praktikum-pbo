/**
* File		    : Manajer.java 09-05-2023
* Nama / NIM	: Fikri Prasetya Nurhidayat / 24060121140153
* Deskripsi     : Manajer.java adalah sub kelas dari pegawai yang berisi Atribut dan Metode untuk Manajer
**/

public class Manajer extends Pegawai {
    private int tunjangan = 700000;
    public Manajer(String nama){
        super(nama);
    }
    public void tampilData(){
        System.out.println("Nama: " + this.nama + ", Gaji Pokok: " + this.gajiPokok + ", Tunjangan: " + this.tunjangan);
    }
}