
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shree pc
 */
public class mainimpl {
    
public static void main(String[] args) {
        try {
            ServerEngine sc = new ServerEngine();
             Naming.rebind("tag",sc);
                System.setProperty("java.rmi.server.hostname","192.168.56.1");
    
            System.out.println("Yor are succesfully registered to start the portal");
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }

}
