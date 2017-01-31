package demormi;

import java.rmi.NotBoundException; 
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientRMI {
    
    public static void main(String[] args)
    { 
        try {
            Registry registry = LocateRegistry.getRegistry(1099);
            DateTime  dt = (DateTime) registry.lookup("rmi://localhost:1099/RMIService");
            System.out.println(dt.getDate());
            System.out.println(dt.getTime());
        }
        catch (RemoteException | NotBoundException ex) {
            System.out.println("Error: " + ex);
        }
    }
}
