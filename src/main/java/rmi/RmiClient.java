package rmi;

import java.rmi.Naming;
import java.util.List;

public class RmiClient {
	 public static void main(String[] args){
		 try{
			 PersonService personService=(PersonService)Naming.lookup("rmi://127.0.0.1:6600/PersonService");  
	         List<PersonEntity> personList=personService.getPersons();  
	         for(PersonEntity person:personList){  
	           System.out.println("Age:"+person.getAge()+" Name:"+person.getName());  
	         }  
	        }catch(Exception ex){  
	            ex.printStackTrace();  
	        }  
	    }  
}
