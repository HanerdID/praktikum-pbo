/**
 * File         : MKubus.java 21/03/2023
 * Penulis      : Fikri Prasetya Nurhidayat
 * Deskripsi    : Driver class untuk Kubus
 */

package org.main; 
 
import org.bangunruang.*; 
import org.bangundatar.*; 
 
public class MKubus{ 
	public static void main(String[] args){ 
		BujurSangkar bujurSangkar = new BujurSangkar(6); 
		Kubus kubus = new Kubus(bujurSangkar); 
		System.out.println("Luas Alas Kubus dengan panjang sisi 6 satuan adalah : "+kubus.hitungLuasAlas()); 
		System.out.println("Volume Kubus dengan panjang sisi 6 satuan adalah : "+kubus.hitungVolume()); 
	} 
}