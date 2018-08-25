
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shree pc
 */
public class test extends javax.swing.JFrame {

    int questionNo;
  static String answer[]=new String[11];
    static String correct[]=new String[11];
    static int a[]=new int[10];
    String person;
    String rollno2;
     public static void calculate()
   {
       int k=0;
       LinkedHashSet l=new LinkedHashSet();

       Random rand=new Random(); 
       while(l.size()<10)
       {
           
       int m=rand.nextInt(10)+1;
       l.add(m);
       }
   Iterator iterator=l.iterator();
   while(iterator.hasNext())
   {
       a[k++]=(int) iterator.next();
   }
   }
String ip;
    public test(String ip,String person,String rollno) {
        initComponents();
        this.ip=ip;
        this.person=person;
        this.rollno2=rollno;
        test2.setOpaque(false);
         test2.setBackground(new Color(0,0,0,128));
         test2.setText("APTITUDE");
         test1.setText(person);
         test.setText(rollno2);
   test1.setOpaque(false);
         test1.setBackground(new Color(0,0,0,128));
        test.setOpaque(false);
         test.setBackground(new Color(0,0,0,128));
        question.setOpaque(false);
        question.setBackground(new Color(0,0,0,128));
     questionpane.setOpaque(false);
        questionpane.setBackground(new Color(0,0,0,128));
   questionpane.getViewport().setOpaque(false);
        option4.setOpaque(false);
   option4.setBackground(new Color(0,0,0,128));
   option3.setOpaque(false);
   option3.setBackground(new Color(0,0,0,128));
   option2.setOpaque(false);
   option2.setBackground(new Color(0,0,0,128));
   option1.setOpaque(false);
   option1.setBackground(new Color(0,0,0,128));
   submit.setOpaque(false);
   submit.setBackground(new Color(0,0,0,128));
   jScrollPane1.getViewport().setOpaque(false);
   jScrollPane2.getViewport().setOpaque(false);
   jScrollPane3.getViewport().setOpaque(false);
   jScrollPane4.getViewport().setOpaque(false);
       jLabel4.setOpaque(false);
     jLabel4.setBackground(new Color(0,0,0,128));
  previous.setOpaque(false);
  previous.setBackground(new Color(0,0,0,128));   
       Timer t=new Timer(1000,new TimerClass());
        t.start();
        progressbar.setBackground(Color.GREEN);
   progressbar.setOpaque(false);
   progressbar.setBackground(new Color(0,0,0,128));
   submit1.setOpaque(false);
   submit1.setBackground(new Color(0,0,0,128));
     for(int i=1;i<11;i++)
    {
        
        answer[i]="0"; 
    correct[i]="1";}
   
   calculate();
   for(int temp : a)
    {
        System.out.println(temp);
    }
   
       
   
    }
    String branch;
     public test(String ip,String branch,String person,String rollno,String title) {
        initComponents();
        this.ip=ip;
        this.branch=branch;
        this.person=person;
        this.rollno2=rollno;
        test2.setOpaque(false);
         test2.setBackground(new Color(0,0,0,128));
         test2.setText(title);
         test1.setText(person);
         test.setText(rollno2);
   test1.setOpaque(false);
         test1.setBackground(new Color(0,0,0,128));
        test.setOpaque(false);
         test.setBackground(new Color(0,0,0,128));
        question.setOpaque(false);
        question.setBackground(new Color(0,0,0,128));
     questionpane.setOpaque(false);
        questionpane.setBackground(new Color(0,0,0,128));
   questionpane.getViewport().setOpaque(false);
        option4.setOpaque(false);
   option4.setBackground(new Color(0,0,0,128));
   option3.setOpaque(false);
   option3.setBackground(new Color(0,0,0,128));
   option2.setOpaque(false);
   option2.setBackground(new Color(0,0,0,128));
   option1.setOpaque(false);
   option1.setBackground(new Color(0,0,0,128));
   submit.setOpaque(false);
   submit.setBackground(new Color(0,0,0,128));
   jScrollPane1.getViewport().setOpaque(false);
   jScrollPane2.getViewport().setOpaque(false);
   jScrollPane3.getViewport().setOpaque(false);
   jScrollPane4.getViewport().setOpaque(false);
    submit1.setOpaque(false);
   submit1.setBackground(new Color(0,0,0,128));
    for(int i=1;i<11;i++)
    {
        
        answer[i]="0";
        correct[i]="1";
    }
       Timer t=new Timer(1000,new TimerClass());
        t.start();
        progressbar.setBackground(Color.GREEN);
   progressbar.setOpaque(false);
   progressbar.setBackground(new Color(0,0,0,128));
    
   calculate();
   jLabel4.setEnabled(false);
   if(branch.equalsIgnoreCase("COMPUTER SCIENCE AND ENGINEERING")||branch.equalsIgnoreCase("INFORMATION TECHNOLOGY"))
   displayQuestion(a[0],"cse");
   else if(branch.equalsIgnoreCase("ELECTRICAL ENGINEERING"))
       displayQuestion(a[0],"eee");
   else if(branch.equalsIgnoreCase("ELECTRONICS AND COMMUNICATION ENGINEERING"))
       displayQuestion(a[0],"ece");
   else if(branch.equalsIgnoreCase("MECHANICAL ENGINEERING"))
       displayQuestion(a[0],"me");
   else if(branch.equalsIgnoreCase("CIVIL ENGINEERING"))
       displayQuestion(a[0],"ce");
   else if(branch.equalsIgnoreCase("APTITUDE"))
       displayQuestion(a[0],"aptitude");
   else if(branch.equalsIgnoreCase("PRACTICE"))
       displayQuestion(a[0],"practice");
   else if(branch.equalsIgnoreCase("QUES BANK"))
       displayQuestion(a[0],"questionbank");
       
   
    }
    
