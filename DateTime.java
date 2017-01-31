package demormi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DateTime extends Remote
{
    String getDate () throws RemoteException;
    String getTime () throws RemoteException;
}
