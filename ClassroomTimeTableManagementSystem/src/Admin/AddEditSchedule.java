package Admin;

import classes.Schedule;


/**
 *
 * @author Asus 
 */

import javax.swing.JOptionPane;


public class AddEditSchedule extends javax.swing.JFrame {

    /**
     * Creates new form UserSettings
     */
    public AddEditSchedule() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jSpinQuan = new javax.swing.JSpinner();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(450, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(450, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Seats");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 190, 20));

        jSpinQuan.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jSpinQuan.setBorder(null);
        getContentPane().add(jSpinQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 140, 30));

        jComboBox3.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(64, 134, 200));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10.00AM", "12.00AM", "2.00PM", "12.30AM", "2.30AM" }));
        jComboBox3.setBorder(null);
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 140, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("End Time");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 190, 20));

        jComboBox2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(64, 134, 200));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8.00AM", "10.00AM", "12.00AM", "12.30AM", "2.30AM" }));
        jComboBox2.setBorder(null);
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 140, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Start Time");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 190, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Classroom");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 190, 20));

        jComboBox1.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(64, 134, 200));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cls1", "cls2", "cls3", "cls4", "cls5" }));
        jComboBox1.setBorder(null);
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 140, 30));

        jButton5.setBackground(new java.awt.Color(38, 106, 169));
        jButton5.setFont(new java.awt.Font("Poppins Medium", 0, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        jButton5.setText("Update");
        jButton5.setAlignmentY(0.0F);
        jButton5.setBorder(null);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 110, 40));

        jButton6.setBackground(new java.awt.Color(38, 106, 169));
        jButton6.setFont(new java.awt.Font("Poppins Medium", 0, 15)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        jButton6.setText("Delete");
        jButton6.setAlignmentY(0.0F);
        jButton6.setBorder(null);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 110, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Faculty ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 190, 20));

        jTextField3.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(64, 134, 200));
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 140, 30));

        jTextField2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(64, 134, 200));
        jTextField2.setBorder(null);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 140, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Subject Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 190, 20));

        jTextField1.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(64, 134, 200));
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 140, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Subject Code");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 180, 20));

        jButton4.setBackground(new java.awt.Color(38, 106, 169));
        jButton4.setFont(new java.awt.Font("Poppins Medium", 0, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        jButton4.setText("Add");
        jButton4.setAlignmentY(0.0F);
        jButton4.setBorder(null);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 80, 40));

        jButton1.setBackground(new java.awt.Color(237, 30, 121));
        jButton1.setFont(new java.awt.Font("Poppins Medium", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.setAlignmentY(0.0F);
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 80, 40));

        jLabel2.setBackground(new java.awt.Color(237, 30, 121));
        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add Schedule");
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg-08.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(450, 650));
        jLabel1.setMinimumSize(new java.awt.Dimension(450, 650));
        jLabel1.setPreferredSize(new java.awt.Dimension(450, 650));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 460, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.toBack();
        setVisible(false);
        new Schedules().toFront();
        new Schedules().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       
        String faculty = jTextField3.getText().toLowerCase();
        String classroom = jComboBox2.getSelectedItem().toString();
        int startTime = Integer.parseInt(jComboBox1.getSelectedItem().toString());
        int endtTime = Integer.parseInt(jComboBox3.getSelectedItem().toString());
        String subCode = jTextField1.getText();
        String subName = jTextField2.getText().toLowerCase();
        int seat = ((Integer) jSpinQuan.getValue());
        
        Schedule obj = new Schedule();
        
        obj.createSchedule(subCode, subName, seat, subName, subName, classroom, faculty);
        
        //boolean show = obj.show(subCode, subName, seat, startTime, endtTime, classroom, faculty);
        
        //if ( show ){
          //  obj.update(subCode, subName, seat);
        //}
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    /**public void display ( String subCode, String subName, int seat ) {
        
        jTextField1.setText(subCode);
        jTextField2.setText(subName);
        Spinner1.setValue(seat);
        
    }**/
    
   /** public void subDisplay ( String faculty, String subject ){
        
        jTextField3.setText(faculty);
        jTextField2.setText(subject);
        
    }**/
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        String classroom = jComboBox1.getSelectedItem().toString();
        String startTime = jComboBox2.getSelectedItem().toString();
        String endtTime =jComboBox3.getSelectedItem().toString();
        String subCode = jTextField1.getText();
        String subName = jTextField2.getText().toLowerCase();
        String faculty = jTextField3.getText().toLowerCase();
        int seat = ((Integer) jSpinQuan.getValue());
       
        Schedule obja = new Schedule();
        
        boolean createSc = obja.createSchedule(subCode, subName, seat, startTime, endtTime, classroom, faculty);
        
        if (createSc){
            JOptionPane.showMessageDialog(null, "Schedule added successfully!!");
        }
        else {
            //JOptionPane.showMessageDialog(null,"SQL Connection failed!");
        }
        
        
        /**Schedule obj = new Schedule();
        
        if ( subCode.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Schedule cration failed");
        }
        else if ( subName.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Schedule cration failed");
        }
        else if ( faculty.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Schedule cration failed");
        }
        else {
             boolean create = obj.addSubject(faculty, subName, subCode);
            
             if ( create ){
                JOptionPane.showMessageDialog(null, "Scedule added successfully!!"); 
            }
            else {
                JOptionPane.showMessageDialog(null, "Schedule cration failed");
            }
        }**/
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String subCode = jTextField1.getText();
        String subName = jTextField2.getText().toLowerCase();
        String faculty = jTextField3.getText().toLowerCase();
        int seat = ((Integer) jSpinQuan.getValue());
        String classroom = jComboBox1.getSelectedItem().toString();
        String startTime = jComboBox2.getSelectedItem().toString();
        String endtTime = jComboBox3.getSelectedItem().toString();
        
        Schedule obj = new Schedule();
        
        boolean show = obj.show(subCode, subName, seat, subName, subName, classroom, faculty);
        
        if ( show ) {
            
            boolean delete = obj.delete( startTime, endtTime, classroom, faculty);
        
            if ( delete ){
                    JOptionPane.showMessageDialog(null, "Deleted successfully! ");
            } 
            else {
                    JOptionPane.showMessageDialog(null, "Deleting failed!"); 
            }
            
        }
        
        //SUBJECTS
        
        /**String subCodes = jTextField1.getText().toLowerCase();
        
        if ( obj.checkSubject(subCodes)){
            
            if ( obj.deleteSubject(subCode) ){
                JOptionPane.showMessageDialog(null, "Deletion Successfull!!");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Deletion Successfull!!");
        }**/
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(AddEditUSers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEditUSers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEditUSers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEditUSers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEditSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinQuan;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
