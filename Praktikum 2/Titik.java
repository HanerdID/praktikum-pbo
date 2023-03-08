/**
Nama File	: Titik.java
Penulis		: Fikri Prasetya Nurhidayat
NIM		: 24060121140153
Tanggal		: 1 Maret 2023
Deskripsi	: Kelas yang berisi program utama yang memanfaatkan kelas MTitik
Lab		: B1
**/

class Titik {
	private Double absis;
	private Double ordinat;
	private static int counterTitik;

	public Titik(){
		counterTitik++;
	}

	public void setAbsis(Double a){
		absis = a;
	}

	public void setOrdinat(Double o){
		ordinat = o;
	}

	public Double getAbsis(){
		return absis;
	}

	public Double getOrdinat(){
		return ordinat;
	}

	static int getCounterTitik (){
		return counterTitik;
	}
}
