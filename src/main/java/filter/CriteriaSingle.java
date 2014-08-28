package filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria{

	public List<Person> meetCriteria(List<Person> list) {
		List<Person> singlePersons=new ArrayList<Person>();
		for(Person person:list){
			if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}

}
