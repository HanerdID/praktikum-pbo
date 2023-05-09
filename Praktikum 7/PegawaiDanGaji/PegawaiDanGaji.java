/**
* File		    : PegawaiDanGaji.java 09-05-2023
* Nama / NIM	: Fikri Prasetya Nurhidayat / 24060121140153
* Deskripsi     : PegawaiDanGaji.java adalah main kelas untuk menjalankan class Pegawai dan class Manajer
**/

public class PegawaiDanGaji{
	public static void main (String args[]){
		Pegawai pegawai = new Programmer ("Mira");
		Pegawai pegawai2 = new Manajer("Joko");
		Pegawai pegawai3 = new Manajer("Argo");
		
		Payroll payroll = new Payroll();
		payroll.cetakGaji(pegawai);
		payroll.cetakGaji(pegawai2);
		payroll.cetakGaji(pegawai3);
	}
}