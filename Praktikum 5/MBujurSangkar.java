/**
* File		 : MBujurSangkar.java 31-03-2023
* Nama / NIM : Fikri Prasetya Nurhidayat / 24060121140153
* Deskripsi	 : Kelas yang mengimplementasikan cara menghitung luas bujur sangkar
*/

import java.util.Scanner;

class MBujurSangkar{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BujurSangkar bs = new BujurSangkar();
		System.out.print("Masukkan sisi Bujur Sangkar : ");
		double sisi = scan.nextDouble();
		System.out.println("Luas Bujur Sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
	}
}