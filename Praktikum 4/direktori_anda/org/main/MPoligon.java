/**
 * File         : MPoligon.java 21/03/2023
 * Penulis      : Fikri Prasetya Nurhidayat
 * Deskripsi    : Driver class untuk Limas Segitiga
 */

package org.main;

import org.bangundatar.Segitiga;
import org.bangunruang.LimasSegitiga;

public class MPoligon{
	public static void main(String[] args){
		Segitiga segitiga = new Segitiga(6,10);
		LimasSegitiga limassegitiga = new LimasSegitiga(segitiga);
		System.out.println("Luas Alas Limas Segitiga adalah : "+limassegitiga.hitungLuasAlas());
		System.out.println("Volume Limas Segitiga adalah : "+limassegitiga.hitungVolume());
	}
}