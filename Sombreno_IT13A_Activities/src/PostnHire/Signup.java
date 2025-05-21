
package PostnHire;


import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Signup extends javax.swing.JFrame {

static final int Shift = 3;

    public Signup() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelleft = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelright = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtextusername = new javax.swing.JTextField();
        jnewPassword = new javax.swing.JPasswordField();
        jButtonsignup = new javax.swing.JButton();
        jLabelnewpassword = new javax.swing.JLabel();
        jCheckshowpass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelleft.setBackground(new java.awt.Color(59, 59, 156));
        jPanelleft.setPreferredSize(new java.awt.Dimension(250, 188));
        jPanelleft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(203, 178, 107));
        jLabel3.setText("Sign Up");
        jPanelleft.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        jLabel5.setForeground(new java.awt.Color(153, 255, 255));
        jLabel5.setText(" © 2025 POSTnHIRE - All Rights Reserved");
        jPanelleft.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 255));
        jLabel4.setText("“Where Opportunities Meet Talent”");
        jPanelleft.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 255));
        jLabel6.setText("“Post Jobs. Hire Talent. Fast.”");
        jPanelleft.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jPanel2.setBackground(new java.awt.Color(203, 178, 107));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(194, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelleft.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 200, 3));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(203, 178, 107));
        jLabel2.setText("POSTnHIRE");
        jLabel2.setFocusTraversalPolicyProvider(true);
        jPanelleft.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jPanelright.setBackground(new java.awt.Color(203, 178, 107));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(59, 59, 156));
        jLabel1.setText("New Username");

        jtextusername.setBackground(new java.awt.Color(255, 255, 255));
        jtextusername.setForeground(new java.awt.Color(51, 51, 51));
        jtextusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextusernameActionPerformed(evt);
            }
        });

        jnewPassword.setBackground(new java.awt.Color(255, 255, 255));
        jnewPassword.setForeground(new java.awt.Color(51, 51, 51));

        jButtonsignup.setBackground(new java.awt.Color(59, 59, 156));
        jButtonsignup.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonsignup.setForeground(new java.awt.Color(204, 255, 255));
        jButtonsignup.setText("Sign up");
        jButtonsignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonsignupMouseClicked(evt);
            }
        });

        jLabelnewpassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelnewpassword.setForeground(new java.awt.Color(59, 59, 156));
        jLabelnewpassword.setText("New Password");

        jCheckshowpass.setBackground(new java.awt.Color(203, 178, 107));
        jCheckshowpass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckshowpass.setForeground(new java.awt.Color(59, 59, 156));
        jCheckshowpass.setText("Show password");
        jCheckshowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckshowpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelrightLayout = new javax.swing.GroupLayout(jPanelright);
        jPanelright.setLayout(jPanelrightLayout);
        jPanelrightLayout.setHorizontalGroup(
            jPanelrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelrightLayout.createSequentialGroup()
                .addGroup(jPanelrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelrightLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButtonsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelrightLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanelrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelnewpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckshowpass)
                                .addGroup(jPanelrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jtextusername, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                    .addComponent(jnewPassword))))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanelrightLayout.setVerticalGroup(
            jPanelrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelrightLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtextusername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabelnewpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jnewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckshowpass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jButtonsignup)
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelleft, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelright, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelleft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonsignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonsignupMouseClicked
        
        //Gi convert namo si jtextusername ug jnewPassword into string para
        // macall nato ang variable sa fileWriter//
        String username = jtextusername.getText().trim();
        String newpassword = new String(jnewPassword.getPassword()).trim();
        
        //if ever nga natuplok ni user ang button unya walay sulod ang username ug password//
        if (username.isEmpty() || newpassword.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please input Your Username and Password", "Error", JOptionPane.ERROR_MESSAGE);
        
        }
        
        //Encryption gamit ang Caesar Cipher
        String encryptPass = encryptCaesar(newpassword,Shift);
        
        //Ma saved ang gibutang nga credential ni user
        try{
           FileWriter credits = new java.io.FileWriter("C:\\Users\\ADMIN\\Documents\\PostnHire\\Input.txt", true);
           credits.write(username + ", " + encryptPass + "\n");
           credits.close();
           
           //mo pop up dayun nga na saved na ang account sa user
           JOptionPane.showMessageDialog(this, "Account Saved", "Sign up", JOptionPane.INFORMATION_MESSAGE);
           
                   }catch (IOException e){
                       JOptionPane.showMessageDialog(this, "Error Saving Account", "Error", JOptionPane.ERROR_MESSAGE);
                   }
        
        //maredirect dayun sa Login nga jrame
        Login log = new Login();
        log.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_jButtonsignupMouseClicked

    private void jCheckshowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckshowpassActionPerformed
        if (jCheckshowpass.isSelected()){
            jnewPassword.setEchoChar((char) 0); // ma visible ang password
        }else{
            jnewPassword.setEchoChar('*');//ma tago ang password
        }
    }//GEN-LAST:event_jCheckshowpassActionPerformed

    private void jtextusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextusernameActionPerformed
    private String encryptCaesar(String message, int key) {
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++){
            chars[i] += key;
        }
        return new String(chars);   
    }
        
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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonsignup;
    private javax.swing.JCheckBox jCheckshowpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelnewpassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelleft;
    private javax.swing.JPanel jPanelright;
    private javax.swing.JPasswordField jnewPassword;
    private javax.swing.JTextField jtextusername;
    // End of variables declaration//GEN-END:variables
}
