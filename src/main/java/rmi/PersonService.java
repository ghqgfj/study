package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface PersonService extends Remote{
	List<PersonEntity> getPersons()throws RemoteException; 
}
