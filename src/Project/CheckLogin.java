package Project;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class CheckLogin extends UnicastRemoteObject implements LoginInterface{
    public CheckLogin()throws Exception{ }
@Override
    public boolean check(String id, String pwd) throws RemoteException 
    {
if(id.equals("abc") && pwd.equals("123"))
return true;
else
return false;
    }
}
