


import java.awt.Color;
//import javax.mail.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.*;
import java.util.Properties;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shree pc
 */
public class NewJFrame extends javax.swing.JFrame {

    String ip;
    String name;

    

    
    public NewJFrame(String ip) throws RemoteException, MalformedURLException {
        initComponents();
    this.ip=ip;
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    int sw=(int)(d.getWidth());
    int sh=(int)(d.getHeight());
     setLocation(sw,sh);
     setBounds(0,0,sw,sh);
    email.setOpaque(false);
    usertext.setOpaque(false);
    password.setOpaque(false);
    confirmpassword.setOpaque(false);
    email.setBackground(new Color(0,0,0,128));
    usertext.setBackground(new Color(0,0,0,128));
    password.setBackground(new Color(0,0,0,128));
    confirmpassword.setBackground(new Color(0,0,0,128));
    college.setOpaque(false);
    college.setBackground(new Color(0,0,0,128));
    Rollno.setOpaque(false);
    Rollno.setBackground(new Color(0,0,0,128));
     proceed.setVisible(false);
                       proceed1.setVisible(false);
                       proceed2.setVisible(false);
                       error.setVisible(false);
                       error1.setVisible(false);
                      error2.setVisible(false);
                            
    jLabel4.setVisible(false);
    }
    
