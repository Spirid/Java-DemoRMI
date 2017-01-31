package demormi;


import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerRMI {

    public ServerRMI() {
        try {
            DateTime dt = new DateTimeImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("rmi://localhost:1099/RMIService", dt);
        } catch (RemoteException | AlreadyBoundException ex) {
            System.out.println("Error: " + ex);
        }
    }

    public static void main(String args[]) {
        new ServerRMI();
    }
}
