package filter;

import java.util.List;

public class OrCriteria implements Criteria{
	private Criteria criteria;
	private Criteria otherCriteria;
	public OrCriteria(Criteria criteria,Criteria otherCriteria){
		this.criteria=criteria;
		this.otherCriteria=otherCriteria;
	}
	@Override
	public List<Person> meetCriteria(List<Person> list) {
		List<Person> firstCriteria=criteria.meetCriteria(list);
		List<Person> secondeCriteria=otherCriteria.meetCriteria(list);
		for(Person person: secondeCriteria){
			if(!firstCriteria.contains(person)){
				firstCriteria.add(person);
			}				
		}
		return firstCriteria;
	}	

}