    Timer t;
    public test() {
        initComponents();
        test2.setOpaque(false);
         test2.setBackground(new Color(0,0,0,128));
         test2.setText("APTITUDE");
         test1.setText("NOT KNOWN");
         test.setText("1502910134");
   test1.setOpaque(false);
         test1.setBackground(new Color(0,0,0,128));
        test.setOpaque(false);
         test.setBackground(new Color(0,0,0,128));
        question.setOpaque(false);
        question.setBackground(new Color(0,0,0,128));
     questionpane.setOpaque(false);
        questionpane.setBackground(new Color(0,0,0,128));
   questionpane.getViewport().setOpaque(false);
        option4.setOpaque(false);
   option4.setBackground(new Color(0,0,0,128));
   option3.setOpaque(false);
   option3.setBackground(new Color(0,0,0,128));
   option2.setOpaque(false);
   option2.setBackground(new Color(0,0,0,128));
   option1.setOpaque(false);
   option1.setBackground(new Color(0,0,0,128));
   submit.setOpaque(false);
   submit.setBackground(new Color(0,0,0,128));
   jScrollPane1.getViewport().setOpaque(false);
   jScrollPane2.getViewport().setOpaque(false);
   jScrollPane3.getViewport().setOpaque(false);
   jScrollPane4.getViewport().setOpaque(false);
    submit1.setOpaque(false);
   submit1.setBackground(new Color(0,0,0,128));
  for(int i=1;i<11;i++)
    {
    
        answer[i]="0"; 
        correct[i]="1";   
    }
   
        
       t=new Timer(1000,new TimerClass());
       
        t.start();
        progressbar.setBackground(Color.GREEN);
   progressbar.setOpaque(false);
   progressbar.setBackground(new Color(0,0,0,128));
  
   calculate();
   displayQuestion(a[0],branch);
       
   
    }
boolean phati=false;
      int val=0;
    int min=10,sec=0;
   public class TimerClass implements ActionListener
   {
       @Override
       public void actionPerformed(ActionEvent e)
       {
        
        progressbar.setValue(val);
        val=val+1;
        if(sec==0)
        {
            sec=59;
            min=min-1;
       }
        else
        {
            sec=sec-1;
        }
        Time.setText(min+":"+sec);
        if(min<=0 && sec==1)
        {
            calculate1();
            t.stop();
            System.out.println("Hey");
           
         }
       }
   }
   int counter=0;
   public void displayQuestion(int q,String branch)
{
  questionNo=q;
  buttonGroup.clearSelection();
    try{
    serverinterface s1=(serverinterface)Naming.lookup("rmi://"+ip+"/tag");
  String s[]=s1.fetchQuestion(q,branch);
  
        question.setText(s[0]);
        option1.setText(s[1]);
        option2.setText(s[2]);
        option3.setText(s[3]);
        option4.setText(s[4]);
        correct[q]=s[5];
        System.out.println(correct[q]);
    }
    catch(Exception e)
    {
        System.out.println(e+"hello");
    }
}

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        test = new javax.swing.JTextField();
        test1 = new javax.swing.JTextField();
        optionc = new javax.swing.JRadioButton();
        name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rollno = new javax.swing.JLabel();
        optionb = new javax.swing.JRadioButton();
        optiond = new javax.swing.JRadioButton();
        optiona = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        previous = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        submit1 = new javax.swing.JTextField();
        submit = new javax.swing.JTextField();
        questionpane = new javax.swing.JScrollPane();
        question = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        option3 = new javax.swing.JTextArea();
        watermark = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        option2 = new javax.swing.JTextArea();
        time = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        option4 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        option1 = new javax.swing.JTextArea();
        progressbar = new javax.swing.JProgressBar();
        test2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        test.setEditable(false);
        test.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        test.setForeground(new java.awt.Color(204, 204, 255));
        test.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        test.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        test.setOpaque(false);
        test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testActionPerformed(evt);
            }
        });
        jPanel1.add(test);
        test.setBounds(150, 60, 280, 40);

        test1.setEditable(false);
        test1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        test1.setForeground(new java.awt.Color(204, 204, 255));
        test1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        test1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        test1.setOpaque(false);
        test1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test1ActionPerformed(evt);
            }
        });
        jPanel1.add(test1);
        test1.setBounds(150, 10, 280, 40);

        buttonGroup.add(optionc);
        optionc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optioncActionPerformed(evt);
            }
        });
        jPanel1.add(optionc);
        optionc.setBounds(90, 610, 20, 21);

        name.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        name.setForeground(new java.awt.Color(204, 204, 255));
        name.setText("NAME :");
        jPanel1.add(name);
        name.setBounds(10, 20, 100, 32);

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1110, 210, 0, 80);

        rollno.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        rollno.setForeground(new java.awt.Color(204, 204, 255));
        rollno.setText("ROLL NO :");
        jPanel1.add(rollno);
        rollno.setBounds(10, 70, 130, 32);

        buttonGroup.add(optionb);
        optionb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionbActionPerformed(evt);
            }
        });
        jPanel1.add(optionb);
        optionb.setBounds(570, 470, 20, 21);

        buttonGroup.add(optiond);
        optiond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optiondActionPerformed(evt);
            }
        });
        jPanel1.add(optiond);
        optiond.setBounds(570, 610, 20, 21);

        buttonGroup.add(optiona);
        optiona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionaActionPerformed(evt);
            }
        });
        jPanel1.add(optiona);
        optiona.setBounds(90, 470, 20, 20);

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NAVIGATE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1144, 164, 130, 40);

        previous.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        previous.setForeground(new java.awt.Color(204, 204, 255));
        previous.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/aaa.png"))); // NOI18N
        previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousMouseClicked(evt);
            }
        });
        jPanel1.add(previous);
        previous.setBounds(1270, 140, 110, 90);

        next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
        });
        jPanel1.add(next);
        next.setBounds(1220, 210, 0, 80);

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/arrow-back3-icon.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1040, 140, 110, 100);

        submit1.setEditable(false);
        submit1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        submit1.setForeground(new java.awt.Color(204, 204, 255));
        submit1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        submit1.setText("SUBMIT EXAM");
        submit1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        submit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submit1MouseClicked(evt);
            }
        });
        submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit1ActionPerformed(evt);
            }
        });
        jPanel1.add(submit1);
        submit1.setBounds(1060, 640, 280, 40);

        submit.setEditable(false);
        submit.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        submit.setForeground(new java.awt.Color(204, 204, 255));
        submit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        submit.setText("SUBMIT ");
        submit.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(1120, 580, 140, 40);

        questionpane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        questionpane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        question.setEditable(false);
        question.setColumns(20);
        question.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        question.setForeground(new java.awt.Color(255, 255, 255));
        question.setLineWrap(true);
        question.setRows(5);
        questionpane.setViewportView(question);

        jPanel1.add(questionpane);
        questionpane.setBounds(120, 140, 890, 310);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        option3.setEditable(false);
        option3.setColumns(20);
        option3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        option3.setForeground(new java.awt.Color(204, 204, 255));
        option3.setLineWrap(true);
        option3.setRows(5);
        jScrollPane1.setViewportView(option3);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 610, 430, 120);

        watermark.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        watermark.setText("TEAM NEWNETIC™");
        jPanel1.add(watermark);
        watermark.setBounds(1170, 730, 180, 30);

        Time.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        Time.setForeground(new java.awt.Color(204, 204, 255));
        Time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Time);
        Time.setBounds(1140, 70, 100, 30);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        option2.setEditable(false);
        option2.setColumns(20);
        option2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        option2.setForeground(new java.awt.Color(204, 204, 255));
        option2.setLineWrap(true);
        option2.setRows(5);
        jScrollPane4.setViewportView(option2);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(600, 470, 410, 120);

        time.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        time.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel1.add(time);
        time.setBounds(1160, 0, 0, 70);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        option4.setEditable(false);
        option4.setColumns(20);
        option4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        option4.setForeground(new java.awt.Color(204, 204, 255));
        option4.setLineWrap(true);
        option4.setRows(5);
        jScrollPane2.setViewportView(option4);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(600, 610, 410, 120);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        option1.setEditable(false);
        option1.setColumns(20);
        option1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        option1.setForeground(new java.awt.Color(204, 204, 255));
        option1.setLineWrap(true);
        option1.setRows(5);
        jScrollPane3.setViewportView(option1);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(120, 470, 430, 120);

        progressbar.setMaximum(600);
        jPanel1.add(progressbar);
        progressbar.setBounds(1060, 100, 270, 20);

        test2.setEditable(false);
        test2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 48)); // NOI18N
        test2.setForeground(new java.awt.Color(204, 204, 255));
        test2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        test2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        test2.setOpaque(false);
        test2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                test2ActionPerformed(evt);
            }
        });
        jPanel1.add(test2);
        test2.setBounds(550, 20, 290, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/1920x1080-indigo-web-solid-color-background.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -40, 1750, 810);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testActionPerformed

    private void test1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_test1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_test1ActionPerformed

    private void test2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_test2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_test2ActionPerformed

    private void optionbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionbActionPerformed

    private void optioncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optioncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optioncActionPerformed

    private void optiondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optiondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optiondActionPerformed

    private void optionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionaActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed
