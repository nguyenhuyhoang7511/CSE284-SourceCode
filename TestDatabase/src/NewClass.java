
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class NewClass {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        var user = "root";
        var password = "";

        try ( Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Kết nối MySQL thành công !!");
            System.out.println(conn.getCatalog());
        } catch (SQLException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Kết nối MySQL thất bại!!");
        }
    }
}
