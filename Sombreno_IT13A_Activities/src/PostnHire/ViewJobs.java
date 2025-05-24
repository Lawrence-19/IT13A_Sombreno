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
       this.setSize(564, 500);
        loadjobs();
        appliedjobs();
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pmain = new javax.swing.JPanel();
        SPpostedjobs = new javax.swing.JScrollPane();
        Tpostedjobs = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tappliedarea = new javax.swing.JTextArea();

        setBorder(null);

        Pmain.setBackground(new java.awt.Color(203, 178, 107));

        Tpostedjobs.setBackground(new java.awt.Color(153, 255, 255));
        Tpostedjobs.setColumns(20);
        Tpostedjobs.setRows(5);
        SPpostedjobs.setViewportView(Tpostedjobs);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(59, 59, 156));
        jLabel1.setText("Posted Jobs");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(59, 59, 156));
        jLabel2.setText("Applied Jobs");

        Tappliedarea.setBackground(new java.awt.Color(153, 255, 255));
        Tappliedarea.setColumns(20);
        Tappliedarea.setRows(5);
        jScrollPane1.setViewportView(Tappliedarea);

        javax.swing.GroupLayout PmainLayout = new javax.swing.GroupLayout(Pmain);
        Pmain.setLayout(PmainLayout);
        PmainLayout.setHorizontalGroup(
            PmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PmainLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PmainLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(PmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PmainLayout.createSequentialGroup()
                        .addGroup(PmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(SPpostedjobs, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PmainLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(187, 187, 187))))
        );
        PmainLayout.setVerticalGroup(
            PmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PmainLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPpostedjobs, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void loadjobs(){
        //gi call nato ang jobs.txt
        String path = "C:\\Users\\ADMIN\\Documents\\PostnHire\\jobs.txt";
        File jobFiles = new File(path);//gi named nato ang path to jobFiles
        
        
        //diari basahon ang jobfiles nga variable
        try(BufferedReader read = new BufferedReader(new FileReader(jobFiles))){
            StringBuilder content = new StringBuilder();
            String line;
            while((line = read.readLine()) != null){
                content.append(line).append("\n");
               
            }
            Tpostedjobs.setText(content.toString());//gi butang sa Tpostedjobs ang content
            
        }catch (IOException e){
            JOptionPane.showMessageDialog(this, "Error Reading File");
        }
    }

    private void appliedjobs(){
        
        //gi call nato ang application.txt
        String path = "C:\\Users\\ADMIN\\Documents\\PostnHire\\Application.txt";
        File docfiles = new File(path);
        
        
        try(BufferedReader read = new BufferedReader(new FileReader(docfiles))){
            StringBuilder content = new StringBuilder();
            String line;
            while((line = read.readLine()) != null){
                content.append(line).append("\n");
               
            }
            Tappliedarea.setText(content.toString());
        }catch (IOException e){
            JOptionPane.showMessageDialog(this, "Error Reading File");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pmain;
    private javax.swing.JScrollPane SPpostedjobs;
    private javax.swing.JTextArea Tappliedarea;
    private javax.swing.JTextArea Tpostedjobs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