int c=1;
    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
     
    }//GEN-LAST:event_nextMouseClicked

    private void previousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMouseClicked
       if(c==0)
       {
           jLabel4.setEnabled(false);
           previous.setEnabled(true);
          c=1;
       }
        if(c==10)
       {
           jLabel4.setEnabled(true);
           previous.setEnabled(false);
         
       }
       if(c!=0 &&c!=10)
       {
        if(branch.equalsIgnoreCase("COMPUTER SCIENCE AND ENGINEERING")||branch.equalsIgnoreCase("INFORMATION TECHNOLOGY"))
   displayQuestion(a[c++],"cse");
   else if(branch.equalsIgnoreCase("ELECTRICAL ENGINEERING"))
       displayQuestion(a[c++],"eee");
   else if(branch.equalsIgnoreCase("ELECTRONICS AND COMMUNICATION ENGINEERING"))
       displayQuestion(a[c++],"ece");
   else if(branch.equalsIgnoreCase("MECHANICAL ENGINEERING"))
       displayQuestion(a[c++],"me");
   else if(branch.equalsIgnoreCase("CIVIL ENGINEERING"))
       displayQuestion(a[c++],"ce");
        else if(branch.equalsIgnoreCase("APTITUDE"))
       displayQuestion(a[c++],"aptitude");
        else if(branch.equalsIgnoreCase("PRACTICE"))
       displayQuestion(a[c++],"practice");
        else if(branch.equalsIgnoreCase("QUES BANK"))
       displayQuestion(a[c++],"questionbank");
        jLabel4.setEnabled(true);
        previous.setEnabled(true);
       
       }
   
    }//GEN-LAST:event_previousMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
         if(c==0)
       {
           jLabel4.setEnabled(false);
           previous.setEnabled(true);
       }
       if(c==10)
       {
           jLabel4.setEnabled(true);
           previous.setEnabled(false);
           c=9;
       }
        if(c!=0 && c!=10)
       {
        if(branch.equalsIgnoreCase("COMPUTER SCIENCE AND ENGINEERING")||branch.equalsIgnoreCase("INFORMATION TECHNOLOGY"))
   displayQuestion(a[--c],"cse");
   else if(branch.equalsIgnoreCase("ELECTRICAL ENGINEERING"))
       displayQuestion(a[--c],"eee");
   else if(branch.equalsIgnoreCase("ELECTRONICS AND COMMUNICATION ENGINEERING"))
       displayQuestion(a[--c],"ece");
   else if(branch.equalsIgnoreCase("MECHANICAL ENGINEERING"))
       displayQuestion(a[--c],"me");
   else if(branch.equalsIgnoreCase("CIVIL ENGINEERING"))
       displayQuestion(a[--c],"ce");
              else if(branch.equalsIgnoreCase("APTITUDE"))
       displayQuestion(a[--c],"aptitude");
        else if(branch.equalsIgnoreCase("PRACTICE"))
       displayQuestion(a[--c],"practice");
        else if(branch.equalsIgnoreCase("QUES BANK"))
       displayQuestion(a[--c],"questionbank");
        jLabel4.setEnabled(true);
        previous.setEnabled(true);
         
       }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submit1ActionPerformed

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked

        if(optiona.isSelected())
       answer[questionNo]="a";
   if(optionb.isSelected())
       answer[questionNo]="b";
   if(optionc.isSelected())
       answer[questionNo]="c";
   if(optiond.isSelected())
    answer[questionNo]="d";
   if(optiona.isSelected()==false && optionb.isSelected()==false&&optionc.isSelected()==false&&optiond.isSelected()==false)
       answer[questionNo]="0";
   System.out.println(answer[questionNo]);
    }//GEN-LAST:event_submitMouseClicked
