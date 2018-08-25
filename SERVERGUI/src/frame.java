
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shree pc
 */
public class frame extends javax.swing.JFrame {

    /**
     * Creates new form frame
     */
    public frame() {
        initComponents();
     setSize(1368,768);
     jScrollPane1.getViewport().setOpaque(false);
       display.setOpaque(false);
     display.setBackground(new Color(0,0,0,128));
    }
    
    
    static Statement st;
    public static Connection c;
    public static Statement makeConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection( "jdbc:mysql://localhost:3306/newnetic","root", "123");
            st = c.createStatement();
            System.out.println("hey");
        } catch (Exception e) {
            System.out.println(e);
        }
        return st;

    } 

    public frame(String label) {
        initComponents();
        enter7.setText(label);
        setSize(1368,768);
        jScrollPane1.getViewport().setOpaque(false);
       display.setOpaque(false);
     display.setBackground(new Color(0,0,0,128));
    display.setText("");
     try{
         Statement st=makeConnection();
    if(label.equals("Registered Students"))
    {
        String name,email,password,college,rollno;
    ResultSet rs=st.executeQuery("select * from lanengine1");
    while(rs.next())
    {
         name    ="Name    : "+rs.getString(1)+"\n";
         email   ="Email   : "+rs.getString(2)+"\n";
         password="Password: "+rs.getString(3)+"\n";
         college ="College : "+rs.getString(4)+"\n";
         rollno  ="Rollno  : "+rs.getString(5)+"\n";
        String str=display.getText();
        if(str.equals(""))
        {
    display.setText(name+email+password+college+rollno+"\n\n\n");
        }   
    else
        {
                        
       str=str+name+email+password+college+rollno+"\n\n\n";
        display.setText(str);
        }
        
    }
    
    }
    if(label.equals("Aptitude"))
    {
        String qno,ques,option1,option2,option3,option4,correct;
    ResultSet rs=st.executeQuery("select * from aptitude");
       while(rs.next())
    {
         qno=rs.getString(1);
         ques=qno+" "+rs.getString(2)+"\n";
         option1="a. "+rs.getString(3)+"\n";
         option2="b. "+rs.getString(4)+"\n";
         option3="c. "+rs.getString(5)+"\n";
         option4="d. "+rs.getString(6)+"\n";
         correct="Correct. "+rs.getString(5)+"\n";
          String str=display.getText();
        if(str.equals(""))
        {
            display.setText(ques+option1+option2+option3+option4+correct+"\n\n\n");
        }   
    else
        {
            str=str+ques+option1+option2+option3+option4+correct+"\n\n\n";           
            display.setText(str);
        }
        }
   }
    if(label.equals("Practice"))
    {
        String qno,ques,option1,option2,option3,option4,correct;
    ResultSet rs=st.executeQuery("select * from practice");
       while(rs.next())
    {
        qno=rs.getString(1);
         ques=qno+" "+rs.getString(2)+"\n";
         option1="a. "+rs.getString(3)+"\n";
         option2="b. "+rs.getString(4)+"\n";
         option3="c. "+rs.getString(5)+"\n";
         option4="d. "+rs.getString(6)+"\n";
         correct="Correct. "+rs.getString(5)+"\n";
          String str=display.getText();
        if(str.equals(""))
        {
            display.setText(ques+option1+option2+option3+option4+correct+"\n\n\n");
        }   
    else
        {
            str=str+ques+option1+option2+option3+option4+correct+"\n\n\n";           
            display.setText(str);
        }
        }
   }
     if(label.equals("CSE"))
    {
        String qno,ques,option1,option2,option3,option4,correct;
    ResultSet rs=st.executeQuery("select * from cse");
       while(rs.next())
    {
        qno=rs.getString(1);
         ques=qno+" "+rs.getString(2)+"\n";
         option1="a. "+rs.getString(3)+"\n";
         option2="b. "+rs.getString(4)+"\n";
         option3="c. "+rs.getString(5)+"\n";
         option4="d. "+rs.getString(6)+"\n";
         correct="Correct. "+rs.getString(5)+"\n";
          String str=display.getText();
        if(str.equals(""))
        {
            display.setText(ques+option1+option2+option3+option4+correct+"\n\n\n");
        }   
    else
        {
            str=str+ques+option1+option2+option3+option4+correct+"\n\n\n";           
            display.setText(str);
        }
        }
   }
      if(label.equals("CE"))
    {
        String qno,ques,option1,option2,option3,option4,correct;
    ResultSet rs=st.executeQuery("select * from ce");
       while(rs.next())
    {
        qno=rs.getString(1);
         ques=qno+" "+rs.getString(2)+"\n";
         option1="a. "+rs.getString(3)+"\n";
         option2="b. "+rs.getString(4)+"\n";
         option3="c. "+rs.getString(5)+"\n";
         option4="d. "+rs.getString(6)+"\n";
         correct="Correct. "+rs.getString(5)+"\n";
          String str=display.getText();
        if(str.equals(""))
        {
            display.setText(ques+option1+option2+option3+option4+correct+"\n\n\n");
        }   
    else
        {
            str=str+ques+option1+option2+option3+option4+correct+"\n\n\n";           
            display.setText(str);
        }
        }
   }
      if(label.equals("EN"))
    {
        String qno,ques,option1,option2,option3,option4,correct;
    ResultSet rs=st.executeQuery("select * from eee");
       while(rs.next())
    {
        qno=rs.getString(1);
         ques=qno+" "+rs.getString(2)+"\n";
         option1="a. "+rs.getString(3)+"\n";
         option2="b. "+rs.getString(4)+"\n";
         option3="c. "+rs.getString(5)+"\n";
         option4="d. "+rs.getString(6)+"\n";
         correct="Correct. "+rs.getString(5)+"\n";
          String str=display.getText();
        if(str.equals(""))
        {
            display.setText(ques+option1+option2+option3+option4+correct+"\n\n\n");
        }   
    else
        {
            str=str+ques+option1+option2+option3+option4+correct+"\n\n\n";           
            display.setText(str);
        }
        }
   }
      if(label.equals("ECE"))
    {
        String qno,ques,option1,option2,option3,option4,correct;
    ResultSet rs=st.executeQuery("select * from ece");
       while(rs.next())
    {
        qno=rs.getString(1);
         ques=qno+" "+rs.getString(2)+"\n";
         option1="a. "+rs.getString(3)+"\n";
         option2="b. "+rs.getString(4)+"\n";
         option3="c. "+rs.getString(5)+"\n";
         option4="d. "+rs.getString(6)+"\n";
         correct="Correct. "+rs.getString(5)+"\n";
          String str=display.getText();
        if(str.equals(""))
        {
            display.setText(ques+option1+option2+option3+option4+correct+"\n\n\n");
        }   
    else
        {
            str=str+ques+option1+option2+option3+option4+correct+"\n\n\n";           
            display.setText(str);
        }
        }
   }
      if(label.equals("IT"))
    {
        String qno,ques,option1,option2,option3,option4,correct;
    ResultSet rs=st.executeQuery("select * from cse");
       while(rs.next())
    {
        qno=rs.getString(1);
         ques=qno+" "+rs.getString(2)+"\n";
         option1="a. "+rs.getString(3)+"\n";
         option2="b. "+rs.getString(4)+"\n";
         option3="c. "+rs.getString(5)+"\n";
         option4="d. "+rs.getString(6)+"\n";
         correct="Correct. "+rs.getString(5)+"\n";
          String str=display.getText();
        if(str.equals(""))
        {
            display.setText(ques+option1+option2+option3+option4+correct+"\n\n\n");
        }   
    else
        {
            str=str+ques+option1+option2+option3+option4+correct+"\n\n\n";           
            display.setText(str);
        }
        }
   }
      if(label.equals("ME"))
    {
        String qno,ques,option1,option2,option3,option4,correct;
    ResultSet rs=st.executeQuery("select * from me");
       while(rs.next())
    {
        qno=rs.getString(1);
         ques=qno+" "+rs.getString(2)+"\n";
         option1="a. "+rs.getString(3)+"\n";
         option2="b. "+rs.getString(4)+"\n";
         option3="c. "+rs.getString(5)+"\n";
         option4="d. "+rs.getString(6)+"\n";
         correct="Correct. "+rs.getString(5)+"\n";
          String str=display.getText();
        if(str.equals(""))
        {
            display.setText(ques+option1+option2+option3+option4+correct+"\n\n\n");
        }   
    else
        {
            str=str+ques+option1+option2+option3+option4+correct+"\n\n\n";           
            display.setText(str);
        }
        }
   }
     if(label.equals("Feedback"))
     {
         String msgsub,message,rpname,rpemail;
         ResultSet rs=st.executeQuery("select * from feedback");
         while(rs.next())
         {
             msgsub= "Message Subject :"+rs.getString(1)+"\n";
             message="Message         :"+rs.getString(2)+"\n";
             rpname= "Reply Name:     :"+rs.getString(3)+"\n";
             rpemail="Reply Email     :"+rs.getString(4)+"\n";
             String str=display.getText();
             if(str.equals(""))
        {
            display.setText(msgsub+message+rpname+rpemail+"\n\n\n");
        }   
    else
        {
            str=str+msgsub+message+rpname+rpemail+"\n\n\n";           
            display.setText(str);
        }
         }
     }
    if(label.equals("Result Of Students"))
    {
        String name,score,rollno;
        ResultSet rs=st.executeQuery("select * from result");
        while(rs.next())
        {
            name=  "Name :  "+rs.getString(1)+"\n";
            score= "Score:  "+rs.getString(2)+"\n";
            rollno="Roll No:"+rs.getString(3)+"\n";
            String str=display.getText();
             if(str.equals(""))
        {
            display.setText(name+score+rollno+"\n\n\n");
        }   
    else
        {
            str=str+name+score+rollno+"\n\n\n";           
            display.setText(str);
        }
        }
    }
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        enter7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        mainpage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        enter7.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 28)); // NOI18N
        enter7.setForeground(new java.awt.Color(204, 204, 255));
        enter7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enter7.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        enter7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(enter7);
        enter7.setBounds(50, 40, 300, 60);

        display.setEditable(false);
        display.setColumns(20);
        display.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        display.setForeground(new java.awt.Color(204, 204, 255));
        display.setLineWrap(true);
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 150, 1250, 560);

        jButton1.setText("BACK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1260, 30, 80, 40);

        mainpage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/1920x1080-indigo-web-solid-color-background.jpg"))); // NOI18N
        mainpage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainpageMouseClicked(evt);
            }
        });
        jPanel1.add(mainpage);
        mainpage.setBounds(0, 0, 1370, 820);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1373, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainpageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainpageMouseClicked

    }//GEN-LAST:event_mainpageMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

   new ServerGUI().setVisible(true);
   this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea display;
    private javax.swing.JLabel enter7;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mainpage;
    // End of variables declaration//GEN-END:variables
}
