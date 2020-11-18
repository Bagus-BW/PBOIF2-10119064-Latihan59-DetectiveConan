/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan59.detectiveconan;

import model.DetektifDewasa;
import model.DetektifKecil;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program menentukan detektif kecil dan
 * detektif dewasa pada film detective conan
 */
public class PBOIF210119064Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("");
        
        //inisialisasi objek DetektifDewas
        System.out.println("=====Detektif Dewasa=====");
        DetektifDewasa detektifDewasa = new DetektifDewasa("Kagoro Mouri", "Seorang detektif swasta yang terkenal");
        detektifDewasa.setKemampuan("Ahli dalam beladiri judo");
        detektifDewasa.tampil();
        
        System.out.println();
        
        System.out.println("=====Detektif Kecil=====");
        //inisialisasi objek DetektifKecil
        DetektifKecil detektifKecil = new DetektifKecil("Conan Endogawa", "Memiliki ukuran tubuh yang kecil");
        detektifKecil.setKemampuan("Menyelesaikan kasus yang sulit terpecahkan");
        detektifKecil.tampil();
    }
    
}
