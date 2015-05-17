package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl extends UnicastRemoteObject implements PersonService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected PersonServiceImpl() throws RemoteException {
		super();
	}
	public List<PersonEntity> getPersons() throws RemoteException {
		System.out.println("Get Person Start!");  
		List<PersonEntity> list=new ArrayList<PersonEntity>();
		PersonEntity entity1=new PersonEntity();
		PersonEntity entity2=new PersonEntity();
		entity1.setAge(10);
		entity2.setAge(20);
		entity1.setName("joe");
		entity2.setName("Jim");
		list.add(entity2);
		list.add(entity1);
		return list;
	}

}
