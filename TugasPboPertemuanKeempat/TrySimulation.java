/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPboPertemuanKeempat;

import java.util.Scanner;

public class TrySimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("masukan nomor");
             int contoh = sc.nextInt();
            System.out.println(contoh);
        }catch(Exception e){
            System.err.println("masukan angka bukan huruf");
        }
    }
}
