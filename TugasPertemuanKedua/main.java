/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pbo.dua;

/**
 *
 * @author M. HASNAN AL ABIYYU
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        predator singa = new predator("Singa", 13, "Tanpa Ampun");
        singa.berburu();
        singa.beringas();
        singa.menerkam();
        System.out.println();
        hewan kucing = (hewan) singa;
        kucing.setNama("Kucing");
        kucing.setUmur(5);
        System.out.println("Hewan " + kucing.getNama() + " Berusia " + kucing.getUmur() + " tahun");
    }
    
}
