/**
* File		    : PolimorfismeCoercion.java 09-05-2023
* Nama / NIM	: Fikri Prasetya Nurhidayat / 24060121140153
* Deskripsi     :
**/

public class PolimorfismeCoercion {
    public static int kuadrat(int bilangan){
        return bilangan * bilangan;
    }
    public static void main(String[] args){
        //deklarasi objek integer
        Integer bilangan = 10;

        //objek integer 'dipaksa' untuk diubah menjadi primitif
        int hasilKuadrat = kuadrat(bilangan);

        System.out.printf("Hasil kuadrat %d adalah %d", bilangan, hasilKuadrat);
    }
}