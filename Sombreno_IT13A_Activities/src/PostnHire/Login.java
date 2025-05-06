/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PostnHire;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    static final int Shift = 3;
    
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabelusername = new javax.swing.JLabel();
        jTextusername = new javax.swing.JTextField();
        jLabelpassword = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jButtonlogin = new javax.swing.JButton();
        jButtontosignin = new javax.swing.JButton();
        jCheckshowpass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Main.setBackground(new java.awt.Color(255, 255, 255));

        Left.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PostnHire");
        jLabel2.setFocusTraversalPolicyProvider(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(194, 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(143, 143, 143))
        );

        Right.setBackground(new java.awt.Color(255, 255, 255));

        jLabelusername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelusername.setForeground(new java.awt.Color(102, 102, 255));
        jLabelusername.setText("Username");

        jTextusername.setBackground(new java.awt.Color(255, 255, 255));
        jTextusername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextusername.setForeground(new java.awt.Color(0, 0, 0));
        jTextusername.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        jLabelpassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelpassword.setForeground(new java.awt.Color(102, 102, 255));
        jLabelpassword.setText("Password");

        jPassword.setBackground(new java.awt.Color(255, 255, 255));
        jPassword.setForeground(new java.awt.Color(0, 0, 0));

        jButtonlogin.setBackground(new java.awt.Color(102, 102, 255));
        jButtonlogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonlogin.setForeground(new java.awt.Color(204, 255, 255));
        jButtonlogin.setText("Login");
        jButtonlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonloginMouseClicked(evt);
            }
        });

        jButtontosignin.setBackground(new java.awt.Color(255, 255, 255));
        jButtontosignin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtontosignin.setForeground(new java.awt.Color(102, 153, 255));
        jButtontosignin.setText("Don't have account yet?");
        jButtontosignin.setBorder(null);
        jButtontosignin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtontosigninMouseClicked(evt);
            }
        });

        jCheckshowpass.setBackground(new java.awt.Color(255, 255, 255));
        jCheckshowpass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckshowpass.setForeground(new java.awt.Color(102, 102, 102));
        jCheckshowpass.setText("Show password");
        jCheckshowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckshowpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckshowpass)
                    .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPassword)
                        .addComponent(jLabelpassword)
                        .addComponent(jLabelusername)
                        .addComponent(jTextusername)
                        .addComponent(jButtonlogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtontosignin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabelusername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextusername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabelpassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckshowpass)
                .addGap(73, 73, 73)
                .addComponent(jButtonlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtontosignin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addComponent(Left, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtontosigninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtontosigninMouseClicked
        // TODO add your handling code here:
        Signup sign = new Signup();
        sign.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtontosigninMouseClicked

    private void jButtonloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonloginMouseClicked
       String username = jTextusername.getText();
       String password = new String(jPassword.getPassword());
       
       //if ever nga natuplok ni user ang button unya walay sulod ang username ug password//
        if (username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please input Your Username and Password", "Error", JOptionPane.ERROR_MESSAGE);
        
        }
        
        String encryptPass = encrypt(password,Shift);
        boolean usernameExist = false;
        boolean passmatched = false;

        try{
            BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\ADMIN\\Documents\\Input.txt"));
            String line;
            
            while ((line = read.readLine()) != null){
                String[] parts = line.split(",");
                if (parts.length == 2){
                    String dataUsername = parts[0].trim();
                    String datapassword = parts[1].trim();
                    
                    if (username.equals(dataUsername)){
                        usernameExist = true;
                        if(encryptPass.equals(datapassword)){
                            passmatched = true;
                            break;
                            }
                        }  
                    }
                }
            
            read.close();
            
            if(!usernameExist){
                JOptionPane.showMessageDialog(this, "username not found", "loginFailed", JOptionPane.ERROR_MESSAGE);
                jTextusername.setText("");//Mahawan ang username textfeild
                jPassword.setText("");//Mahawan ang password feild
            }else if(!passmatched){
                JOptionPane.showMessageDialog(this, "Incorrect password", "Login Failed", JOptionPane.ERROR_MESSAGE);
                jPassword.setText("");//Mahawan ang password feild
            }else{
                JOptionPane.showMessageDialog(this, "login Successful", "Welcome", JOptionPane.INFORMATION_MESSAGE);
                //Mapadulong sa Dashboard nga Jframe
                Dashboard dash = new Dashboard();
                dash.setVisible(true);
                dispose();
            }
            
//          if(passmatched){
//              JOptionPane.showMessageDialog(this, "login Successful", "Welcome", JOptionPane.INFORMATION_MESSAGE);
//              
//              //Mapadulong sa Dashboard nga Jframe
//              Dashboard dash = new Dashboard();
//              dash.setVisible(true);
//              dispose();
//              
//          }else if(usernameExist){
//              JOptionPane.showMessageDialog(this, "Incorrect password", "Login Failed", JOptionPane.ERROR_MESSAGE);
//              jPassword.setText("");//Mahawan ang password feild
//          }else{
//              JOptionPane.showMessageDialog(this, "username not found", "loginFailed", JOptionPane.ERROR_MESSAGE);
//              jTextusername.setText("");//Mahawan ang username textfeild
//              jPassword.setText("");//Mahawan ang password feild
//          }
            
        }catch(IOException e){
         JOptionPane.showMessageDialog(this, "Error reading eser file", "Error", JOptionPane.ERROR_MESSAGE);
           }
        
    }//GEN-LAST:event_jButtonloginMouseClicked

    private void jCheckshowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckshowpassActionPerformed
        if (jCheckshowpass.isSelected()){
            jPassword.setEchoChar((char) 0); // ma visible ang password
        }else{
            jPassword.setEchoChar('*');//ma tago ang password
        }
    }//GEN-LAST:event_jCheckshowpassActionPerformed
    
    private String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                result.append((char) ((ch - base + shift) % 26 + base));
            } else if (Character.isDigit(ch)) {
                result.append((char) ((ch - '0' + shift) % 10 + '0'));
            } else {
                result.append(ch); 
            }
        }
    return result.toString();
    }
    

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Right;
    private javax.swing.JButton jButtonlogin;
    private javax.swing.JButton jButtontosignin;
    private javax.swing.JCheckBox jCheckshowpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelpassword;
    private javax.swing.JLabel jLabelusername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextusername;
    // End of variables declaration//GEN-END:variables
}
