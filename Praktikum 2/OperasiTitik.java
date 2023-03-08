/**
Nama File	: OperasiTitik.java
Penulis		: Fikri Prasetya Nurhidayat
NIM		: 24060121140153
Tanggal		: 1 Maret 2023
Deskripsi	: Kelas yang berisi program utama yang memanfaatkan kelas OperasiTitik
Lab		: B1
**/

class OperasiTitik {
	public void refleksiSumbuX(Titik titik) {
		Double ordinat = titik.getOrdinat();
		titik.setOrdinat(-1 * ordinat);
	}

	public void refleksiSumbuY (Titik titik) {
		Double absis = titik.getAbsis();
		titik.setAbsis(-1 * absis);
	}
}
