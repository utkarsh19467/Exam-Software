
import java.awt.Color;
import java.rmi.Naming;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shree pc
 */
public class teachermodule extends javax.swing.JFrame {

    /**
     * Creates new form teachermodule
     */
    public teachermodule() {
        initComponents();
    msgsub1.setOpaque(false);
      msgsub1.setBackground(new Color(0,0,0,128));
msgsub3.setOpaque(false);
      msgsub3.setBackground(new Color(0,0,0,128));
msgsub5.setOpaque(false);
      msgsub5.setBackground(new Color(0,0,0,128));
msgsub7.setOpaque(false);
      msgsub7.setBackground(new Color(0,0,0,128));
msgsub9.setOpaque(false);
      msgsub9.setBackground(new Color(0,0,0,128));
jComboBox1.setOpaque(false);
    jComboBox1.setBackground(new Color(0,0,0,128));
     msgsub.getViewport().setOpaque(false);
      msgsub2.getViewport().setOpaque(false);
 msgsub4.getViewport().setOpaque(false);
 msgsub6.getViewport().setOpaque(false);
 msgsub8.getViewport().setOpaque(false);
jTextField1.setOpaque(false);
jTextField1.setBackground(new Color(0,0,0,128));

    }
    String ip;
public teachermodule(String ip) {
        initComponents();
        this.ip=ip;
    msgsub1.setOpaque(false);
      msgsub1.setBackground(new Color(0,0,0,128));
msgsub3.setOpaque(false);
      msgsub3.setBackground(new Color(0,0,0,128));
msgsub5.setOpaque(false);
      msgsub5.setBackground(new Color(0,0,0,128));
msgsub7.setOpaque(false);
      msgsub7.setBackground(new Color(0,0,0,128));
msgsub9.setOpaque(false);
      msgsub9.setBackground(new Color(0,0,0,128));
jComboBox1.setOpaque(false);
    jComboBox1.setBackground(new Color(0,0,0,128));
     msgsub.getViewport().setOpaque(false);
      msgsub2.getViewport().setOpaque(false);
 msgsub4.getViewport().setOpaque(false);
 msgsub6.getViewport().setOpaque(false);
 msgsub8.getViewport().setOpaque(false);
jTextField1.setOpaque(false);
jTextField1.setBackground(new Color(0,0,0,128));

    }
public String calculateBranch()
{
    String branch1="";
    String branch=jComboBox1.getSelectedItem().toString();
   if(branch.equalsIgnoreCase("COMPUTER SCIENCE AND ENGINEERING")||branch.equalsIgnoreCase("INFORMATION TECHNOLOGY"))
   branch1="cse";
   else if(branch.equalsIgnoreCase("ELECTRICAL ENGINEERING"))
    branch1="eee";
   else if(branch.equalsIgnoreCase("ELECTRONICS AND COMMUNICATION ENGINEERING"))
     branch1="ece";
   else if(branch.equalsIgnoreCase("MECHANICAL ENGINEERING"))
      branch1="me";
   else if(branch.equalsIgnoreCase("CIVIL ENGINEERING"))
       branch1="ce";
   else if(branch.equalsIgnoreCase("APTITUDE"))
       branch1="aptitude"; 
   return branch1;
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
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        branch1 = new javax.swing.JLabel();
        msgsub2 = new javax.swing.JScrollPane();
        msgsub3 = new javax.swing.JTextArea();
        msgsub6 = new javax.swing.JScrollPane();
        msgsub7 = new javax.swing.JTextArea();
        msgsub8 = new javax.swing.JScrollPane();
        msgsub9 = new javax.swing.JTextArea();
        msgsub4 = new javax.swing.JScrollPane();
        msgsub5 = new javax.swing.JTextArea();
        msgsub = new javax.swing.JScrollPane();
        msgsub1 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        branch8 = new javax.swing.JLabel();
        branch3 = new javax.swing.JLabel();
        branch4 = new javax.swing.JLabel();
        branch7 = new javax.swing.JLabel();
        branch6 = new javax.swing.JLabel();
        branch5 = new javax.swing.JLabel();
        branch2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(1368, 768));
        jPanel1.setLayout(null);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/arrow-back-icon.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(1270, 20, 80, 80);

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 100)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("WELCOME");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 3, true));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(410, 10, 520, 110);

        branch1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        branch1.setForeground(new java.awt.Color(204, 204, 255));
        branch1.setText("ENTER OPTION 3:");
        jPanel1.add(branch1);
        branch1.setBounds(10, 550, 220, 32);

        msgsub2.setBorder(new javax.swing.border.MatteBorder(null));
        msgsub2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        msgsub2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        msgsub3.setColumns(20);
        msgsub3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        msgsub3.setForeground(new java.awt.Color(255, 255, 255));
        msgsub3.setLineWrap(true);
        msgsub3.setRows(5);
        msgsub3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        msgsub2.setViewportView(msgsub3);

        jPanel1.add(msgsub2);
        msgsub2.setBounds(610, 580, 550, 70);

        msgsub6.setBorder(new javax.swing.border.MatteBorder(null));
        msgsub6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        msgsub6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        msgsub7.setColumns(20);
        msgsub7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        msgsub7.setForeground(new java.awt.Color(255, 255, 255));
        msgsub7.setLineWrap(true);
        msgsub7.setRows(5);
        msgsub7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        msgsub6.setViewportView(msgsub7);

        jPanel1.add(msgsub6);
        msgsub6.setBounds(10, 470, 550, 70);

        msgsub8.setBorder(new javax.swing.border.MatteBorder(null));
        msgsub8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        msgsub8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        msgsub9.setColumns(20);
        msgsub9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        msgsub9.setForeground(new java.awt.Color(255, 255, 255));
        msgsub9.setLineWrap(true);
        msgsub9.setRows(5);
        msgsub9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        msgsub8.setViewportView(msgsub9);

        jPanel1.add(msgsub8);
        msgsub8.setBounds(10, 580, 550, 70);

        msgsub4.setBorder(new javax.swing.border.MatteBorder(null));
        msgsub4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        msgsub4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        msgsub5.setColumns(20);
        msgsub5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        msgsub5.setForeground(new java.awt.Color(255, 255, 255));
        msgsub5.setLineWrap(true);
        msgsub5.setRows(5);
        msgsub5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        msgsub4.setViewportView(msgsub5);

        jPanel1.add(msgsub4);
        msgsub4.setBounds(610, 470, 550, 70);

        msgsub.setBorder(new javax.swing.border.MatteBorder(null));
        msgsub.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        msgsub.setToolTipText("");
        msgsub.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        msgsub1.setColumns(20);
        msgsub1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        msgsub1.setForeground(new java.awt.Color(255, 255, 255));
        msgsub1.setLineWrap(true);
        msgsub1.setRows(5);
        msgsub1.setWrapStyleWord(true);
        msgsub1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        msgsub.setViewportView(msgsub1);

        jPanel1.add(msgsub);
        msgsub.setBounds(10, 300, 1340, 120);

        jComboBox1.setBackground(new java.awt.Color(128, 128, 128));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(204, 204, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "COMPUTER SCIENCE AND ENGINEERING", "ELECTRICAL ENGINEERING", "ELECTRONICS AND COMMUNICATION ENGINEERING", "INFORMATION TECHNOLOGY", "MECHANICAL ENGINEERING", "CIVIL ENGINEERING" }));
        jComboBox1.setOpaque(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(10, 190, 580, 40);

        jTextField1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(260, 670, 160, 40);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/if_Tick_Mark_Circle_1398913 (2).png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(1230, 470, 80, 80);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 234, 234));
        jLabel1.setText("CORRECT OPTION:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 670, 230, 40);

        branch8.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        branch8.setForeground(new java.awt.Color(204, 204, 255));
        branch8.setText("ENTER OPTION 1:");
        jPanel1.add(branch8);
        branch8.setBounds(10, 430, 220, 32);

        branch3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        branch3.setForeground(new java.awt.Color(204, 204, 255));
        branch3.setText("ENTER OPTION 2:");
        jPanel1.add(branch3);
        branch3.setBounds(610, 430, 220, 32);

        branch4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        branch4.setForeground(new java.awt.Color(204, 204, 255));
        branch4.setText("ENTER OPTION 4:");
        jPanel1.add(branch4);
        branch4.setBounds(610, 550, 220, 32);

        branch7.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        branch7.setForeground(new java.awt.Color(204, 204, 255));
        branch7.setText("ENTER OPTION 1:");
        jPanel1.add(branch7);
        branch7.setBounds(10, 430, 220, 32);

        branch6.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        branch6.setForeground(new java.awt.Color(204, 204, 255));
        branch6.setText("ENTER QUESTION");
        jPanel1.add(branch6);
        branch6.setBounds(10, 260, 220, 32);

        branch5.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        branch5.setForeground(new java.awt.Color(204, 204, 255));
        branch5.setText("SELECT BRANCH:");
        jPanel1.add(branch5);
        branch5.setBounds(10, 160, 220, 32);

        branch2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        branch2.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(branch2);
        branch2.setBounds(20, 460, 210, 0);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/1920x1080-indigo-web-solid-color-background.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1380, 780);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
     new Instruction1(ip).setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        try
        {
        serverinterface s1=(serverinterface)Naming.lookup("rmi://"+ip+"/tag");
        String branch=calculateBranch();
        s1.insertQuestion(msgsub1.getText(),msgsub7.getText(),msgsub5.getText(),msgsub9.getText(),msgsub3.getText(),branch,jTextField1.getText());
        msgsub1.setText("");
        msgsub7.setText("");
        msgsub5.setText("");
        msgsub9.setText("");
        msgsub3.setText("");
        jTextField1.setText("");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(teachermodule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teachermodule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teachermodule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teachermodule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teachermodule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel branch1;
    private javax.swing.JLabel branch2;
    private javax.swing.JLabel branch3;
    private javax.swing.JLabel branch4;
    private javax.swing.JLabel branch5;
    private javax.swing.JLabel branch6;
    private javax.swing.JLabel branch7;
    private javax.swing.JLabel branch8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JScrollPane msgsub;
    private javax.swing.JTextArea msgsub1;
    private javax.swing.JScrollPane msgsub2;
    private javax.swing.JTextArea msgsub3;
    private javax.swing.JScrollPane msgsub4;
    private javax.swing.JTextArea msgsub5;
    private javax.swing.JScrollPane msgsub6;
    private javax.swing.JTextArea msgsub7;
    private javax.swing.JScrollPane msgsub8;
    private javax.swing.JTextArea msgsub9;
    // End of variables declaration//GEN-END:variables
}
