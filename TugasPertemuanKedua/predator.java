/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pbo.dua;

/**
 *
 * @author M. HASNAN AL ABIYYU
 */
public final class predator extends hewan implements berburu, menerkam, beringas {

    private String sifat;
    
    public predator(String nama, int umur, String sifat) {
        this.sifat = sifat;
        super.setNama(nama);
        super.setUmur(umur);
        
        System.out.println("Aku adalah predator " + getNama() + " dan aku berumur " + getUmur() + " tahun, aku memiliki sifat " + getSifat());
    }
    
    public void mencarimakanan(){
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
    public void beringas() {
        System.out.println("Saya menghabisi mangsa saya tanpa ampun");
    }

    /**
     * @return the sifat
     */
    public String getSifat() {
        return sifat;
    }

    /**
     * @param sifat the sifat to set
     */
    public void setSifat(String sifat) {
        this.sifat = sifat;
    }
}
