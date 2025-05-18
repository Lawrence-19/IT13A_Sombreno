
package PostnHire;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.io.*;
import java.io.FileWriter;

public class PostJob extends javax.swing.JInternalFrame {

    
    public PostJob() {
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI user = (BasicInternalFrameUI)this.getUI();
        user.setNorthPane(null);
        initComponents();
        setSize(532, 500);
       
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Ljobtitle = new javax.swing.JLabel();
        Ljobtitle1 = new javax.swing.JLabel();
        Tjobdescription = new javax.swing.JTextField();
        Tjobtitle = new javax.swing.JTextField();
        BpostJob = new javax.swing.JButton();
        JLjobtitle = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setPreferredSize(new java.awt.Dimension(532, 500));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(532, 500));

        Ljobtitle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Ljobtitle.setForeground(new java.awt.Color(102, 102, 255));
        Ljobtitle.setText("Job Description:");

        Ljobtitle1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Ljobtitle1.setForeground(new java.awt.Color(102, 102, 255));
        Ljobtitle1.setText("Job Title:");

        Tjobdescription.setBackground(new java.awt.Color(255, 255, 255));
        Tjobdescription.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Tjobdescription.setForeground(new java.awt.Color(0, 0, 0));
        Tjobdescription.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        Tjobtitle.setBackground(new java.awt.Color(255, 255, 255));
        Tjobtitle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Tjobtitle.setForeground(new java.awt.Color(0, 0, 0));
        Tjobtitle.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        BpostJob.setBackground(new java.awt.Color(102, 102, 255));
        BpostJob.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BpostJob.setForeground(new java.awt.Color(204, 255, 255));
        BpostJob.setText("Post Job");
        BpostJob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BpostJobMouseClicked(evt);
            }
        });

        JLjobtitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        JLjobtitle.setForeground(new java.awt.Color(102, 102, 255));
        JLjobtitle.setText("CREATE JOB");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ljobtitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ljobtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tjobtitle, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(Tjobdescription)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(BpostJob, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(JLjobtitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(JLjobtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ljobtitle1)
                    .addComponent(Tjobtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ljobtitle)
                    .addComponent(Tjobdescription, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(BpostJob, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BpostJobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BpostJobMouseClicked
        String jobTitle = Tjobtitle.getText().trim();
        String jobDesc = Tjobdescription.getText().trim();
        
        //if walay sulod and textarea
        if (jobTitle.isEmpty() || jobDesc.isEmpty()){
            JOptionPane.showMessageDialog(this, "please fill in the details");
        }
        
        String jobs = "C:\\Users\\ADMIN\\Documents\\PostnHire\\jobs.txt";
        File jobfile = new File(jobs);
        
        
        try(FileWriter data = new FileWriter(jobfile,true)){
           data.write("==== Job Post ====\n");
           data.write("Title: " + jobTitle + "\n");
           data.write("description: " + jobDesc + "\n");
           data.write("------------------\n");
            
           JOptionPane.showMessageDialog(this, "Job Posted");
           Tjobtitle.setText("");
           Tjobdescription.setText("");
            
        }catch (IOException e){
            JOptionPane.showMessageDialog(this, "Error saving job");
        }
        
    }//GEN-LAST:event_BpostJobMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BpostJob;
    private javax.swing.JLabel JLjobtitle;
    private javax.swing.JLabel Ljobtitle;
    private javax.swing.JLabel Ljobtitle1;
    private javax.swing.JTextField Tjobdescription;
    private javax.swing.JTextField Tjobtitle;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
