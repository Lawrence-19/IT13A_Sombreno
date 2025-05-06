/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        setBounds(600, 300, 400, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsername = new javax.swing.JLabel();
        jTextUsername = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(3, 2));

        jLabelUsername.setBackground(new java.awt.Color(153, 255, 255));
        jLabelUsername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUsername.setText("          Username:");
        getContentPane().add(jLabelUsername);

        jTextUsername.setBackground(new java.awt.Color(153, 255, 255));
        jTextUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextUsername);

        jLabelPassword.setBackground(new java.awt.Color(153, 255, 255));
        jLabelPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPassword.setText("          Password:");
        getContentPane().add(jLabelPassword);

        jPasswordField.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(jPasswordField);

        jButtonLogin.setBackground(new java.awt.Color(102, 204, 255));
        jButtonLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin);

        jButtonCancel.setBackground(new java.awt.Color(102, 204, 255));
        jButtonCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        String username = jTextUsername.getText();
        String password = new String(jPasswordField.getPassword());
        
        saveToFile(username,password);
        
        JOptionPane.showMessageDialog(this, "Account saved successfully", "Saved", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void saveToFile(String username, String password){
        try{
            File file = new File("C:\\Users\\ADMIN\\Documents\\User_credentials.txt");
    
            BufferedWriter userdata = new BufferedWriter(new FileWriter(file,true));
            userdata.write("Username:" + username + ", password: "+ password);
            userdata.newLine();
            userdata.close();
    
    }catch (IOException e){
        JOptionPane.showMessageDialog(this, "Error Saving Account", "Error", JOptionPane.ERROR_MESSAGE);
    
        }  
    }
    
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        jTextUsername.setText("");
        jPasswordField.setText("");
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTextUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUsernameActionPerformed
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextUsername;
    // End of variables declaration//GEN-END:variables

   
}
