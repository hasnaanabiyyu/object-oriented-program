/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasPboPertemuanKedua;

/**
 *
 * @author M. HASNAN AL ABIYYU
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Predator singa = new Predator("Singa", 13);
        singa.berburu();
        singa.beringas();
        singa.menerkam();
        singa.kumpulanSIfat();
        System.out.println();
        Hewan kucing = (Hewan) singa;
        kucing.setNama("Kucing");
        kucing.setUmur(5);
        System.out.println("Hewan " + kucing.getNama() + " Berusia " + kucing.getUmur() + " tahun");
    }
    
}
