/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuanKetiga;

/**
 *
 * @author M. HASNAN AL ABIYYU
 */
public class Main {
    public static void main(String[] args) {
       Mamalia kucing = new Mamalia();
       //abstrak kelas
       kucing.BerkembangBiak();
       //overload dengan parameter
       kucing.Spesifik(3);
       kucing.Spesifik("Darat", 4);
       //override
       kucing.AlatNafas();
    }
}