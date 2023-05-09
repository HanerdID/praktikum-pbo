/**
* File		    : Vehicle.java 09-05-2023
* Nama / NIM	: Fikri Prasetya Nurhidayat / 24060121140153
* Deskripsi     : Vehicle.java adalah adalah kelas yang berisi rumus untuk menghitung harga sewa kendaraan.
**/

public class Vehicle{
    void calRent(int distance, float price){
        float fare= distance * price;
        System.out.println("Vehicle price = "+fare);
    }
}
