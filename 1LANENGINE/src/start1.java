


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shree pc
 */
public class start1 extends javax.swing.JFrame {

    /**
     * Creates new form start1
     */
    String person;
    String ip;
    String rollno2;
   public start1(String ip,String name,String rollno)
    {
        initComponents();
        this.ip=ip;
        person=name;
        this.rollno2=rollno;
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    int sw=(int)(d.getWidth());
    int sh=(int)(d.getHeight());
      setBounds(0,0,sw,sh);
    jComboBox1.setOpaque(false);
    jComboBox1.setBackground(new Color(0,0,0,128));
name1.setOpaque(false);
    name1.setBackground(new Color(0,0,0,128));
rollno1.setOpaque(false);
    rollno1.setBackground(new Color(0,0,0,128));
name1.setText(person);
rollno1.setText(rollno2);
instructions1.setOpaque(false);
    instructions1.setBackground(new Color(0,0,0,128));
    instructions.setBackground(new Color(0,0,0,128));
  instructions.getViewport().setOpaque(false);
instructions.setOpaque(false);
instructions1.setText("Welcome to the Exam Portal :\n\n"+"There are 4 rounds to test your skills, you can select any of them by \n"+"clicking on it and proceed \n\n"+"PRACTICE\n"+"You can to get in touch with the type of questions and get familiar\n"+"with the portal\n\n"+"APTITUDE\n"+"Questions are designed here to test your reasoning ang thinking skills.\n"+"you will have 30 questions and 60 mins of time\n\n"+"TECHNICAL\n"+"This round will test your technical skills of your core subjects.\n"+"It will have 20 questions and 120 mins.\n\n"+"QUESTION BANK\n"+"This round has all the questions asked in previous year papers.");
            
    
    
    }
    public start1()
    {
        initComponents();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    int sw=(int)(d.getWidth());
    int sh=(int)(d.getHeight());
      setBounds(0,0,sw,sh);
     
    jComboBox1.setOpaque(false);
    jComboBox1.setBackground(new Color(0,0,0,128));
name1.setOpaque(false);
    name1.setBackground(new Color(0,0,0,128));
rollno1.setOpaque(false);
    rollno1.setBackground(new Color(0,0,0,128));
name1.setText("NOT KNOWN");
rollno1.setText("1502910134");
instructions1.setOpaque(false);
    instructions1.setBackground(new Color(0,0,0,128));
    instructions.setBackground(new Color(0,0,0,128));
  instructions.getViewport().setOpaque(false);
instructions.setOpaque(false);
instructions1.setText("Welcome to the Exam Portal :\n\n"+"There are 4 rounds to test your skills, you can select any of them by \n"+"clicking on it and proceed \n\n"+"PRACTICE\n"+"You can to get in touch with the type of questions and get familiar\n"+"with the portal\n\n"+"APTITUDE\n"+"Questions are designed here to test your reasoning ang thinking skills.\n"+"you will have 30 questions and 60 mins of time\n\n"+"TECHNICAL\n"+"This round will test your technical skills of your core subjects.\n"+"It will have 20 questions and 120 mins.\n\n"+"QUESTION BANK\n"+"This round has all the questions asked in previous year papers.");
        System.out.println(instructions1.getText());       
    
    
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        aptitude = new javax.swing.JLabel();
        aptitude2 = new javax.swing.JLabel();
        rollno1 = new javax.swing.JTextField();
        rollno = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        aptitude3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        branch = new javax.swing.JLabel();
        branch1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        watermark = new javax.swing.JLabel();
        instructions = new javax.swing.JScrollPane();
        instructions1 = new javax.swing.JTextArea();
        name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        aptitude1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        jComboBox1.setBackground(new java.awt.Color(128, 128, 128));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(204, 204, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "COMPUTER SCIENCE AND ENGINEERING", "ELECTRICAL ENGINEERING", "ELECTRONICS AND COMMUNICATION ENGINEERING", "INFORMATION TECHNOLOGY", "MECHANICAL ENGINEERING", "CIVIL ENGINEERING" }));
        jComboBox1.setOpaque(false);
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(10, 170, 580, 40);

        aptitude.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 36)); // NOI18N
        aptitude.setForeground(new java.awt.Color(204, 204, 204));
        aptitude.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aptitude.setText("PRACTICE");
        aptitude.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        aptitude.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aptitude.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aptitudeMouseClicked(evt);
            }
        });
        jPanel1.add(aptitude);
        aptitude.setBounds(1040, 50, 270, 110);

        aptitude2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 36)); // NOI18N
        aptitude2.setForeground(new java.awt.Color(204, 204, 204));
        aptitude2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aptitude2.setText("QUES BANK");
        aptitude2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        aptitude2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aptitude2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aptitude2MouseClicked(evt);
            }
        });
        jPanel1.add(aptitude2);
        aptitude2.setBounds(1040, 590, 270, 110);

        rollno1.setEditable(false);
        rollno1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rollno1.setForeground(new java.awt.Color(204, 204, 255));
        rollno1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rollno1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        rollno1.setOpaque(false);
        rollno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollno1ActionPerformed(evt);
            }
        });
        jPanel1.add(rollno1);
        rollno1.setBounds(170, 70, 280, 40);

        rollno.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        rollno.setForeground(new java.awt.Color(204, 204, 255));
        rollno.setText("ROLL NO :");
        jPanel1.add(rollno);
        rollno.setBounds(10, 80, 125, 32);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/if_brightness_1055105.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(880, 220, 130, 130);

        aptitude3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 36)); // NOI18N
        aptitude3.setForeground(new java.awt.Color(204, 204, 204));
        aptitude3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aptitude3.setText("TECHNICAL");
        aptitude3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        aptitude3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aptitude3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aptitude3MouseClicked(evt);
            }
        });
        jPanel1.add(aptitude3);
        aptitude3.setBounds(1040, 410, 270, 110);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/if_Robot_02_385832.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(880, 400, 130, 130);

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LOGOUT");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(650, 20, 130, 40);

        branch.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        branch.setForeground(new java.awt.Color(204, 204, 255));
        branch.setText("INSTRUCTIONS:");
        jPanel1.add(branch);
        branch.setBounds(10, 230, 200, 32);

        branch1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        branch1.setForeground(new java.awt.Color(204, 204, 255));
        branch1.setText("SELECT BRANCH:");
        jPanel1.add(branch1);
        branch1.setBounds(10, 140, 220, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/if_document_532733.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(880, 580, 128, 130);

        watermark.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        watermark.setText("TEAM NEWNETIC™");
        jPanel1.add(watermark);
        watermark.setBounds(1170, 730, 180, 30);

        instructions1.setEditable(false);
        instructions1.setColumns(20);
        instructions1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        instructions1.setForeground(new java.awt.Color(204, 204, 255));
        instructions1.setRows(5);
        instructions.setViewportView(instructions1);

        jPanel1.add(instructions);
        instructions.setBounds(10, 270, 680, 460);

        name.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        name.setForeground(new java.awt.Color(204, 204, 255));
        name.setText("NAME :");
        jPanel1.add(name);
        name.setBounds(10, 20, 100, 32);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/if_Mind-Map-Paper_379340.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(880, 40, 128, 130);

        name1.setEditable(false);
        name1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name1.setForeground(new java.awt.Color(204, 204, 255));
        name1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        name1.setOpaque(false);
        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });
        jPanel1.add(name1);
        name1.setBounds(170, 10, 280, 40);

        aptitude1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 36)); // NOI18N
        aptitude1.setForeground(new java.awt.Color(204, 204, 204));
        aptitude1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aptitude1.setText("APTITUDE");
        aptitude1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        aptitude1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aptitude1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aptitude1MouseClicked(evt);
            }
        });
        jPanel1.add(aptitude1);
        aptitude1.setBounds(1040, 230, 270, 110);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/1920x1080-indigo-web-solid-color-background.jpg"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 1370, 770);

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

    private void aptitudeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aptitudeMouseClicked
    String branch=aptitude.getText();   
        test obj=new test(ip,branch,person,rollno2,branch);
     obj.setVisible(true);
     this.setVisible(false);
    
    }//GEN-LAST:event_aptitudeMouseClicked

    private void aptitude1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aptitude1MouseClicked
      String branch=aptitude1.getText();
        test obj=new test(ip,branch,person,rollno2,branch);
     obj.setVisible(true);
     this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_aptitude1MouseClicked

    private void aptitude2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aptitude2MouseClicked
 
        String branch=aptitude2.getText();
        test obj=new test(ip,branch,person,rollno2,branch);
     obj.setVisible(true);
     this.setVisible(false);
            // TODO add your handling code here:
    }//GEN-LAST:event_aptitude2MouseClicked

    private void aptitude3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aptitude3MouseClicked
 String branch=jComboBox1.getSelectedItem().toString();
 String title=aptitude3.getText();
        test obj=new test(ip,branch,person,rollno2,title);
     obj.setVisible(true);
     this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_aptitude3MouseClicked

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

    private void rollno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rollno1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
     String branch=aptitude.getText();
        test obj=new test(ip,branch,person,rollno2,branch);
     obj.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
String branch=aptitude1.getText();
        test obj=new test(ip,branch,person,rollno2,branch);
     obj.setVisible(true);
     this.setVisible(false);
            // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
  String branch=jComboBox1.getSelectedItem().toString();
  String title=aptitude3.getText();
        test obj=new test(ip,branch,person,rollno2,title);
     obj.setVisible(true);
     this.setVisible(false);
            // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
String branch=aptitude2.getText();
        test obj=new test(ip,branch,person,rollno2,branch);
     obj.setVisible(true);
     this.setVisible(false);
            // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new Instruction1(ip).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(start1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(start1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(start1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(start1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new start1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aptitude;
    private javax.swing.JLabel aptitude1;
    private javax.swing.JLabel aptitude2;
    private javax.swing.JLabel aptitude3;
    private javax.swing.JLabel branch;
    private javax.swing.JLabel branch1;
    private javax.swing.JScrollPane instructions;
    private javax.swing.JTextArea instructions1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField name1;
    private javax.swing.JLabel rollno;
    private javax.swing.JTextField rollno1;
    private javax.swing.JLabel watermark;
    // End of variables declaration//GEN-END:variables
}