    public NewJFrame() throws RemoteException, MalformedURLException {
        initComponents();
    Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    int sw=(int)(d.getWidth());
    int sh=(int)(d.getHeight());
     setLocation(sw,sh);
     setBounds(0,0,sw,sh);
    email.setOpaque(false);
    jLabel4.setVisible(false);
    usertext.setOpaque(false);
    password.setOpaque(false);
    confirmpassword.setOpaque(false);
    email.setBackground(new Color(0,0,0,128));
    usertext.setBackground(new Color(0,0,0,128));
    password.setBackground(new Color(0,0,0,128));
    confirmpassword.setBackground(new Color(0,0,0,128));
    college.setOpaque(false);
    college.setBackground(new Color(0,0,0,128));
    Rollno.setOpaque(false);
    Rollno.setBackground(new Color(0,0,0,128));
     proceed.setVisible(false);
                       proceed1.setVisible(false);
                       proceed2.setVisible(false);
                       error.setVisible(false);
                       error1.setVisible(false);
                      error2.setVisible(false);
        
    }
    /*public static int getOTP()
    {
        int num=(int)(1000000*Math.random());
        if(num<100000)
        {
            getOTP();
        }
        return num;
    }
    
    public static void sendMail(String email)throws Exception
    {
        int otp=getOTP();
        Properties props=new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.user","zabaish12345@gmail.com");
        props.put("mail.smtp.password","v@r@rgs@123");
        props.put("mail.smtp.port","465");
        props.put("mail.smtp.auth",true);
        Session ses=Session.getDefaultInstance(props);
        MimeMessage message=new MimeMessage(ses);
        message.setSubject("Confirmation Mail From Utkarsh Shukla's Photo Editing Team");
        message.setSender(new InternetAddress("zabaish12345@gmail.com"));
  message.setRecipient(Message.RecipientType.TO,
                new InternetAddress(email));
        message.setContent("Dear Sir/Ma'am,<br><br>Thank you for choosing our company to get your work done<br><br>We promise you for same service to be provide in future.Your otp for complete verification is<br><span style='font-size:25px'>"+otp+"</span><br>Please click on the below provided link to complete your registration process<br>http://localhost:29002/webapp4/verify?email="+email+"<br><br>We hope the same trust to be shown by you as shown this time<br>Thanking with regards!! <br> Team Utkarsh","text/html");
        Transport trans=ses.getTransport("smtps");
        trans.connect("smtp.gmail.com","zabaish12345@gmail.com","v@r@rgs@123");
        trans.sendMessage(message,message.getAllRecipients());
    }
   
*/    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        usertext = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Rollno = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        college = new javax.swing.JTextField();
        error1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        proceed2 = new javax.swing.JLabel();
        tick = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        proceed = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        error2 = new javax.swing.JLabel();
        proceed1 = new javax.swing.JLabel();
        watermark = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        confirmpassword = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 60)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SIGN UP");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 330, 80));

        email.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        email.setOpaque(false);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 450, 50));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("LOGIN");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 690, 90, 40));

        usertext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usertext.setForeground(new java.awt.Color(255, 255, 255));
        usertext.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        usertext.setOpaque(false);
        usertext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertextActionPerformed(evt);
            }
        });
        jPanel1.add(usertext, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 450, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/if_humans_1216581.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 140));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("CONFIRM PASS.");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 210, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/arrow-back-2-icon.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 70, 80));

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("EMAIL");
        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 210, 50));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("PASSWORD");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 210, 50));

        Rollno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Rollno.setForeground(new java.awt.Color(255, 255, 255));
        Rollno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Rollno.setOpaque(false);
        Rollno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollnoActionPerformed(evt);
            }
        });
        jPanel1.add(Rollno, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 450, 50));

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("ROLL NO");
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 210, 50));

        college.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        college.setForeground(new java.awt.Color(255, 255, 255));
        college.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        college.setOpaque(false);
        college.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collegeActionPerformed(evt);
            }
        });
        jPanel1.add(college, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 450, 50));

        error1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/if_3_330411(1).png"))); // NOI18N
        error1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                error1MouseClicked(evt);
            }
        });
        jPanel1.add(error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 350, 70, 70));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("COLLEGE");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 210, 50));

        proceed2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        proceed2.setForeground(new java.awt.Color(204, 204, 255));
        proceed2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proceed2.setText("Click Here To Proceed !");
        jPanel1.add(proceed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 390, 220, 20));

        tick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/if_Tick_Mark_Circle_1398913 (2).png"))); // NOI18N
        tick.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tickMouseClicked(evt);
            }
        });
        jPanel1.add(tick, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 100, 90));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Invalid Email ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 350, 150, 60));

        proceed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/if_9_330409.png"))); // NOI18N
        proceed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proceed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proceedMouseClicked(evt);
            }
        });
        jPanel1.add(proceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 350, 70, 70));

        error.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        error.setForeground(new java.awt.Color(204, 204, 255));
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error.setText("Please Enter All The Details");
        jPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, 220, 30));

        error2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        error2.setForeground(new java.awt.Color(204, 204, 255));
        error2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error2.setText("Password do not match !");
        jPanel1.add(error2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, 220, 30));

        proceed1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        proceed1.setForeground(new java.awt.Color(204, 204, 255));
        proceed1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proceed1.setText("ThankYou For Registering !");
        jPanel1.add(proceed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 360, 220, 20));

        watermark.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        watermark.setText("TEAM NEWNETIC™");
        jPanel1.add(watermark, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 740, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/arrow-back-icon.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setPreferredSize(new java.awt.Dimension(64, 64));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 50, 50));

        confirmpassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        confirmpassword.setForeground(new java.awt.Color(255, 255, 255));
        confirmpassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        confirmpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(confirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 590, 450, 50));

        password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        password.setPreferredSize(new java.awt.Dimension(5, 26));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 450, 50));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("USERNAME");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 210, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/1920x1080-indigo-web-solid-color-background.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(1366, 768));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

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

    private void usertextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertextActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        
    }//GEN-LAST:event_emailActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
            new Instruction1(ip).setVisible(true);  
            this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
                 login obj=new login(ip);
        obj.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
                   login obj=new login(ip);
        obj.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jLabel8MouseClicked

    private void tickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tickMouseClicked
        String str[]=new String[5];           
        try{
            
                       if("".equals(usertext.getText())||"".equals(email.getText())||"".equals(college.getText())||"".equals(Rollno.getText())||"".equals(password.getText())||"".equals(confirmpassword.getText()))
                       {
                       error.setVisible(true);
                       error1.setVisible(true);
                       error2.setVisible(false);
                       
                       }
                       else if(password.getText().compareTo(confirmpassword.getText())!=0)
                               { 
                               error1.setVisible(true);
                               error2.setVisible(true);
                               error.setVisible(false);
                               }
                       else
                       {
                           String a1 = usertext.getText();
                   
            String a2 = email.getText();
            int count=0;
            int count1=0;
            for(int i=1;i<=a2.length();i++)
            {
                if(a2.contains("@"))
                    count++;
                if(a2.contains(".com"))
                    count1++;
                
            }
            if(count==0||count1==0)
            {
                error1.setVisible(true);
                jLabel4.setVisible(true);
            }
            else
            {
            String a3 = password.getText();
            String a4=college.getText();
            String a5=Rollno.getText();
                      
                       serverinterface s1=(serverinterface)Naming.lookup("rmi://"+ip+"/tag");
                       s1.save(a1, a2, a3,a4,a5);
                          error2.setVisible(false);
                       error1.setVisible(false);
                      
                       proceed.setVisible(true);
                       proceed1.setVisible(true);
                       proceed2.setVisible(true);
            }
                       }
            } catch (  NotBoundException | MalformedURLException | RemoteException e) {
                       System.out.println(e);
            JOptionPane.showMessageDialog(this, "Values Cannot be Saved");
        }    
            
    }//GEN-LAST:event_tickMouseClicked

    private void confirmpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpasswordActionPerformed

    private void RollnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RollnoActionPerformed

    private void collegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collegeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_collegeActionPerformed

    private void error1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_error1MouseClicked
       
    }//GEN-LAST:event_error1MouseClicked

    private void proceedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proceedMouseClicked
        try {
            //sendMail(email.getText());
        } catch (Exception ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        start1 obj=new start1(ip,usertext.getText(),Rollno.getText());
        obj.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_proceedMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jLabel4.setVisible(false);  
        error.setVisible(false);
                       error1.setVisible(false);
                       error2.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewJFrame().setVisible(true);
                } catch (RemoteException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (MalformedURLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Rollno;
    private javax.swing.JTextField college;
    private javax.swing.JPasswordField confirmpassword;
    private javax.swing.JTextField email;
    private javax.swing.JLabel error;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel proceed;
    private javax.swing.JLabel proceed1;
    private javax.swing.JLabel proceed2;
    private javax.swing.JLabel tick;
    private javax.swing.JTextField usertext;
    private javax.swing.JLabel watermark;
    // End of variables declaration//GEN-END:variables
}
