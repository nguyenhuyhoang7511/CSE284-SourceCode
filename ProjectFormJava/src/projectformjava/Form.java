/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectformjava;

import java.sql.*;
import com.sun.jdi.connect.spi.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Admin
 */
public class Form extends javax.swing.JFrame {

    /**
     * Creates new form Form
     */
    Connection conn;
    Statement st;
    ArrayList<SinhVien> sinhVienName = new ArrayList<>();

    public Form() {
        initComponents();
        getsSinhVien();
    }

//     Ham connect neu can
//         public Connection getCon(){
//         Connection con=null;
//         try {
// //           Class.forName("com.mysql.cj.jdbc.Driver");
//              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dlgv","root","");
//                System.out.println("Connected.");
// //            System.setOut(new PrintStream(System.out, true, "UTF8"));
         
// //            Statement stmt = con.createStatement(); // Command
// //            ResultSet rs = stmt.executeQuery(query); // Excute
           
            
//         } catch (Exception e) {
//             System.out.println("Error." + e);
//         }
//         return con;
//     }
    private void getsSinhVien() {
        DefaultTableModel model = (DefaultTableModel) jtable_show.getModel();
        model.setRowCount(0);

        sinhVienName.clear();
        String url = "jdbc:mysql://localhost:3306/user1";
        var user = "root";
        var password = "";

        try ( java.sql.Connection conn = (java.sql.Connection) DriverManager.getConnection(url, user, password)) {
            System.out.println("======================= ConnectDB success ======================= ");
            String query = "select * from student";

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery((query));

            while (rs.next()) {
                String inputId = rs.getString("id");
                String inputName = rs.getString("name");
                String inputAge = rs.getString("age");
                String inputAddress = rs.getString("address");
                Object rowData[] = {inputId, inputName, inputAge, inputAddress};
//                DefaultTableModel model = (DefaultTableModel) jtable_show.getModel();

                model.addRow(rowData);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_fullName = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_show = new javax.swing.JTable();
        btn_search = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("FullName:");

        jLabel2.setBackground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Age :");

        jLabel3.setBackground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Address :");

        txt_fullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fullNameActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(102, 102, 255));
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(102, 102, 255));
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(102, 102, 255));
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(102, 102, 255));
        btn_clear.setText("reload");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        jtable_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FullName", "Age", "Address"
            }
        ));
        jScrollPane1.setViewportView(jtable_show);

        btn_search.setBackground(new java.awt.Color(102, 102, 255));
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        jLabel4.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_age)
                                        .addComponent(txt_address)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_fullName)
                                        .addComponent(txt_id))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_clear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_search)
                                .addGap(213, 213, 213)))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_fullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_update)
                    .addComponent(btn_delete)
                    .addComponent(btn_clear)
                    .addComponent(btn_search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        String inputId = txt_id.getText().trim();
        String inputName = txt_fullName.getText().trim();
        String inputAge = txt_age.getText().trim();
        String inputAddress = txt_address.getText().trim();
        sinhVienName.clear();
        String url = "jdbc:mysql://localhost:3306/user1";
        var user = "root";
        var password = "";

        try ( java.sql.Connection conn = (java.sql.Connection) DriverManager.getConnection(url, user, password)) {
            System.out.println("======================= ConnectDB success ======================= ");
            String query = "INSERT INTO `student`(`id`, `name`, `age`, `address`) "
                    + "VALUES ('" + inputId + "','" + inputName + "','" + inputAge + "','" + inputAddress + "')";

            Statement stmt = conn.createStatement();

            DefaultTableModel model = (DefaultTableModel) jtable_show.getModel();
            model.setRowCount(0);

            stmt.execute(query);

            getsSinhVien();

            JOptionPane.showMessageDialog(
                    rootPane,
                    "Thêm mới thành công",
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void txt_fullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fullNameActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

        int i = jtable_show.getSelectedRow();
        System.out.println("i =" + i);

        if (i >= 0) {
            int option = JOptionPane.showConfirmDialog(rootPane,
                    "Bạn có chắc chắn muốn xóa không?", "Delete confirmation", JOptionPane.YES_NO_OPTION);

            if (option == 0) {
                TableModel model = jtable_show.getModel();
                String id = model.getValueAt(i, 0).toString();
                System.out.println("id =" + id);
                if (jtable_show.getSelectedRows().length == 1) {
                    sinhVienName.clear();
                    String url = "jdbc:mysql://localhost:3306/user1";
                    var user = "root";
                    var password = "";
                    try ( java.sql.Connection conn = (java.sql.Connection) DriverManager.getConnection(url, user, password)) {
                        System.out.println("======================= ConnectDB success ======================= ");
                        String query = "DELETE FROM `student` WHERE id='" + id + "'";
                        Statement stmt = conn.createStatement();
                        stmt.execute(query);
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
        DefaultTableModel model = (DefaultTableModel) jtable_show.getModel();
        model.setRowCount(0);
        getsSinhVien();

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        String inputId = txt_id.getText().trim();
        String inputName = txt_fullName.getText().trim();
        String inputAge = txt_age.getText().trim();
        String inputAddress = txt_address.getText().trim();

        sinhVienName.clear();
        String url = "jdbc:mysql://localhost:3306/user1";
        var user = "root";
        var password = "";

        try ( java.sql.Connection conn = (java.sql.Connection) DriverManager.getConnection(url, user, password)) {
            System.out.println("======================= ConnectDB success ======================= ");
            String query = "UPDATE `student`SET name='" + inputName + "',age='" + inputAge + "',address='" + inputAddress + "'WHERE id='" + inputId + "'";

            Statement stmt = conn.createStatement();

            DefaultTableModel model = (DefaultTableModel) jtable_show.getModel();
            model.setRowCount(0);

            stmt.execute(query);

            System.out.println("stmt :" + stmt);
            getsSinhVien();

            JOptionPane.showMessageDialog(
                    rootPane,
                    "Cập nhật thành công",
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        sinhVienName.clear();
        String url = "jdbc:mysql://localhost:3306/user1";
        var user = "root";
        var password = "";

        String id = txt_id.getText().trim();
        System.out.println("id" + id);

        try ( java.sql.Connection conn = (java.sql.Connection) DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM `student` WHERE id ='" + id + "'";

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery((query));

            System.out.println("stmt" + stmt);
            DefaultTableModel model = (DefaultTableModel) jtable_show.getModel();
            model.setRowCount(0);

            Boolean check = false;
            while (rs.next()) {
                check = true;
                String inputId = rs.getString("id");
                String inputName = rs.getString("name");
                String inputAge = rs.getString("age");
                String inputAddress = rs.getString("address");

                Object rowData[] = {inputId, inputName, inputAge, inputAddress};
                model.addRow(rowData);
            }

            if (check == true) {
                JOptionPane.showMessageDialog(
                        rootPane,
                        "Tìm kiếm thành công",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(
                        rootPane,
                        "Tìm kiếm thất bại",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        getsSinhVien();        
    }//GEN-LAST:event_btn_clearActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable_show;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_fullName;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
