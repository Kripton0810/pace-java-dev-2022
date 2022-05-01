import java.rmi.*;  
import java.rmi.server.*;  

public class AdderRemote extends UnicastRemoteObject implements Adder{
    protected AdderRemote() throws RemoteException {
        super();
        //TODO Auto-generated constructor stub
    }
    public int add(int x,int y)
    {
        return x+y;
    }
    public static void main(String[] args) {
        
    }
}
