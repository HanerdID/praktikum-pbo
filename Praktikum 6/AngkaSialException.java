/**
* File		    : AngkaSialException.java 01-04-2023
* Nama / NIM	: Fikri Prasetya Nurhidayat / 24060121140153
* Deskripsi     : Eksepsi buatan sendiri, menolak masukan angka 13!
**/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("Jangan masukkan angka 13, karena angka sial !!!");
	}
}