/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPboPertemuanKedua;

/**
 *
 * @author M. HASNAN AL ABIYYU
 */
public class Hewan {

    private String nama;
    private int umur;
    
        /**
     * @return the nama
     */
    
    public void sifat(){
        System.out.println("Bersifat sesuai lingkungan");
    }
    
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the umur
     */
    public int getUmur() {
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(int umur) {
        this.umur = umur;
    }
}
