/**
* File		    : Programmer.java 09-05-2023
* Nama / NIM	: Fikri Prasetya Nurhidayat / 24060121140153
* Deskripsi     : Programmer.java adalah sub kelas dari pegawai yang berisi Atribut dan Metode untuk Programmer
**/

public class Programmer extends Manajer {
    private int bonus = 450000;
    public Programmer(String nama){
        super(nama);
    }
    public void tampilData(){
        System.out.println("Nama: " + this.nama + ", Gaji Pokok: " + this.gajiPokok + ", Bonus: " + this.bonus);
    }
}