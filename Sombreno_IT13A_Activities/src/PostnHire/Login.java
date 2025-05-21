
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

        jLabel4 = new javax.swing.JLabel();
        Main = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        Lname = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Llogin = new javax.swing.JLabel();
        Lcopyright = new javax.swing.JLabel();
        Lquote2 = new javax.swing.JLabel();
        Lquote1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        jLabelusername = new javax.swing.JLabel();
        jTextusername = new javax.swing.JTextField();
        jLabelpassword = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jButtonlogin = new javax.swing.JButton();
        jButtontosignin = new javax.swing.JButton();
        jCheckshowpass = new javax.swing.JCheckBox();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Main.setBackground(new java.awt.Color(255, 255, 255));

        Left.setBackground(new java.awt.Color(59, 59, 156));
        Left.setAlignmentX(0.0F);
        Left.setPreferredSize(new java.awt.Dimension(277, 281));
        Left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lname.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Lname.setForeground(new java.awt.Color(203, 178, 107));
        Lname.setText("POSTnHIRE");
        Lname.setFocusTraversalPolicyProvider(true);
        Left.add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jPanel1.setBackground(new java.awt.Color(203, 178, 107));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(194, 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        Left.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 200, 3));

        Llogin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Llogin.setForeground(new java.awt.Color(203, 178, 107));
        Llogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Llogin.setText("Login");
        Llogin.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Left.add(Llogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        Lcopyright.setForeground(new java.awt.Color(153, 255, 255));
        Lcopyright.setText(" © 2025 POSTnHIRE - All Rights Reserved");
        Left.add(Lcopyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        Lquote2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lquote2.setForeground(new java.awt.Color(153, 255, 255));
        Lquote2.setText("“Where Opportunities Meet Talent”");
        Left.add(Lquote2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        Lquote1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lquote1.setForeground(new java.awt.Color(204, 255, 255));
        Lquote1.setText("“Post Jobs. Hire Talent. Fast.”");
        Left.add(Lquote1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PostnHire/PostNHire-Logolang 300.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        Left.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 220, -1));

        Right.setBackground(new java.awt.Color(203, 178, 107));
        Right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelusername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelusername.setForeground(new java.awt.Color(59, 59, 156));
        jLabelusername.setText("Username");
        Right.add(jLabelusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 93, -1, -1));

        jTextusername.setBackground(new java.awt.Color(255, 255, 255));
        jTextusername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextusername.setForeground(new java.awt.Color(0, 0, 0));
        jTextusername.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        Right.add(jTextusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 133, 319, 32));

        jLabelpassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelpassword.setForeground(new java.awt.Color(59, 59, 156));
        jLabelpassword.setText("Password");
        Right.add(jLabelpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 196, -1, -1));

        jPassword.setBackground(new java.awt.Color(255, 255, 255));
        jPassword.setForeground(new java.awt.Color(0, 0, 0));
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        Right.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 224, 319, 35));

        jButtonlogin.setBackground(new java.awt.Color(59, 59, 156));
        jButtonlogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonlogin.setForeground(new java.awt.Color(153, 255, 255));
        jButtonlogin.setText("Login");
        jButtonlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonloginMouseClicked(evt);
            }
        });
        jButtonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonloginActionPerformed(evt);
            }
        });
        Right.add(jButtonlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 343, 319, 49));

        jButtontosignin.setBackground(new java.awt.Color(203, 178, 107));
        jButtontosignin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtontosignin.setForeground(new java.awt.Color(59, 59, 156));
        jButtontosignin.setText("Don't have account yet?");
        jButtontosignin.setBorder(null);
        jButtontosignin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtontosigninMouseClicked(evt);
            }
        });
        Right.add(jButtontosignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 404, 319, 36));

        jCheckshowpass.setBackground(new java.awt.Color(203, 178, 107));
        jCheckshowpass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckshowpass.setForeground(new java.awt.Color(59, 59, 156));
        jCheckshowpass.setText("Show password");
        jCheckshowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckshowpassActionPerformed(evt);
            }
        });
        Right.add(jCheckshowpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 277, -1, -1));

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addComponent(Left, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Left, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addComponent(Right, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, 700, Short.MAX_VALUE)
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
        
        String encryptPassword = password;
        boolean usernameExist = false;
        boolean passmatched = false;

        try{
            BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\ADMIN\\Documents\\PostnHire\\Input.txt"));
            String line;
            
            while ((line = read.readLine()) != null){
                String[] parts = line.split(",");
                if (parts.length == 2){
                    String dataUsername = parts[0].trim();
                    String encryptedPassword = parts[1].trim();
                    
                    if (username.equals(dataUsername)){
                        usernameExist = true;
                        String decryptedPass = decrypt(encryptedPassword, Shift);
                        
                        if(encryptPassword.equals(decryptedPass)){
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

    private void jButtonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonloginActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed
    
     
    private String decrypt(String message, int key) {
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++){
            chars[i] -= key;
        }
        return new String(chars);   
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
    private javax.swing.JLabel Lcopyright;
    private javax.swing.JPanel Left;
    private javax.swing.JLabel Llogin;
    private javax.swing.JLabel Lname;
    private javax.swing.JLabel Lquote1;
    private javax.swing.JLabel Lquote2;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Right;
    private javax.swing.JButton jButtonlogin;
    private javax.swing.JButton jButtontosignin;
    private javax.swing.JCheckBox jCheckshowpass;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelpassword;
    private javax.swing.JLabel jLabelusername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextusername;
    // End of variables declaration//GEN-END:variables
}
