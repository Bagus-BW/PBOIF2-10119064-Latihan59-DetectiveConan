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
public class DetektifDewasa extends Detektif{
    private String kemampuan;

    public DetektifDewasa(String nama, String ciri) {
        super(nama, ciri);
    }

    public void setKemampuan(String kemampuan) {
        this.kemampuan = kemampuan;
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Kemampuan : " + kemampuan);
    }
    
}
