package Project;


import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sgsri
 */
public interface LoginInterface extends Remote{
    public boolean check(String id,String pwd)throws RemoteException;
}
