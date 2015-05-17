package rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RmiServer {
	public static void main(String[] args) {  
        try {  
            PersonService personService=new PersonServiceImpl();  
            LocateRegistry.createRegistry(6600);  
            Naming.rebind("rmi://127.0.0.1:6600/PersonService", personService);  
            System.out.println("Service Start!");  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
	}
}
