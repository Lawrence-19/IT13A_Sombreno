/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package PostnHire;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class ApplyJob extends javax.swing.JInternalFrame {

    
String Filename = null;

    public ApplyJob() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        this.setSize(564, 500);
       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LjobApp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Tjobapplied = new javax.swing.JTextField();
        Tfullname = new javax.swing.JTextField();
        Tresumepath = new javax.swing.JTextField();
        Tphonenum = new javax.swing.JTextField();
        Tcompanyname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Bupload = new javax.swing.JButton();
        Temail = new javax.swing.JTextField();
        Bsubmitapp = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(532, 500));

        jPanel1.setBackground(new java.awt.Color(203, 178, 107));

        LjobApp.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        LjobApp.setForeground(new java.awt.Color(59, 59, 156));
        LjobApp.setText("JOB APPLICATION");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(59, 59, 156));
        jLabel4.setText("Email Account:");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(59, 59, 156));
        jLabel5.setText("Full Name:");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(59, 59, 156));
        jLabel6.setText("Phone Number:");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(59, 59, 156));
        jLabel7.setText("Job Title:");

        Tjobapplied.setBackground(new java.awt.Color(153, 255, 255));
        Tjobapplied.setPreferredSize(new java.awt.Dimension(71, 20));

        Tfullname.setBackground(new java.awt.Color(153, 255, 255));
        Tfullname.setPreferredSize(new java.awt.Dimension(71, 20));
        Tfullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfullnameActionPerformed(evt);
            }
        });

        Tresumepath.setBackground(new java.awt.Color(153, 255, 255));
        Tresumepath.setPreferredSize(new java.awt.Dimension(71, 20));

        Tphonenum.setBackground(new java.awt.Color(153, 255, 255));
        Tphonenum.setPreferredSize(new java.awt.Dimension(71, 20));

        Tcompanyname.setBackground(new java.awt.Color(153, 255, 255));
        Tcompanyname.setPreferredSize(new java.awt.Dimension(71, 20));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(59, 59, 156));
        jLabel8.setText("Company Name: ");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(59, 59, 156));
        jLabel9.setText("Resume:");

        Bupload.setBackground(new java.awt.Color(153, 255, 255));
        Bupload.setForeground(new java.awt.Color(0, 0, 0));
        Bupload.setText("Upload");
        Bupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuploadActionPerformed(evt);
            }
        });

        Temail.setBackground(new java.awt.Color(153, 255, 255));
        Temail.setPreferredSize(new java.awt.Dimension(71, 20));

        Bsubmitapp.setBackground(new java.awt.Color(59, 59, 156));
        Bsubmitapp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bsubmitapp.setForeground(new java.awt.Color(203, 178, 107));
        Bsubmitapp.setText("Submit Application");
        Bsubmitapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BsubmitappMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(LjobApp))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Temail, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tcompanyname, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tjobapplied, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Bupload, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(Tresumepath, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Tphonenum, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 68, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(Bsubmitapp, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LjobApp)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Tjobapplied, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tcompanyname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Tfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Temail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tphonenum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tresumepath, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bupload, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(Bsubmitapp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
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
    
    
    private void BuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuploadActionPerformed
        //gi call ang JFileChooser nga variable
        JFileChooser choose = new JFileChooser();
        choose.showOpenDialog(null);
        File f = choose.getSelectedFile();
        Filename = f.getAbsolutePath();
        Tresumepath.setText(Filename);
    }//GEN-LAST:event_BuploadActionPerformed

    private void BsubmitappMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BsubmitappMouseClicked
        
        //gi call namo tanan inout area ani nga class
        //nag gamit ug trim para mawala ang excess nga spacing sa pinakauna ug pinakatumoy sa string
        String jobapplied = Tjobapplied.getText().trim();
        String companyname = Tcompanyname.getText().trim();
        String fullname = Tfullname.getText().trim();
        String email = Temail.getText().trim();
        String phone = Tphonenum.getText().trim();
        String resume = Tresumepath.getText().trim();

        //gi call namo ang file path sa application.txt into application nga variable
        String application = "C:\\Users\\ADMIN\\Documents\\PostnHire\\Application.txt";
        File userdata = new File(application);

        try (FileWriter applicatant = new FileWriter(userdata, true)) {
            applicatant.write("========== Applicantion Information ==========\n");
            applicatant.write("Job Applied:     " + jobapplied + "\n");
            applicatant.write("Company Name:    " + companyname + "\n"); 
            applicatant.write("Full Name:       " + fullname + "\n");
            applicatant.write("Email:           " + email + "\n");
            applicatant.write("Phone Number:    " + phone + "\n");
            applicatant.write("Resume Path:     " + resume + "\n");
            applicatant.write("-------------------------------------------------");
            
            JOptionPane.showMessageDialog(this, "Success");
            Tjobapplied.setText("");
            Tcompanyname.setText("");
            Tfullname.setText("");
            Temail.setText("");
            Tphonenum.setText("");
            Tresumepath.setText("");
                    
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving Application");
        }
    }//GEN-LAST:event_BsubmitappMouseClicked

    private void TfullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfullnameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bsubmitapp;
    private javax.swing.JButton Bupload;
    private javax.swing.JLabel LjobApp;
    private javax.swing.JTextField Tcompanyname;
    private javax.swing.JTextField Temail;
    private javax.swing.JTextField Tfullname;
    private javax.swing.JTextField Tjobapplied;
    private javax.swing.JTextField Tphonenum;
    private javax.swing.JTextField Tresumepath;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
