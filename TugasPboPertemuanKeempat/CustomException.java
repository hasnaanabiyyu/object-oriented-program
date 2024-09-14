/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPboPertemuanKeempat;

/**
 *
 * @author M. HASNAN AL ABIYYU
 */
public class CustomException extends Exception{
    public CustomException(String s){
        super(s);
    }
    public static void main(String[] args) {
        try {
            throw new CustomException("gok gok");
        } catch (CustomException e) {
            System.err.println("tertangkap");
            System.out.println(e.getMessage());
        }
    }
}
