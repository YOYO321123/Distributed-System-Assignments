package com.rmiinterface;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface RMIinterface extends Remote{
	public String Primality_Test(String string) throws RemoteException;
	public String Palindrome(String string) throws RemoteException;
	public String Fibonacci(String string) throws RemoteException;
	public String lowToupperTolow(String num) throws RemoteException;
	
	public int GenerateKey(int Ya) throws RemoteException ;
}
