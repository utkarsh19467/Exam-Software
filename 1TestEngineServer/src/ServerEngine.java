



import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class ServerEngine extends UnicastRemoteObject implements serverinterface
{
         
    ArrayList<String> userids=new ArrayList<String>();
    ArrayList<int[]> ques=new ArrayList<int[]>();
    
    
    ServerEngine() throws RemoteException 
    {
        super();
    }
    
   static Statement st;
    public static Connection c;
    public static Statement makeConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection( "jdbc:mysql://localhost:3306/newnetic?useSSL=false","root", "root");
            st = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
        return st;

    } 
    String rollno;
    @Override
    public int logincheck(String username,String password)throws RemoteException
    {
        
     try{
         Statement st=makeConnection();
         ResultSet rs=st.executeQuery("select * from lanengine1 where username='"+username+"'");
       if(rs.next())
       {
           
           String pass=rs.getString(3);
           rollno=rs.getString(5);
           if(!pass.equals(password))
           {
               st.close();
              // c.close();
               return 2;
           }
           else
           {
              
                   st.close();
               //c.close();
               return 3;
           }
           
       }
       else
       {
           st.close();
           //c.close();
           return 1;
       }
         }
         catch(Exception e)
         {System.out.println(e);}
      return 4;
     
    }
    public void insertQuestion(String question,String option1,String option2,String option3,String option4,String branch,String correct)
    {
        ResultSet c;
        try{
           Statement st=makeConnection();
           c=st.executeQuery("select count(*) from "+branch);
           c.next();
           int c1=c.getInt(1);
           System.out.println(c1);
           System.out.println("in");
          c1++;
        st.executeUpdate("insert into "+branch+" values('"+c1+"','"+question+"','"+option1+"','"+option2+"','"+option3+"','"+option4+"','"+correct+"')");
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }
   public void save(String a1,String a2,String a3,String a4,String a5 )
   {
       try{
           System.out.println("in");
            Statement st=makeConnection(); 
       st.executeUpdate("insert into lanengine1 values('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"')");
       
       }
       catch(Exception e){
 
       }
   }
   public void insertResult(String name,String score,String rollno)
   {
       try
       {
         Statement st=makeConnection();
         st.executeUpdate("insert into result values('"+name+"','"+score+"','"+rollno+"')");
         
       }
       catch(Exception e)
       {
           
       }
   }
   public void insertFeedback(String subject,String message,String name,String email)
   {
      
       try{
           Statement st=makeConnection();
           System.out.println("in");
        st.executeUpdate("insert into feedback values('"+subject+"','"+message+"','"+name+"','"+email+"')");
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
   }
   public String rollno(String username)
   {
     return rollno;  
   }
   
    @Override
   public String[] fetchQuestion(int qno,String branch)throws RemoteException
   {
      ResultSet rs;
       String s[]=new String[6];
       Statement st=makeConnection();
     
      try{
      
        rs=st.executeQuery("select * from "+branch+" where qno="+qno);
       if(rs.next())
       {
           s[0]=rs.getString(2);
           s[1]=rs.getString(3);
           s[2]=rs.getString(4);
           s[3]=rs.getString(5);
           s[4]=rs.getString(6);
           s[5]=rs.getString(7);
       }
      
      
   } catch(Exception e)
       {
        System.out.println(e);
       }
       return s; 
      
}
    public static void main(String args[])
            {
                try
                {
                 ServerEngine sc = new ServerEngine();
             Naming.rebind("tag",sc);
                System.setProperty("java.rmi.server.hostname","192.168.56.1");
    
            System.out.println("Yor are succesfully registered to start the portal");
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }

    
}