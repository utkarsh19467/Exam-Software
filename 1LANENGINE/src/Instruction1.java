
import java.awt.Color;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shree pc
 */
public class Instruction1 extends javax.swing.JFrame {

    /**
     * Creates new form Instruction1
     */
    public Instruction1() {
        
        initComponents();
    inst.setVisible(false);
    inst.setOpaque(false);
     inst.setBackground(new Color(0,0,0,128));
    inst2.setVisible(false);// TODO add your handling code here:
inst1.setVisible(false);// TODO add your handling code here:
inst1.setOpaque(false);
     inst1.setBackground(new Color(0,0,0,128));
    inst2.setOpaque(false);
     inst2.setBackground(new Color(0,0,0,128));
  usertext.setOpaque(false);
     usertext.setBackground(new Color(0,0,0,128));
    usertext1.setOpaque(false);
     usertext1.setBackground(new Color(0,0,0,128));
    usertext2.setOpaque(false);
     usertext2.setBackground(new Color(0,0,0,128));
     usertext2.setVisible(false);
    error1.setVisible(false);
    jLabel16.setVisible(false);
   
    }
    String ip;
    
    public Instruction1(String ip) {
        this.ip=ip;
        System.out.println(ip);
        initComponents();
    usertext.setOpaque(false);
     usertext.setBackground(new Color(0,0,0,128));
    usertext1.setOpaque(false);
     usertext1.setBackground(new Color(0,0,0,128));
    usertext2.setOpaque(false);
     usertext2.setBackground(new Color(0,0,0,128));
    
        inst.setVisible(false);
    inst.setOpaque(false);
     inst.setBackground(new Color(0,0,0,128));
    inst2.setVisible(false);// TODO add your handling code here:
inst1.setVisible(false);// TODO add your handling code here:
inst1.setOpaque(false);
     inst1.setBackground(new Color(0,0,0,128));
    inst2.setOpaque(false);
     inst2.setBackground(new Color(0,0,0,128));
    usertext2.setVisible(false);
    error1.setVisible(false);
    jLabel16.setVisible(false);
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
        signup = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inst2 = new javax.swing.JTextField();
        inst1 = new javax.swing.JTextField();
        signup1 = new javax.swing.JLabel();
        inst = new javax.swing.JTextField();
        watermark = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();
        usertext1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        usertext = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        usertext2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/if_humans_1216581.png"))); // NOI18N
        signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
        });
        jPanel1.add(signup);
        signup.setBounds(410, 200, 130, 130);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/if_Mind-Map-Paper_379340.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(780, 440, 130, 140);

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SIGNUP");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(560, 240, 110, 40);

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LOGIN");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(920, 240, 100, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/if_brightness_1055105.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(410, 440, 130, 140);

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("INSTRUCTIONS");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(930, 490, 192, 34);

        inst2.setEditable(false);
        inst2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        inst2.setForeground(new java.awt.Color(204, 204, 255));
        inst2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inst2.setText("Already Registered?? Login then !");
        inst2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inst2ActionPerformed(evt);
            }
        });
        jPanel1.add(inst2);
        inst2.setBounds(780, 350, 350, 40);

        inst1.setEditable(false);
        inst1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        inst1.setForeground(new java.awt.Color(204, 204, 255));
        inst1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inst1.setText("New User ?? Start here by signing up !");
        inst1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        inst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inst1ActionPerformed(evt);
            }
        });
        jPanel1.add(inst1);
        inst1.setBounds(400, 350, 360, 40);

        signup1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/arrow-back-1-icon.png"))); // NOI18N
        signup1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup1MouseClicked(evt);
            }
        });
        jPanel1.add(signup1);
        signup1.setBounds(770, 200, 130, 130);

        inst.setEditable(false);
        inst.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        inst.setForeground(new java.awt.Color(204, 204, 255));
        inst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inst.setText("Give Us Yor FeedBack!");
        inst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instActionPerformed(evt);
            }
        });
        jPanel1.add(inst);
        inst.setBounds(400, 590, 370, 40);

        watermark.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        watermark.setText("TEAM NEWNETIC™");
        jPanel1.add(watermark);
        watermark.setBounds(1170, 730, 180, 30);

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 100)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("LETS GET STARTED");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(260, 10, 940, 110);

        error1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/if_3_330411(1).png"))); // NOI18N
        error1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                error1MouseClicked(evt);
            }
        });
        jPanel1.add(error1);
        error1.setBounds(30, 550, 64, 64);

        usertext1.setEditable(false);
        usertext1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        usertext1.setForeground(new java.awt.Color(255, 255, 255));
        usertext1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usertext1.setText("SUBMIT CODE");
        usertext1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        usertext1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usertext1.setOpaque(false);
        usertext1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usertext1MouseClicked(evt);
            }
        });
        usertext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertext1ActionPerformed(evt);
            }
        });
        jPanel1.add(usertext1);
        usertext1.setBounds(30, 440, 320, 40);

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FEEDBACK");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(560, 490, 133, 34);

        usertext.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 80)); // NOI18N
        usertext.setForeground(new java.awt.Color(255, 255, 255));
        usertext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usertext.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        usertext.setOpaque(false);
        usertext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertextActionPerformed(evt);
            }
        });
        jPanel1.add(usertext);
        usertext.setBounds(30, 320, 320, 110);

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("wrong code try again");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(100, 560, 260, 40);

        usertext2.setEditable(false);
        usertext2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        usertext2.setForeground(new java.awt.Color(255, 255, 255));
        usertext2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usertext2.setText("Code verified ! Click here to Proceed !");
        usertext2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        usertext2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usertext2.setOpaque(false);
        usertext2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usertext2MouseClicked(evt);
            }
        });
        usertext2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertext2ActionPerformed(evt);
            }
        });
        jPanel1.add(usertext2);
        usertext2.setBounds(30, 490, 320, 40);

        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(6, 2, 50, 50);

        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("TEACHER:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(20, 140, 350, 40);

        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("STUDENT:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(390, 140, 350, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/if_Close_Icon_Circle_1398920.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(1315, 2, 50, 50);

        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("ENTER THE 6 DIGIT MODULE ");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(20, 230, 350, 40);

        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(204, 204, 255)));
        jLabel11.setRequestFocusEnabled(false);
        jLabel11.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(380, 130, 980, 630);

        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(204, 204, 255)));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 130, 360, 630);

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("CODE TO BEGIN:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(20, 260, 340, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/1920x1080-indigo-web-solid-color-background.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-130, -20, 1750, 790);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void instActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
            inst.setVisible(true);
            inst1.setVisible(true);
            inst2.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void inst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inst1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inst1ActionPerformed

    private void inst2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inst2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inst2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        inst.setVisible(false);
        inst1.setVisible(false);
inst2.setVisible(false);// TODO add your handling code here:

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
          lanengine obj=new lanengine();
          obj.setVisible(true);
          this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        try {
            
            new NewJFrame(ip).setVisible(true);
            this.dispose();
        } catch (RemoteException ex) {
            Logger.getLogger(Instruction1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Instruction1.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            

    }//GEN-LAST:event_signupMouseClicked

    private void signup1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup1MouseClicked
      
       new login(ip).setVisible(true);
       this.dispose();
        
        
    }//GEN-LAST:event_signup1MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new feedback(ip).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new feedback(ip).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void usertext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertext1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertext1ActionPerformed

    private void usertext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertext2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertext2ActionPerformed

    private void error1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_error1MouseClicked

    }//GEN-LAST:event_error1MouseClicked

    private void usertextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertextActionPerformed
String code="123456";
    private void usertext1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usertext1MouseClicked
       if(usertext.getText().equals(code))
       {
           usertext2.setVisible(true);
           usertext1.setVisible(false);
       }
       else
       {
           error1.setVisible(true);
           jLabel16.setVisible(true);
       }
    }//GEN-LAST:event_usertext1MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
       error1.setVisible(false);
       jLabel16.setVisible(false);
       usertext.setText("");
       usertext.setFocusable(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void usertext2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usertext2MouseClicked
        new teachermodule(ip).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_usertext2MouseClicked

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
            java.util.logging.Logger.getLogger(Instruction1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Instruction1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Instruction1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Instruction1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instruction1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel error1;
    private javax.swing.JTextField inst;
    private javax.swing.JTextField inst1;
    private javax.swing.JTextField inst2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel signup;
    private javax.swing.JLabel signup1;
    private javax.swing.JTextField usertext;
    private javax.swing.JTextField usertext1;
    private javax.swing.JTextField usertext2;
    private javax.swing.JLabel watermark;
    // End of variables declaration//GEN-END:variables
}