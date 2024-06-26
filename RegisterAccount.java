/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pbolastproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Doddy Prayogo
 */
public class RegisterAccount extends javax.swing.JFrame {

    /**
     * Creates new form RegisterAccount
     */
    public RegisterAccount() {
        initComponents();
        buttonGroup1.add(Male);
        buttonGroup1.add(Female);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        namaPengguna = new javax.swing.JTextField();
        masukkanPenggunaSignup = new javax.swing.JTextField();
        numberTelp = new javax.swing.JTextField();
        passwordSignup = new javax.swing.JPasswordField();
        konfirmasiPassword = new javax.swing.JPasswordField();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CINEMAX");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(202, 6, 70, 21);

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Full Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(52, 47, 59, 17);

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(52, 85, 59, 17);

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone Number :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(52, 125, 85, 17);

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(52, 163, 59, 17);

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirm Password :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(52, 200, 105, 17);

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(52, 238, 46, 17);

        namaPengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaPenggunaActionPerformed(evt);
            }
        });
        jPanel1.add(namaPengguna);
        namaPengguna.setBounds(231, 45, 190, 22);
        jPanel1.add(masukkanPenggunaSignup);
        masukkanPenggunaSignup.setBounds(231, 83, 190, 22);
        jPanel1.add(numberTelp);
        numberTelp.setBounds(231, 123, 190, 22);
        jPanel1.add(passwordSignup);
        passwordSignup.setBounds(230, 160, 190, 22);
        jPanel1.add(konfirmasiPassword);
        konfirmasiPassword.setBounds(230, 190, 190, 22);

        Male.setForeground(new java.awt.Color(255, 255, 255));
        Male.setText("Male");
        jPanel1.add(Male);
        Male.setBounds(230, 240, 49, 21);

        Female.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        Female.setForeground(new java.awt.Color(255, 255, 255));
        Female.setText("Female");
        jPanel1.add(Female);
        Female.setBounds(351, 238, 60, 22);

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(98, 272, 270, 24);

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Already Have an Account? Login");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(146, 308, 176, 17);

        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Doddy Prayogo\\Pictures\\Saved Pictures\\studio-1-bioskop-movimax.jpg")); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 480, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void namaPenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaPenggunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaPenggunaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String namaPenggunaText = namaPengguna.getText();
    String penggunaText = masukkanPenggunaSignup.getText();
    String passwordText = new String(passwordSignup.getPassword());
    String konfirmasiPasswordText = new String(konfirmasiPassword.getPassword());
    String numberTelpText = numberTelp.getText();
    ButtonModel selectedGenderModel = buttonGroup1.getSelection();
    String gender = (selectedGenderModel != null && selectedGenderModel.isSelected()) ? "Male" : "Female";

    if (namaPenggunaText.isEmpty() || penggunaText.isEmpty() || numberTelpText.isEmpty() || 
        passwordText.isEmpty() || konfirmasiPasswordText.isEmpty() || selectedGenderModel == null) {
        JOptionPane.showMessageDialog(this, "Silakan lengkapi semua kolom!", "Form Belum Lengkap", JOptionPane.WARNING_MESSAGE);
    } else if (!passwordText.equals(konfirmasiPasswordText)) {
        JOptionPane.showMessageDialog(this, "Konfirmasi kata sandi tidak sesuai!", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        // Lanjutkan dengan proses pendaftaran ke database
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bioskop", "root", "");
            String query = "INSERT INTO user (nama, username, numberTelp, password, gender) values (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, namaPenggunaText);
            ps.setString(2, penggunaText);
            ps.setString(3, numberTelpText);
            ps.setString(4, passwordText);
            ps.setString(5, gender);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Registrasi Berhasil!");
            conn.close();
            
            this.dispose();
            Login login = new Login();
            login.setVisible(true);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error, Registrasi Gagal", JOptionPane.ERROR_MESSAGE);
        } 
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RegisterAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JLabel background;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField konfirmasiPassword;
    private javax.swing.JTextField masukkanPenggunaSignup;
    private javax.swing.JTextField namaPengguna;
    private javax.swing.JTextField numberTelp;
    private javax.swing.JPasswordField passwordSignup;
    // End of variables declaration//GEN-END:variables
}

