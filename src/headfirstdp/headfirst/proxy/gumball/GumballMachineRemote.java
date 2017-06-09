package headfirstdp.headfirst.proxy.gumball;

import java.rmi.*;
 
interface GumballMachineRemote extends Remote {
	int getCount() throws RemoteException;
	String getLocation() throws RemoteException;
	State getState() throws RemoteException;
}
