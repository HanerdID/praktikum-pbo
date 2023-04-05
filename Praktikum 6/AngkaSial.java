/**
* File		: AngkaSial.java 01-04-2023
* Nama / NIM	: Fikri Prasetya Nurhidayat / 24060121140153
* Deskripsi     : Program penggunaan exception buatan sendiri. Pengenalan klausa 'throw' dan 'throws'
**/

public class AngkaSial{
	
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka == 13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}


/*
Pertanyaan modul: 
Ketika eksepsi terjadi, apakah baris 12 (baris 12 pada codingan) pada AngkaSial.java di atas dieksekusi?

Baris 12 tidak akan dieksekusi karena program langsung keluar dari blok try-catch 
dan melanjutkan eksekusi pada blok catch.
Apakah baris 21 (baris 21 pada codingan) pada AngkaSial.java di atas dieksekusi?
Baris 21 pada AngkaSial.java tidak akan dieksekusi karena 
program keluar dari blok try-catch pada saat terjadi eksepsi.

*/
