/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPboPertemuanKedua;

/**
 *
 * @author M. HASNAN AL ABIYYU
 */
public final class Predator extends Hewan implements Berburu, Menerkam, Beringas {

    public Predator(String nama, int umur) {

        super.setNama(nama);
        super.setUmur(umur);

        System.out.println("Aku adalah predator " + getNama() + " dan aku berumur " + getUmur());
    }

    public void kumpulanSIfat() {
        this.sifat();
        super.sifat();
    }

    @Override
    public void sifat() {
        System.out.println("Memiliki Sifat Tanpa Ampun");
    }

    public void mencarimakanan() {
        System.out.println("Saya mencari makanan dengan kekuatan dan perhitungan");
    }

    @Override
    public void berburu() {
        System.out.println("Saya mendapatkan makanan dengan memburu mangsa saya");
    }

    @Override
    public void menerkam() {
        System.out.println("Saya menerkam mangsa tidak butuh waktu lama");
    }

    @Override
    public void beringas(){
        System.out.println("Saya menghabisi mangsa saya tanpa ampun");  
    }
}
        
    
