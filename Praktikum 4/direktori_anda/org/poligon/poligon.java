/**
 * File         : poligon.java 21/03/2023
 * Penulis      : Fikri Prasetya Nurhidayat
 * Deskripsi    : Representasi dasar dari objek poligon (segi banyak)
 */

package org.poligon; 
 
public class Poligon{ 
	protected int jumlahSisi; 
	public Poligon(){ 
		this.jumlahSisi = 0; 
	} 
	
	public int getJumlahSisi(){ 
		return this.jumlahSisi; 
	} 
	
	public void setJumlahSisi(int sisi){ 
		this.jumlahSisi = sisi; 
	} 
}

