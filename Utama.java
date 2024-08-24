/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pbo.satu;

/**
 *
 * @author M. HASNAN AL ABIYYU
 */
public class Utama {

    public static void main(String[] args) {
        Dikotil mangga  = new Dikotil();
           mangga.Bernafas();
           mangga.Tumbuh();
           mangga.setNamaTumbuhan("Pohon Mangga");
           mangga.setJaringanPengangkut("Xilem dan Floem");
           mangga.setAlatReproduksi("'Angiospermas'");
           mangga.setSiklusHidup("kecambah, vegetatif, reproduksi, penyebaran biji");
           System.out.println("Tumbuhan " + mangga.getNamaTumbuhan());
           System.out.println("Memiliki jaringan pengangkut air yakni " + mangga.getJaringanPengangkut());
           System.out.println("Alat Reproduksi yaitu " + mangga.getAlatReproduksi());
           System.out.println("Memiliki siklus hidup : " + mangga.getSiklusHidup());
           mangga.Akar();
           mangga.Batang();
           mangga.Biji();
           mangga.Bunga();
           mangga.Daun();

           System.out.println("");
           
        Monokotil jagung = new Monokotil();
        jagung.Bernafas();
        jagung.Tumbuh();
        jagung.Bernafas();
        jagung.Tumbuh();
        jagung.setNamaTumbuhan("Jagung");
        jagung.setJaringanPengangkut("Xilem dan Floem");
        jagung.setAlatReproduksi("'Angiospermas'");
        jagung.setSiklusHidup("kecambah, vegetatif, reproduksi, penyebaran biji");
        System.out.println("Tumbuhan " + jagung.getNamaTumbuhan());
        System.out.println("Memiliki jaringan pengangkut air yakni " + jagung.getJaringanPengangkut());
        System.out.println("Alat Reproduksi yaitu " + jagung.getAlatReproduksi());
        System.out.println("Memiliki siklus hidup : " + jagung.getSiklusHidup());
        jagung.Akar();
        jagung.Batang();
        jagung.Biji();
        jagung.Bunga();
        jagung.Daun();
        
        System.out.println("");
        
        mamalia kucing = new mamalia();
        kucing.Bernafas();
        kucing.Tumbuh();
        kucing.setNamaHewan("Kucing");
        kucing.setBergerak("Berjelan");
        kucing.setAlatgerak("Kaki");
        kucing.setHidupDi("darat");
        System.out.println("Hewan " + kucing.getNamaHewan());
        System.out.println("Bergerak dengan cara " + kucing.getBergerak());
        System.out.println("Alat Gerak  dari hewan ini yaitu " + kucing.getAlatgerak());
        System.out.println("Hewan ini hidup di " + kucing.getHidupDi());
        kucing.alatPernafasan();
        kucing.kembangBiak();
        kucing.organTubuhIdentik();
        
        System.out.println("");
        
        aves kenari = new aves();
        kenari.Bernafas();
        kenari.Tumbuh();
        kenari.setNamaHewan("Burung Kenari");
        kenari.setBergerak("Terbang");
        kenari.setAlatgerak("Sayap");
        kenari.setHidupDi("Udara");
        System.out.println("Hewan " + kenari.getNamaHewan());
        System.out.println("Bergerak dengan cara " + kenari.getBergerak());
        System.out.println("Alat Gerak  dari hewan ini yaitu " + kenari.getAlatgerak());
        System.out.println("Hewan ini hidup di " + kenari.getHidupDi());
        kenari.alatPernafasan();
        kenari.kembangBiak();
        kenari.organTubuhIdentik();
        
        System.out.println("");
        
        pisces salmon = new pisces();
        salmon.Bernafas();
        salmon.Tumbuh();
        salmon.setNamaHewan("Ikan Salmon");
        salmon.setBergerak("Berenang");
        salmon.setAlatgerak("Sirip");
        salmon.setHidupDi("AIr");
        System.out.println("Hewan " + salmon.getNamaHewan());
        System.out.println("Bergerak dengan cara " + salmon.getBergerak());
        System.out.println("Alat Gerak  dari hewan ini yaitu " + salmon.getAlatgerak());
        System.out.println("Hewan ini hidup di " + salmon.getHidupDi());
        salmon.alatPernafasan();
        salmon.kembangBiak();
        salmon.organTubuhIdentik();

        System.out.println("");
        
        reptil kobra = new reptil();
        kobra.Bernafas();
        kobra.Tumbuh();
        kobra.setNamaHewan("Ular kobra");
        kobra.setBergerak("Melata");
        kobra.setAlatgerak("Perut");
        kobra.setHidupDi("Darat");
        System.out.println("Hewan " + kobra.getNamaHewan());
        System.out.println("Bergerak dengan cara " + kobra.getBergerak());
        System.out.println("Alat Gerak  dari hewan ini yaitu " + kobra.getAlatgerak());
        System.out.println("Hewan ini hidup di " + kobra.getHidupDi());
        kobra.alatPernafasan();
        kobra.kembangBiak();
        kobra.organTubuhIdentik();
        
        System.out.println("");
        
        amfibi katak = new amfibi();
        katak.Bernafas();
        katak.Tumbuh();
        katak.setNamaHewan("Katak");
        katak.setBergerak("Melompat");
        katak.setAlatgerak("Kaki");
        katak.setHidupDi("Darat dan Air");
        System.out.println("Hewan " + katak.getNamaHewan());
        System.out.println("Bergerak dengan cara " + katak.getBergerak());
        System.out.println("Alat Gerak  dari hewan ini yaitu " + katak.getAlatgerak());
        System.out.println("Hewan ini hidup di " + katak.getHidupDi());
        katak.alatPernafasan();
        katak.kembangBiak();
        katak.organTubuhIdentik();


    }

}
