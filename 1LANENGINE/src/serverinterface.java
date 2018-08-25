  


import java.rmi.Remote;
import java.rmi.RemoteException;






public interface serverinterface extends Remote

{
    void save(String a1, String a2, String a3,String a4,String a5)throws RemoteException; 

     int logincheck(String ln,String lp)throws RemoteException;        
  String[] fetchQuestion(int qno,String branch)throws RemoteException;
  String rollno(String username)throws RemoteException;
  void insertFeedback(String subject,String message,String name,String email)throws RemoteException;
  void insertQuestion(String question,String option1,String option2,String option3,String option4,String branch,String correct)throws RemoteException;
void insertResult(String name,String score,String rollno)throws RemoteException;
}

