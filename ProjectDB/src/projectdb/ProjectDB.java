/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectdb;

import java.sql.*;
import java.io.PrintStream;
import java.nio.charset.Charset;
/**
 *
 * @author Admin
 */
public class ProjectDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/friend";
        var user = "root";
        var password = "";
        
        try (Connection conn = (Connection) DriverManager.getConnection(url, user, password)) {
            System.out.println("======================= ConnectDB success ======================= ");
            String query = "select * from info";
            
//            System.setOut(new PrintStream(System.out, true, "UTF8"));
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery((query));
            
            while(rs.next()){
                System.out.println( "name :" + rs.getString("name") + "\t");
                System.out.println("age :" + rs.getString("age") + "\t");
                System.out.println("country :" + rs.getString("country") + "\t");
                System.out.println("-----------------------------------------");
                
            }

            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
