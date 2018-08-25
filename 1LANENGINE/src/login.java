


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shree pc
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    String ip;
    String rollno;
    public login(String ip) {
        initComponents();
     this.ip=ip;
    Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    int sw=(int)(d.getWidth());
    int sh=(int)(d.getHeight());
    setBounds(0,0,sw,sh);
    loginpassword.setOpaque(false);
    username.setOpaque(false);
    loginpassword.setBackground(new Color(0,0,0,128));
    username.setBackground(new Color(0,0,0,128));
    error.setVisible(false);
         error1.setVisible(false);
         error2.setVisible(false);
proceed.setVisible(false);
proceed1.setVisible(false);
proceed2.setVisible(false);
         
    
    }
    public login() {
        initComponents();
     
    Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    int sw=(int)(d.getWidth());
    int sh=(int)(d.getHeight());
    setBounds(0,0,sw,sh);
    loginpassword.setOpaque(false);
    username.setOpaque(false);
    loginpassword.setBackground(new Color(0,0,0,128));
    username.setBackground(new Color(0,0,0,128));
    error.setVisible(false);
         error1.setVisible(false);
         error2.setVisible(false);
proceed.setVisible(false);
proceed1.setVisible(false);
proceed2.setVisible(false);
         
    
    
    }
    String name="";
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        error2 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        proceed = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();
        proceed1 = new javax.swing.JLabel();
        watermark = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        proceed2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        loginpassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 490, 90));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("PASSWORD");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, 50));

        username.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        username.setOpaque(false);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 490, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/arrow-back-1-icon.png"))); // NOI18N
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 130));

        error2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        error2.setForeground(new java.awt.Color(204, 204, 255));
        error2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error2.setText("Invalid Username And Password");
        jPanel1.add(error2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 360, 260, 30));

        error.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        error.setForeground(new java.awt.Color(204, 204, 255));
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error.setText("Please Enter All The Details");
        jPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 360, 220, 30));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("USERNAME");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 220, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/if_humans_1216581(1).png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 70, 80));

        proceed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/aaa.png"))); // NOI18N
        proceed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proceed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proceedMouseClicked(evt);
            }
        });
        jPanel1.add(proceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 590, 70, 70));

        error1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/if_3_330411(1).png"))); // NOI18N
        error1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                error1MouseClicked(evt);
            }
        });
        jPanel1.add(error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 340, 70, 70));

        proceed1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        proceed1.setForeground(new java.awt.Color(204, 204, 255));
        proceed1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proceed1.setText("You are successfully logged in ");
        jPanel1.add(proceed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, 250, 30));

        watermark.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        watermark.setText("TEAM NEWNETIC™");
        jPanel1.add(watermark, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 740, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("SIGNUP");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 690, 100, 40));

        proceed2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        proceed2.setForeground(new java.awt.Color(204, 204, 255));
        proceed2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proceed2.setText("Click Here To Proceed !");
        jPanel1.add(proceed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 570, 220, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/arrow-back-icon.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 60, 50));

        loginpassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loginpassword.setForeground(new java.awt.Color(255, 255, 255));
        loginpassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel1.add(loginpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 490, 50));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/if_Tick_Mark_Circle_1398913 (2).png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 90, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/1920x1080-indigo-web-solid-color-background.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(1366, 768));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 1430, 780));

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

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        new Instruction1(ip).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
try {
    if(username.getText().equals("")||loginpassword.getText().equals(""))
    {
         error.setVisible(true);
         error1.setVisible(true);
        error2.setVisible(false);
         
         
    }
    else
    {     name=username.getText();
            serverinterface s2=(serverinterface)Naming.lookup("rmi://"+ip+"/tag");
            int res=s2.logincheck(username.getText(),loginpassword.getText());
            if (res==2){
        error1.setVisible(true); 
        error2.setVisible(true);
            } else if (res==1) {
             error1.setVisible(true); 
        error2.setVisible(true);
       
            } else 
            {
                System.out.println();
                proceed.setVisible(true);
proceed1.setVisible(true);
proceed2.setVisible(true);
        
            }
             rollno=s2.rollno(username.getText());
            
    }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please Enter the correct ip address");
        System.out.println(e);
        }
                                       
    }//GEN-LAST:event_jLabel9MouseClicked

    private void error1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_error1MouseClicked
    
    }//GEN-LAST:event_error1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
     error.setVisible(false);
     error1.setVisible(false);
     error2.setVisible(false);
                         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void proceedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proceedMouseClicked
        String name1=username.getText();
        start1 obj=new start1(ip,name1,rollno);
        obj.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_proceedMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        NewJFrame obj;
        try {
            obj = new NewJFrame(ip);
        obj.setVisible(true);
        this.setVisible(false);
        } catch (RemoteException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        NewJFrame obj;
        try {
            obj = new NewJFrame(ip);
        obj.setVisible(true);
        this.setVisible(false);
      
        } catch (RemoteException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jLabel10MouseClicked

     
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel error;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField loginpassword;
    private javax.swing.JLabel proceed;
    private javax.swing.JLabel proceed1;
    private javax.swing.JLabel proceed2;
    private javax.swing.JTextField username;
    private javax.swing.JLabel watermark;
    // End of variables declaration//GEN-END:variables
}
