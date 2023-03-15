/**
 * File         : MSegitiga.java 08/03/2023
 * Penulis      : Fikri Prasetya Nurhidayat
 * Deskripsi    : Driver class untuk segitiga
 */

package org.main;

import org.bangundatar.*;

public class MSegitiga{
    public static void main(String[] args){
        Segitiga segitiga = new Segitiga(3,4,5,3);
        segitiga.printInfo();
        System.out.println("Panjang Sisi Miring adalah : "+segitiga.Pythagoras());
    }
}