public void calculate1()
{
   
    int correct1=0,incorrect=0,unattempted=0;
        for(int i=1;i<11;i++)
       {
           if(answer[i].equals(correct[i]))
               correct1+=1;
           else if(answer[i].equals(correct[i])==false && answer[i].equals("0")==false)
               incorrect+=1;
           else if(answer[i].equals("0"))
               unattempted+=1;
       }
             
              System.out.println("Hello");
       new endpage(correct1,incorrect,ip,test1.getText(),test.getText(),unattempted).setVisible(true);
        this.dispose(); 
}
    private void submit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submit1MouseClicked
     
        calculate1();
      
    }//GEN-LAST:event_submit1MouseClicked
    
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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Time;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel name;
    private javax.swing.JLabel next;
    private javax.swing.JTextArea option1;
    private javax.swing.JTextArea option2;
    private javax.swing.JTextArea option3;
    private javax.swing.JTextArea option4;
    private javax.swing.JRadioButton optiona;
    private javax.swing.JRadioButton optionb;
    private javax.swing.JRadioButton optionc;
    private javax.swing.JRadioButton optiond;
    private javax.swing.JLabel previous;
    private javax.swing.JProgressBar progressbar;
    private javax.swing.JTextArea question;
    private javax.swing.JScrollPane questionpane;
    private javax.swing.JLabel rollno;
    private javax.swing.JTextField submit;
    private javax.swing.JTextField submit1;
    private javax.swing.JTextField test;
    private javax.swing.JTextField test1;
    private javax.swing.JTextField test2;
    private javax.swing.JLabel time;
    private javax.swing.JLabel watermark;
    // End of variables declaration//GEN-END:variables
}
