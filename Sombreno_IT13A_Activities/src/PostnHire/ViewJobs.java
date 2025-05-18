/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package PostnHire;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;



public class ViewJobs extends javax.swing.JInternalFrame {

    
    
    public ViewJobs() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI User = (BasicInternalFrameUI)this.getUI();
        User.setNorthPane(null);
        setSize(532, 500);
        loadjobs();
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPostJobs = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        TjobArea = new javax.swing.JTextArea();

        setBorder(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jPostJobs.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jPostJobs.setForeground(new java.awt.Color(204, 255, 255));
        jPostJobs.setText("POSTED JOBS");

        jScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane.setForeground(new java.awt.Color(0, 0, 0));

        TjobArea.setBackground(new java.awt.Color(153, 255, 255));
        TjobArea.setColumns(20);
        TjobArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TjobArea.setForeground(new java.awt.Color(0, 0, 0));
        TjobArea.setRows(5);
        jScrollPane.setViewportView(TjobArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jPostJobs)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPostJobs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
    
    private void loadjobs(){
        String path = "C:\\Users\\ADMIN\\Documents\\PostnHire\\jobs.txt";
        File jobFiles = new File(path);
        
        //show if the job didn't exist
        if(!jobFiles.exists()){
            JOptionPane.showMessageDialog(this, "No job posted yet");
            return;       
        }
        
        try(BufferedReader read = new BufferedReader(new FileReader(jobFiles))){
            StringBuilder content = new StringBuilder();
            String line;
            while((line = read.readLine()) != null){
                content.append(line).append("\n");
            }
            TjobArea.setText(content.toString());
        }catch (IOException e){
            JOptionPane.showMessageDialog(this, "Error Reading File");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TjobArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPostJobs;
    private javax.swing.JScrollPane jScrollPane;
    // End of variables declaration//GEN-END:variables
}
