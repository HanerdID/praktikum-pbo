/**
Nama File	: MTitik.java
Penulis		: Fikri Prasetya Nurhidayat
NIM		: 24060121140153
Tanggal		: 22 Februari 2023
Deskripsi	: Kelas yang berisi program utama yang memanfaatkan kelas MTitik
Lab		: B1
**/

class MTitik {
	public static void main(String[] args) {
		Titik t1;
		Titik t2;
		t1 = new Titik();
		t2 = new Titik();
		t1.setAbsis(1.0);
		t1.setOrdinat(2.0);

		t2.setAbsis(4.0);
		t2.setOrdinat(9.0);
		System.out.println("t1.x = " +t1.getAbsis());
		System.out.println("t1.y = " + t1.getOrdinat());
		System.out.println("t2.x = " +t2.getAbsis());
		System.out.println("t2.y = " + t2.getOrdinat());
	}
}
