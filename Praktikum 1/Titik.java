/**
Titik.java
Penulis: Fikri Prasetya Nurhidayat
Deskripsi: Kelas yang berisi program utama yang memanfaatkan kelas Titik
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
