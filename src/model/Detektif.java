/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program menentukan detektif kecil dan
 * detektif dewasa pada film detective conan
 */
public class Detektif {
    protected String nama;
    protected String ciri;

    public Detektif(String nama, String ciri) {
        this.nama = nama;
        this.ciri = ciri;
    }
    
    public void tampil(){
        System.out.println("Nama : " + nama);
        System.out.println("Ciri : " + ciri);
    }
}
