package demormi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeImpl extends UnicastRemoteObject implements DateTime {
    
    public DateTimeImpl() throws RemoteException {
        super();
    }
    
    @Override
    public String getDate() throws RemoteException {
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        Date d = new Date();
        return (df.format(d));
       
    }

    @Override
    public String getTime() throws RemoteException {
        DateFormat tf = new SimpleDateFormat("HH:mm:ss");
        Date t = new Date();
        return (tf.format(t));
        
    }
}
