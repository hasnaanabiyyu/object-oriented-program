/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPboPertemuanKeempat;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Crud {

    public static void main(String[] args) {
        Connect kon = new Connect();
        Connection conn = kon.koneksi("Pbo", "postgres", "Hasnan270206*");
        System.out.println("Selamat datang di databaseku\n");
        System.out.println("silahkan pilih sesuatu yang akan dipilih\n1.membuat table\n2.melihat tabel\n3.update data pada tabel\n4.menghapus tabel\n5.menginputkan data ke dalam tabel");
        System.out.print("pilihan anda : ");
        Scanner sc = new Scanner(System.in);
        int pilihan = sc.nextInt();
        switch (pilihan) {
            case 1 -> {
                System.out.println("Masukan nama tabel");
                String nama = sc.next();
                createTable(conn, nama);
                System.out.println("\napakah ingin terus melanjutkan\n1.iya\n2.tidak");
                int s = sc.nextInt();
                if (s == 1) {
                    main(args);
                } else {
                    System.out.println("semoga harimu menyenangkan");
                    return;
                }
            }
            case 2 -> {
                System.out.println("masukan nama tabel");
                String nama = sc.next();
                findTable(conn, nama);
                System.out.println("\napakah ingin terus melanjutkan\n1.iya\n2.tidak\n");
                int s = sc.nextInt();
                if (s == 1) {
                    main(args);
                } else {
                    System.out.println("semoga harimu menyenangkan");
                    return;
                }
            }
            case 3 -> {
                System.out.println("masukan nama tabel");
                String namaTabel = sc.next();
                System.out.println("masukan nama baru");
                String nama = sc.next();
                System.out.println("masukan nim");
                String nim = sc.next();
                updateData(conn, namaTabel, nama, nim);
                System.out.println("\napakah ingin terus melanjutkan\n1.iya\n2.tidak");
                int s = sc.nextInt();
                if (s == 1) {
                    main(args);
                } else {
                    System.out.println("semoga harimu menyenangkan");
                    return;
                }
            }
            case 4 -> {
                System.out.println("masukan nama tabel");
                String nama = sc.next();
                deleteTable(conn, nama);
                System.out.println("\napakah ingin terus melanjutkan\n1.iya\n2.tidak\n");
                int s = sc.nextInt();
                if (s == 1) {
                    main(args);
                } else {
                    System.out.println("semoga harimu menyenangkan");
                    return;
                }
            }

            case 5 -> {
                System.out.println("masukan nama tabel");
                String namaTabel = sc.next();
                System.out.println("masukan nama");
                String nama = sc.next();
                System.out.println("masukan nim");
                String nim = sc.next();
                System.out.println("masukan nama prodi");
                String prodi = sc.next();
                insertData(conn, namaTabel, nama, nim, prodi);
                System.out.println("\napakah ingin terus melanjutkan\n1.iya\n2.tidak");
                int s = sc.nextInt();
                if (s == 1) {
                    main(args);
                } else {
                    System.out.println("semoga harimu menyenangkan");
                    return;
                }
            }

            default -> {
            }
        }

    }

    public static void createTable(Connection conn, String namaTabel) {
        Statement statement;
        try {
            String query = String.format("Create table %s (nama varchar(100),nim varchar(15),prodi varchar(50))", namaTabel);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Tabel berhasil di buat");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteTable(Connection conn, String nama) {
        Statement statement;
        try {
            String sql = String.format("Drop table %s", nama);
            statement = conn.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Table berhasil dihapus");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void findTable(Connection conn, String nama) {
        Statement statement;
        ResultSet rs;
        try {
            String sql = String.format("SELECT * FROM %s", nama);
            statement = conn.createStatement();
            statement.execute(sql);
            rs = statement.getResultSet();
            while (rs.next()) {
                // Misalkan kolom-kolom di tabel adalah "nama", "nim", dan "prodi"
                System.out.println("Nama: " + rs.getString("nama"));
                System.out.println("NIM: " + rs.getString("nim"));
                System.out.println("Prodi: " + rs.getString("prodi"));
                System.out.println(); // Baris kosong untuk pemisah
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void changeName(Connection conn, String namaTabel, String namaBaru, String nim) {
        Statement statement;
        try {
            String sql = String.format("Update %s set nama = '%s' where nim = '%s'", namaTabel, namaBaru, nim);
            statement = conn.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Nama berhasil di ganti!!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insertData(Connection conn, String namaTabel, String nama, String nim, String prodi) {
        PreparedStatement preparedStatement;
        try {
            // Buat SQL query dengan parameter
            String sql = String.format("INSERT INTO %s (nama, nim, prodi) VALUES (?, ?, ?)", namaTabel);

            // Buat PreparedStatement
            preparedStatement = conn.prepareStatement(sql);

            // Set parameter untuk query
            preparedStatement.setString(1, nama);
            preparedStatement.setString(2, nim);
            preparedStatement.setString(3, prodi);

            // Eksekusi query
            preparedStatement.executeUpdate();
            System.out.println("Data berhasil ditambahkan");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void updateData(Connection conn, String namaTabel, String nama, String nim) {
        Statement statement;
        try {
            String sql = String.format("Update %s set nama ='%s' where nim = '%s'", namaTabel, nama, nim);
            statement = conn.createStatement();
            statement.executeUpdate(sql);
            System.out.println("data berhasil diubah");

        } catch (SQLException e) {
            System.out.println("data gagal diubah");
        }

    }

}
