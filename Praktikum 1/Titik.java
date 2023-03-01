/**
Nama File	: Titik.java
Penulis		: Fikri Prasetya Nurhidayat
NIM		: 24060121140153
Tanggal		: 22 Februari 2023
Deskripsi	: Kelas yang berisi program utama yang memanfaatkan kelas Titik
Lab		: B1
**/

class Titik {
	Double absis;
	Double ordinat;
	static int counterTitik;

	void Titik(){
	counterTitik++;
	}

	void setAbsis(Double a){
		absis = a;
	}

	void setOrdinat(Double o){
		ordinat = o;
	}

	Double getAbsis(){
		return absis;
	}

	Double getOrdinat(){
		return ordinat;
	}
	
	static Double getCounterTitik() {
		return counterTitik;
	}
}
