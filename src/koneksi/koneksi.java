/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author musa
 */
public class koneksi {
    private Connection koneksi;
    
    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Koneksi");
        } catch(ClassNotFoundException e) {
            System.out.println("Gagal Koneksi "+e);
        }
        
        String url="jdbc:mysql://localhost:3306/utmj_pustaka";
        try {
            koneksi = DriverManager.getConnection(url, "plsql", "plsql");
            System.out.println("Berhasil Koneksi DB");
        } catch(SQLException e) {
            System.out.println("Gagal Koneksi Database "+e);
        }
        return koneksi;
    }
}
