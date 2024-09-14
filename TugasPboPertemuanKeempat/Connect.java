/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPboPertemuanKeempat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public Connection koneksi (String dbname,String user,String pass){
          Connection connection = null;
        
        try{
            Class.forName("org.postgresql.Driver");
          connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbname,user,pass);
            if (connection!= null) {
                System.out.println("berhasil terhubung ke database");
            }else{
                System.out.println("gagal terhubung");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return connection;
    }
   
}
    