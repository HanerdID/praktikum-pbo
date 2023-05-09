/**
* File		    : Pegawai.java 09-05-2023
* Nama / NIM	: Fikri Prasetya Nurhidayat / 24060121140153
* Deskripsi     : Pegawai.java adalah superkelas yang akan diturunkan ke kelas Manajer dan Pegawai
**/

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 500000;
    
    public Pegawai(String nama){
        this.nama = nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void tampilData(){
        System.out.println("Nama: " + this.nama + ", Gaji Pokok: " + this.gajiPokok);
    }
}