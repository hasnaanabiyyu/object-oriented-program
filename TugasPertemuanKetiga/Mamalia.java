/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuanKetiga;

/**
 *
 * @author M. HASNAN AL ABIYYU
 */
public class Mamalia extends Hewan {
    //method abstrak class turunan
    
    @Override
    public void BerkembangBiak() {
        System.out.println("Saya Berkembang Biak");
    }
    //method override turunan
    @Override
    public void Bernafas(){
        System.out.println("saya Mamalia bernafas dengan Paru-paru");
    }
    //method overload
    public void Spesifik() {
        System.out.println("Saya memiliki kelenjar susu");
    }
    public void Spesifik(String tempatTinggal, int anggotaGerak){
        System.out.
                println("Saya Bertempat Tinggal di " + tempatTinggal + " dengan " + anggotaGerak + " anggota gerak pada tubuh.");
    }
    //cek override
    public void AlatNafas(){
        super.Bernafas();
        this.Bernafas();
    }
}
