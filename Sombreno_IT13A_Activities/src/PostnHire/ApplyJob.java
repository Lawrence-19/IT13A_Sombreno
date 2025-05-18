/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package PostnHire;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;



public class ApplyJob extends javax.swing.JInternalFrame {

private String selectedJob;
    
    public ApplyJob() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
       
        DefaultListModel<String> jobListModel = new DefaultListModel<>();
        Tjoblist.setModel(jobListModel);
        loadJobs(jobListModel);
        
        if(selectedJob != null && !selectedJob.isEmpty()){
            for(int i = 0; i < jobListModel.size(); i++){
                if(jobListModel.get(i).equals(selectedJob)){
                Tjoblist.setSelectedIndex(i);
                break;
                }
            }
        }
    }
    
    private void loadJobs(DefaultListModel<String> model){
        String path = "C:\\Users\\ADMIN\\Documents\\PostnHire\\jobs.txt";
        File jobFile = new File(path);
        
        if (!jobFile.exists()){
            JOptionPane.showMessageDialog(this, "Job list not found");
            return;
        }
        
        try(BufferedReader read = new BufferedReader(new FileReader(jobFile))) {
            String line;
            while ((line = read.readLine()) != null){
                if(!line.trim().isEmpty()){
                    model.addElement(line.trim());
                }
            }
        }catch (IOException e){
            JOptionPane.showMessageDialog(this, "Error loading job list");
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LjobApp = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(532, 500));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        LjobApp.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LjobApp.setForeground(new java.awt.Color(102, 102, 255));
        LjobApp.setText("JOB APPLICATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(LjobApp)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LjobApp)
                .addContainerGap(409, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LjobApp;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
